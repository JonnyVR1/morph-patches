package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import p153l.ig60;
import p153l.qfj0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class TagPayloadReader {

    /* JADX INFO: renamed from: a */
    public final qfj0 f7520a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(qfj0 qfj0Var) {
        this.f7520a = qfj0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10035a(ig60 ig60Var, long j) throws ParserException {
        return mo10036b(ig60Var) && mo10037c(ig60Var, j);
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo10036b(ig60 ig60Var) throws ParserException;

    /* JADX INFO: renamed from: c */
    public abstract boolean mo10037c(ig60 ig60Var, long j) throws ParserException;
}
