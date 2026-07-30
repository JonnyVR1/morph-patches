package com.p051p1.mobile.putong.core.p058ui.profile.loop.base;

/* JADX INFO: loaded from: classes4.dex */
public class LoopSelectFillData {

    /* JADX INFO: renamed from: a */
    public boolean f34289a;

    /* JADX INFO: renamed from: b */
    public LoopSelectType f34290b;

    /* JADX INFO: renamed from: c */
    public String f34291c;

    /* JADX INFO: renamed from: d */
    public String f34292d;

    /* JADX INFO: renamed from: e */
    public String f34293e;

    /* JADX INFO: renamed from: f */
    public boolean f34294f;

    public enum LoopSelectType {
        INPUT_ENTRY,
        SELECT_INFO,
        CHECK_BOX,
        SELECT_OVERSEAS,
        SELECT_OTHER,
        SELECT_JUST_TEXT
    }

    public LoopSelectFillData(String str, String str2, LoopSelectType loopSelectType) {
        this.f34289a = false;
        LoopSelectType loopSelectType2 = LoopSelectType.INPUT_ENTRY;
        this.f34294f = false;
        this.f34291c = str2;
        this.f34290b = loopSelectType;
        this.f34292d = str2;
        this.f34293e = str;
    }

    /* JADX INFO: renamed from: a */
    public String m52758a() {
        return this.f34291c;
    }

    /* JADX INFO: renamed from: b */
    public String m52759b() {
        return this.f34293e;
    }

    /* JADX INFO: renamed from: c */
    public String m52760c() {
        return this.f34292d;
    }

    /* JADX INFO: renamed from: d */
    public LoopSelectType m52761d() {
        return this.f34290b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m52762e() {
        return this.f34290b == LoopSelectType.INPUT_ENTRY;
    }

    /* JADX INFO: renamed from: f */
    public boolean m52763f() {
        return this.f34289a;
    }

    /* JADX INFO: renamed from: g */
    public LoopSelectFillData m52764g() {
        this.f34290b = LoopSelectType.CHECK_BOX;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public LoopSelectFillData m52765h(String str) {
        this.f34291c = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public LoopSelectFillData m52766i(boolean z) {
        this.f34289a = z;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public LoopSelectFillData m52767j() {
        this.f34294f = true;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public boolean m52768k() {
        return this.f34294f;
    }

    public LoopSelectFillData(String str, LoopSelectType loopSelectType) {
        this("", str, loopSelectType);
    }

    public LoopSelectFillData(String str) {
        this(str, LoopSelectType.SELECT_INFO);
    }
}
