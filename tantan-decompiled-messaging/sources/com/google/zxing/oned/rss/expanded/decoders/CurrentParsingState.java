package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes7.dex */
public final class CurrentParsingState {

    /* JADX INFO: renamed from: a */
    public int f11666a = 0;

    /* JADX INFO: renamed from: b */
    public State f11667b = State.NUMERIC;

    public enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: renamed from: a */
    public int m17348a() {
        return this.f11666a;
    }

    /* JADX INFO: renamed from: b */
    public void m17349b(int i) {
        this.f11666a += i;
    }

    /* JADX INFO: renamed from: c */
    public boolean m17350c() {
        return this.f11667b == State.ALPHA;
    }

    /* JADX INFO: renamed from: d */
    public boolean m17351d() {
        return this.f11667b == State.ISO_IEC_646;
    }

    /* JADX INFO: renamed from: e */
    public void m17352e() {
        this.f11667b = State.ALPHA;
    }

    /* JADX INFO: renamed from: f */
    public void m17353f() {
        this.f11667b = State.ISO_IEC_646;
    }

    /* JADX INFO: renamed from: g */
    public void m17354g() {
        this.f11667b = State.NUMERIC;
    }

    /* JADX INFO: renamed from: h */
    public void m17355h(int i) {
        this.f11666a = i;
    }
}
