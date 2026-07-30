package com.p046p1.mobile.putong.core.p053ui.profile.loop;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class LoopEditInfo implements Serializable {
    public String defaultContent;
    public String editHint;
    public String editObjKey;
    public boolean isHarmonyTest;
    public LoopInputType loopInputType;
    public int maxInput;
    public String multiType;
    public String subTitle;
    public String title;
    public boolean showTitle = false;
    public boolean editTitle = false;
    public boolean couldInputEmpty = false;
    public String questionId = null;

    public static LoopEditInfo getCreateTagInfo(LoopInputType loopInputType, String str, int i, String str2) {
        LoopEditInfo loopEditInfo = new LoopEditInfo();
        loopEditInfo.title = str;
        loopEditInfo.loopInputType = loopInputType;
        loopEditInfo.maxInput = i;
        loopEditInfo.editHint = str2;
        loopEditInfo.showTitle = false;
        return loopEditInfo;
    }

    public LoopEditInfo setDefaultContent(String str) {
        this.defaultContent = str;
        return this;
    }

    public LoopEditInfo setEditObjKey(String str) {
        this.editObjKey = str;
        return this;
    }

    public LoopEditInfo setEmptyInput(boolean z) {
        this.couldInputEmpty = z;
        return this;
    }

    public LoopEditInfo setHarmonyTest(boolean z) {
        this.isHarmonyTest = z;
        return this;
    }

    public void setMultiType(String str) {
        this.multiType = str;
    }

    public void setQuestionId(String str) {
        this.questionId = str;
    }

    public LoopEditInfo setSubTitle(String str, boolean z) {
        this.subTitle = str;
        this.editTitle = z;
        return this;
    }
}
