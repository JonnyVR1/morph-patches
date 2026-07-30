package com.p000p1.mobile.putong.core.p001ui.profile.loop.base;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LoopSelectFillData {

    /* JADX INFO: renamed from: a */
    public boolean f1263a;

    /* JADX INFO: renamed from: b */
    public LoopSelectType f1264b;

    /* JADX INFO: renamed from: c */
    public String f1265c;

    /* JADX INFO: renamed from: d */
    public String f1266d;

    /* JADX INFO: renamed from: e */
    public String f1267e;

    /* JADX INFO: renamed from: f */
    public boolean f1268f;

    public enum LoopSelectType {
        INPUT_ENTRY,
        SELECT_INFO,
        CHECK_BOX,
        SELECT_OVERSEAS,
        SELECT_OTHER,
        SELECT_JUST_TEXT
    }

    public LoopSelectFillData(String str, String str2, LoopSelectType loopSelectType) {
        this.f1263a = false;
        LoopSelectType loopSelectType2 = LoopSelectType.INPUT_ENTRY;
        this.f1268f = false;
        this.f1265c = str2;
        this.f1264b = loopSelectType;
        this.f1266d = str2;
        this.f1267e = str;
    }

    /* JADX INFO: renamed from: a */
    public String m2061a() {
        return this.f1265c;
    }

    /* JADX INFO: renamed from: b */
    public String m2062b() {
        return this.f1267e;
    }

    /* JADX INFO: renamed from: c */
    public String m2063c() {
        return this.f1266d;
    }

    /* JADX INFO: renamed from: d */
    public LoopSelectType m2064d() {
        return this.f1264b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m2065e() {
        return this.f1264b == LoopSelectType.INPUT_ENTRY;
    }

    /* JADX INFO: renamed from: f */
    public boolean m2066f() {
        return this.f1263a;
    }

    /* JADX INFO: renamed from: g */
    public LoopSelectFillData m2067g() {
        this.f1264b = LoopSelectType.CHECK_BOX;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public LoopSelectFillData m2068h(String str) {
        this.f1265c = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public LoopSelectFillData m2069i(boolean z) {
        this.f1263a = z;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public LoopSelectFillData m2070j() {
        this.f1268f = true;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public boolean m2071k() {
        return this.f1268f;
    }

    public LoopSelectFillData(String str, LoopSelectType loopSelectType) {
        this("", str, loopSelectType);
    }

    public LoopSelectFillData(String str) {
        this(str, LoopSelectType.SELECT_INFO);
    }
}
