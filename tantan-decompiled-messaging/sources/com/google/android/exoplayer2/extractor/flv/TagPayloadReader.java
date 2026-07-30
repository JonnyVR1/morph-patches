package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import p149l.d860;
import p149l.m6j0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a */
    public final m6j0 f7483a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(m6j0 m6j0Var) {
        this.f7483a = m6j0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9981a(d860 d860Var, long j) throws ParserException {
        return mo9982b(d860Var) && mo9983c(d860Var, j);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo9982b(d860 d860Var) throws ParserException;

    /* JADX INFO: renamed from: c */
    public abstract boolean mo9983c(d860 d860Var, long j) throws ParserException;
}
