package com.p046p1.mobile.putong.live.external.intl.feedback.bean;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.data.Answer;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class IntlFeedbackPageData extends BaseLiveBean {

    @SerializedName("conversationId")
    private String conversationId;

    @SerializedName("feedbackUrl")
    private String feedbackUrl;

    @SerializedName("gradeLimit")
    private Integer gradeLimit;

    @SerializedName("groups")
    private List<GroupsDTO> groups;

    public static class GroupsDTO {

        @SerializedName("faqList")
        private List<FaqListDTO> faqList;

        @SerializedName("title")
        private String title;

        public static class FaqListDTO {

            @SerializedName(Answer.TYPE)
            private String answer;

            @SerializedName("isUnFold")
            private boolean isUnFold;

            @SerializedName("question")
            private String question;

            public String getAnswer() {
                return this.answer;
            }

            public String getQuestion() {
                return this.question;
            }

            public boolean isUnFold() {
                return this.isUnFold;
            }

            public void setAnswer(String str) {
                this.answer = str;
            }

            public void setQuestion(String str) {
                this.question = str;
            }

            public void setUnFold(boolean z) {
                this.isUnFold = z;
            }
        }

        public List<FaqListDTO> getFaqList() {
            return this.faqList;
        }

        public String getTitle() {
            return this.title;
        }

        public void setFaqList(List<FaqListDTO> list) {
            this.faqList = list;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public String getFeedbackUrl() {
        return this.feedbackUrl;
    }

    public Integer getGradeLimit() {
        return this.gradeLimit;
    }

    public List<GroupsDTO> getGroups() {
        return this.groups;
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setFeedbackUrl(String str) {
        this.feedbackUrl = str;
    }

    public void setGradeLimit(Integer num) {
        this.gradeLimit = num;
    }

    public void setGroups(List<GroupsDTO> list) {
        this.groups = list;
    }
}
