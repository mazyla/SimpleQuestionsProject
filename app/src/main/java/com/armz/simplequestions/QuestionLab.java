package com.armz.simplequestions;



import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by augustowong on 12/9/17.
 */

public class QuestionLab {
    private static QuestionLab sQuestionLab;
    private List<Question> mQuestions;

    private QuestionLab(Context context){
        mQuestions = new ArrayList<Question>();

        for(int i= 0; i<20; i++){

            Question newQ = new Question("Question","Answer",false, i);
            mQuestions.add(newQ);
        }
    }


    public static QuestionLab get(Context context){
        if (sQuestionLab == null){
            sQuestionLab = new QuestionLab(context);
        }
        return  sQuestionLab;
    }

    public List<Question> getQuestions(){
        return mQuestions;
    }

    public Question getQuestion(int id){
        for(Question curQuestion: mQuestions){
            if(curQuestion.getID() == id){
                return curQuestion;
            }
        }

        return null;
    }

}
