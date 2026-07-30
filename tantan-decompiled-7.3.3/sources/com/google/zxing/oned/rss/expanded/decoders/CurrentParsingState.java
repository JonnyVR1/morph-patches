package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes7.dex */
public final class CurrentParsingState {

    /* JADX INFO: renamed from: a */
    public int f11703a = 0;

    /* JADX INFO: renamed from: b */
    public State f11704b = State.NUMERIC;

    public enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: renamed from: a */
    public int m17403a() {
        return this.f11703a;
    }

    /* JADX INFO: renamed from: b */
    public void m17404b(int i) {
        this.f11703a += i;
    }

    /* JADX INFO: renamed from: c */
    public boolean m17405c() {
        return this.f11704b == State.ALPHA;
    }

    /* JADX INFO: renamed from: d */
    public boolean m17406d() {
        return this.f11704b == State.ISO_IEC_646;
    }

    /* JADX INFO: renamed from: e */
    public void m17407e() {
        this.f11704b = State.ALPHA;
    }

    /* JADX INFO: renamed from: f */
    public void m17408f() {
        this.f11704b = State.ISO_IEC_646;
    }

    /* JADX INFO: renamed from: g */
    public void m17409g() {
        this.f11704b = State.NUMERIC;
    }

    /* JADX INFO: renamed from: h */
    public void m17410h(int i) {
        this.f11703a = i;
    }
}
