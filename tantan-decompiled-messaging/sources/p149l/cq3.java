package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.C1056a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class cq3 implements wvc0<ByteBuffer, lkj> {

    /* JADX INFO: renamed from: f */
    private static final C16210a f82017f = new C16210a();

    /* JADX INFO: renamed from: g */
    private static final C16211b f82018g = new C16211b();

    /* JADX INFO: renamed from: a */
    private final Context f82019a;

    /* JADX INFO: renamed from: b */
    private final List<ImageHeaderParser> f82020b;

    /* JADX INFO: renamed from: c */
    private final C16211b f82021c;

    /* JADX INFO: renamed from: d */
    private final C16210a f82022d;

    /* JADX INFO: renamed from: e */
    private final jkj f82023e;

    /* JADX INFO: renamed from: l.cq3$a */
    @VisibleForTesting
    public static class C16210a {
        /* JADX INFO: renamed from: a */
        public kkj m108222a(kkj.InterfaceC18040a interfaceC18040a, tkj tkjVar, ByteBuffer byteBuffer, int i) {
            return new gtf0(interfaceC18040a, tkjVar, byteBuffer, i);
        }
    }

    /* JADX INFO: renamed from: l.cq3$b */
    @VisibleForTesting
    public static class C16211b {

        /* JADX INFO: renamed from: a */
        private final Queue<ukj> f82024a = sck0.m183406f(0);

        /* JADX INFO: renamed from: a */
        public synchronized ukj m108223a(ByteBuffer byteBuffer) {
            ukj ukjVarPoll;
            try {
                ukjVarPoll = this.f82024a.poll();
                if (ukjVarPoll == null) {
                    ukjVarPoll = new ukj();
                }
            } catch (Throwable th) {
                throw th;
            }
            return ukjVarPoll.m194172p(byteBuffer);
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m108224b(ukj ukjVar) {
            ukjVar.m194170a();
            this.f82024a.offer(ukjVar);
        }
    }

    @VisibleForTesting
    public cq3(Context context, List<ImageHeaderParser> list, g23 g23Var, h01 h01Var, C16211b c16211b, C16210a c16210a) {
        this.f82019a = context.getApplicationContext();
        this.f82020b = list;
        this.f82022d = c16210a;
        this.f82023e = new jkj(g23Var, h01Var);
        this.f82021c = c16211b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    private okj m108218c(ByteBuffer byteBuffer, int i, int i2, ukj ukjVar, px50 px50Var) {
        long jM147808b = kxv.m147808b();
        try {
            tkj tkjVarM194171c = ukjVar.m194171c();
            if (tkjVarM194171c.m189483b() > 0 && tkjVarM194171c.m189484c() == 0) {
                Bitmap.Config config = px50Var.m171822c(vkj.f181820a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                kkj kkjVarM108222a = this.f82022d.m108222a(this.f82023e, tkjVarM194171c, byteBuffer, m108219e(tkjVarM194171c, i, i2));
                kkjVarM108222a.mo127937a(config);
                kkjVarM108222a.advance();
                Bitmap nextFrame = kkjVarM108222a.getNextFrame();
                if (nextFrame == null) {
                    return null;
                }
                return new okj(new lkj(this.f82019a, kkjVarM108222a, xoj0.m210432c(), i, i2, nextFrame));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                kxv.m147807a(jM147808b);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m108219e(tkj tkjVar, int i, int i2) {
        int iMin = Math.min(tkjVar.m189482a() / i2, tkjVar.m189485d() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            tkjVar.m189485d();
            tkjVar.m189482a();
        }
        return iMax;
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public okj mo5553b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull px50 px50Var) {
        ukj ukjVarM108223a = this.f82021c.m108223a(byteBuffer);
        try {
            return m108218c(byteBuffer, i, i2, ukjVarM108223a, px50Var);
        } finally {
            this.f82021c.m108224b(ukjVarM108223a);
        }
    }

    @Override // p149l.wvc0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo5552a(@NonNull ByteBuffer byteBuffer, @NonNull px50 px50Var) throws IOException {
        return !((Boolean) px50Var.m171822c(vkj.f181821b)).booleanValue() && C1056a.m5349e(this.f82020b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public cq3(Context context, List<ImageHeaderParser> list, g23 g23Var, h01 h01Var) {
        this(context, list, g23Var, h01Var, f82018g, f82017f);
    }
}
