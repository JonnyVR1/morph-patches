package com.p046p1.mobile.putong.core.p053ui.profile.loop.base;

/* JADX INFO: loaded from: classes4.dex */
public class LoopSelectFillData {

    /* JADX INFO: renamed from: a */
    public boolean f33441a;

    /* JADX INFO: renamed from: b */
    public LoopSelectType f33442b;

    /* JADX INFO: renamed from: c */
    public String f33443c;

    /* JADX INFO: renamed from: d */
    public String f33444d;

    /* JADX INFO: renamed from: e */
    public String f33445e;

    /* JADX INFO: renamed from: f */
    public boolean f33446f;

    public enum LoopSelectType {
        INPUT_ENTRY,
        SELECT_INFO,
        CHECK_BOX,
        SELECT_OVERSEAS,
        SELECT_OTHER,
        SELECT_JUST_TEXT
    }

    public LoopSelectFillData(String str, String str2, LoopSelectType loopSelectType) {
        this.f33441a = false;
        LoopSelectType loopSelectType2 = LoopSelectType.INPUT_ENTRY;
        this.f33446f = false;
        this.f33443c = str2;
        this.f33442b = loopSelectType;
        this.f33444d = str2;
        this.f33445e = str;
    }

    /* JADX INFO: renamed from: a */
    public String m51575a() {
        return this.f33443c;
    }

    /* JADX INFO: renamed from: b */
    public String m51576b() {
        return this.f33445e;
    }

    /* JADX INFO: renamed from: c */
    public String m51577c() {
        return this.f33444d;
    }

    /* JADX INFO: renamed from: d */
    public LoopSelectType m51578d() {
        return this.f33442b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m51579e() {
        return this.f33442b == LoopSelectType.INPUT_ENTRY;
    }

    /* JADX INFO: renamed from: f */
    public boolean m51580f() {
        return this.f33441a;
    }

    /* JADX INFO: renamed from: g */
    public LoopSelectFillData m51581g() {
        this.f33442b = LoopSelectType.CHECK_BOX;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public LoopSelectFillData m51582h(String str) {
        this.f33443c = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public LoopSelectFillData m51583i(boolean z) {
        this.f33441a = z;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public LoopSelectFillData m51584j() {
        this.f33446f = true;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public boolean m51585k() {
        return this.f33446f;
    }

    public LoopSelectFillData(String str, LoopSelectType loopSelectType) {
        this("", str, loopSelectType);
    }

    public LoopSelectFillData(String str) {
        this(str, LoopSelectType.SELECT_INFO);
    }
}
