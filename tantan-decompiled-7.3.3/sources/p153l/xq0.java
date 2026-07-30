package p153l;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.C1062a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class xq0 {

    /* JADX INFO: renamed from: a */
    private final List<ImageHeaderParser> f195765a;

    /* JADX INFO: renamed from: b */
    private final o01 f195766b;

    /* JADX INFO: renamed from: l.xq0$a */
    public static final class C21416a implements u3d0<Drawable> {

        /* JADX INFO: renamed from: a */
        private final AnimatedImageDrawable f195767a;

        public C21416a(AnimatedImageDrawable animatedImageDrawable) {
            this.f195767a = animatedImageDrawable;
        }

        @Override // p153l.u3d0
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f195767a;
        }

        @Override // p153l.u3d0
        @NonNull
        public Class<Drawable> getResourceClass() {
            return Drawable.class;
        }

        @Override // p153l.u3d0
        public int getSize() {
            return this.f195767a.getIntrinsicWidth() * this.f195767a.getIntrinsicHeight() * ylk0.m216585i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p153l.u3d0
        public void recycle() {
            this.f195767a.stop();
            this.f195767a.clearAnimationCallbacks();
        }
    }

    /* JADX INFO: renamed from: l.xq0$b */
    public static final class C21417b implements z3d0<ByteBuffer, Drawable> {

        /* JADX INFO: renamed from: a */
        private final xq0 f195768a;

        public C21417b(xq0 xq0Var) {
            this.f195768a = xq0Var;
        }

        @Override // p153l.z3d0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public u3d0<Drawable> mo5554b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull u560 u560Var) throws IOException {
            return this.f195768a.m212699b(ImageDecoder.createSource(byteBuffer), i, i2, u560Var);
        }

        @Override // p153l.z3d0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo5553a(@NonNull ByteBuffer byteBuffer, @NonNull u560 u560Var) throws IOException {
            return this.f195768a.m212701d(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: l.xq0$c */
    public static final class C21418c implements z3d0<InputStream, Drawable> {

        /* JADX INFO: renamed from: a */
        private final xq0 f195769a;

        public C21418c(xq0 xq0Var) {
            this.f195769a = xq0Var;
        }

        @Override // p153l.z3d0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public u3d0<Drawable> mo5554b(@NonNull InputStream inputStream, int i, int i2, @NonNull u560 u560Var) throws IOException {
            return this.f195769a.m212699b(ImageDecoder.createSource(er3.m122095b(inputStream)), i, i2, u560Var);
        }

        @Override // p153l.z3d0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo5553a(@NonNull InputStream inputStream, @NonNull u560 u560Var) throws IOException {
            return this.f195769a.m212700c(inputStream);
        }
    }

    private xq0(List<ImageHeaderParser> list, o01 o01Var) {
        this.f195765a = list;
        this.f195766b = o01Var;
    }

    /* JADX INFO: renamed from: a */
    public static z3d0<ByteBuffer, Drawable> m212696a(List<ImageHeaderParser> list, o01 o01Var) {
        return new C21417b(new xq0(list, o01Var));
    }

    /* JADX INFO: renamed from: e */
    private boolean m212697e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    /* JADX INFO: renamed from: f */
    public static z3d0<InputStream, Drawable> m212698f(List<ImageHeaderParser> list, o01 o01Var) {
        return new C21418c(new xq0(list, o01Var));
    }

    /* JADX INFO: renamed from: b */
    public u3d0<Drawable> m212699b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull u560 u560Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new drd(i, i2, u560Var));
        if (rq0.m182570a(drawableDecodeDrawable)) {
            return new C21416a(sq0.m187503a(drawableDecodeDrawable));
        }
        bol.m105705a("Received unexpected drawable type for animated webp, failing: ", drawableDecodeDrawable);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m212700c(InputStream inputStream) throws IOException {
        return m212697e(C1062a.m5363f(this.f195765a, inputStream, this.f195766b));
    }

    /* JADX INFO: renamed from: d */
    public boolean m212701d(ByteBuffer byteBuffer) throws IOException {
        return m212697e(C1062a.m5364g(this.f195765a, byteBuffer));
    }
}
