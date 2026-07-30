package com.immomo.momo.brotlij;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\n"}, m88121d2 = {"Lcom/immomo/momo/brotlij/Brotli;", "", "<init>", "()V", "Lcom/immomo/momo/brotlij/Brotli$Mode;", "a", "Lcom/immomo/momo/brotlij/Brotli$Mode;", "()Lcom/immomo/momo/brotlij/Brotli$Mode;", "DEFAULT_MODE", "Mode", "brotlij_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class Brotli {
    public static final Brotli INSTANCE = new Brotli();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Mode DEFAULT_MODE = Mode.GENERIC;

    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m88121d2 = {"Lcom/immomo/momo/brotlij/Brotli$Mode;", "", "mode", "", "(Ljava/lang/String;II)V", "getMode", "()I", "setMode", "(I)V", "GENERIC", "TEXT", "FONT", "brotlij_release"}, m88122k = 1, m88123mv = {1, 1, 16})
    public enum Mode {
        GENERIC(0),
        TEXT(1),
        FONT(2);

        private int mode;

        Mode(int i) {
            this.mode = i;
        }

        public final int getMode() {
            return this.mode;
        }

        public final void setMode(int i) {
            this.mode = i;
        }
    }

    static {
        System.loadLibrary("brotli");
    }

    private Brotli() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Mode m20015a() {
        return DEFAULT_MODE;
    }
}
