package p149l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BasePool;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public class eg3 extends BasePool<Bitmap> implements f23 {
    public eg3(jhy jhyVar, va80 va80Var, wa80 wa80Var, boolean z) {
        super(jhyVar, va80Var, wa80Var, z);
        m8420s();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Bitmap mo8408g(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo8412k(Bitmap bitmap) {
        rf80.m179116g(bitmap);
        bitmap.recycle();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo8416o(Bitmap bitmap) {
        rf80.m179116g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Bitmap mo8418q(bg3<Bitmap> bg3Var) {
        Bitmap bitmap = (Bitmap) super.mo8418q(bg3Var);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo8422u(Bitmap bitmap) {
        rf80.m179116g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n */
    public int mo8415n(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: p */
    public int mo8417p(int i) {
        return i;
    }
}
