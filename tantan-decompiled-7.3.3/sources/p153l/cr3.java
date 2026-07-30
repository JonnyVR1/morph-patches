package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.C1062a;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class cr3 implements z3d0<ByteBuffer, bnj> {

    /* JADX INFO: renamed from: f */
    private static final C16342a f83282f = new C16342a();

    /* JADX INFO: renamed from: g */
    private static final C16343b f83283g = new C16343b();

    /* JADX INFO: renamed from: a */
    private final Context f83284a;

    /* JADX INFO: renamed from: b */
    private final List<ImageHeaderParser> f83285b;

    /* JADX INFO: renamed from: c */
    private final C16343b f83286c;

    /* JADX INFO: renamed from: d */
    private final C16342a f83287d;

    /* JADX INFO: renamed from: e */
    private final zmj f83288e;

    /* JADX INFO: renamed from: l.cr3$a */
    @VisibleForTesting
    public static class C16342a {
        /* JADX INFO: renamed from: a */
        public anj m112025a(anj.InterfaceC15750a interfaceC15750a, jnj jnjVar, ByteBuffer byteBuffer, int i) {
            return new p1g0(interfaceC15750a, jnjVar, byteBuffer, i);
        }
    }

    /* JADX INFO: renamed from: l.cr3$b */
    @VisibleForTesting
    public static class C16343b {

        /* JADX INFO: renamed from: a */
        private final Queue<knj> f83289a = ylk0.m216582f(0);

        /* JADX INFO: renamed from: a */
        public synchronized knj m112026a(ByteBuffer byteBuffer) {
            knj knjVarPoll;
            try {
                knjVarPoll = this.f83289a.poll();
                if (knjVarPoll == null) {
                    knjVarPoll = new knj();
                }
            } catch (Throwable th) {
                throw th;
            }
            return knjVarPoll.m150539p(byteBuffer);
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m112027b(knj knjVar) {
            knjVar.m150537a();
            this.f83289a.offer(knjVar);
        }
    }

    @VisibleForTesting
    public cr3(Context context, List<ImageHeaderParser> list, w23 w23Var, o01 o01Var, C16343b c16343b, C16342a c16342a) {
        this.f83284a = context.getApplicationContext();
        this.f83285b = list;
        this.f83287d = c16342a;
        this.f83288e = new zmj(w23Var, o01Var);
        this.f83286c = c16343b;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    private enj m112021c(ByteBuffer byteBuffer, int i, int i2, knj knjVar, u560 u560Var) {
        long jM142879b = izv.m142879b();
        try {
            jnj jnjVarM150538c = knjVar.m150538c();
            if (jnjVarM150538c.m146244b() > 0 && jnjVarM150538c.m146245c() == 0) {
                Bitmap.Config config = u560Var.m194542c(lnj.f132825a) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                anj anjVarM112025a = this.f83287d.m112025a(this.f83288e, jnjVarM150538c, byteBuffer, m112022e(jnjVarM150538c, i, i2));
                anjVarM112025a.mo98984a(config);
                anjVarM112025a.advance();
                Bitmap nextFrame = anjVarM112025a.getNextFrame();
                if (nextFrame == null) {
                    return null;
                }
                return new enj(new bnj(this.f83284a, anjVarM112025a, ayj0.m100876c(), i, i2, nextFrame));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                izv.m142878a(jM142879b);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static int m112022e(jnj jnjVar, int i, int i2) {
        int iMin = Math.min(jnjVar.m146243a() / i2, jnjVar.m146246d() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            jnjVar.m146246d();
            jnjVar.m146243a();
        }
        return iMax;
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public enj mo5554b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull u560 u560Var) {
        knj knjVarM112026a = this.f83286c.m112026a(byteBuffer);
        try {
            return m112021c(byteBuffer, i, i2, knjVarM112026a, u560Var);
        } finally {
            this.f83286c.m112027b(knjVarM112026a);
        }
    }

    @Override // p153l.z3d0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo5553a(@NonNull ByteBuffer byteBuffer, @NonNull u560 u560Var) throws IOException {
        return !((Boolean) u560Var.m194542c(lnj.f132826b)).booleanValue() && C1062a.m5364g(this.f83285b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public cr3(Context context, List<ImageHeaderParser> list, w23 w23Var, o01 o01Var) {
        this(context, list, w23Var, o01Var, f83283g, f83282f);
    }
}
