package p153l;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.BasePool;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(21)
public class sg3 extends BasePool<Bitmap> implements v23 {
    public sg3(gqy gqyVar, bj80 bj80Var, cj80 cj80Var, boolean z) {
        super(gqyVar, bj80Var, cj80Var, z);
        m8474s();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Bitmap mo8462g(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo8466k(Bitmap bitmap) {
        wn80.m207182g(bitmap);
        bitmap.recycle();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int mo8470o(Bitmap bitmap) {
        wn80.m207182g(bitmap);
        return bitmap.getAllocationByteCount();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Bitmap mo8472q(pg3<Bitmap> pg3Var) {
        Bitmap bitmap = (Bitmap) super.mo8472q(pg3Var);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo8476u(Bitmap bitmap) {
        wn80.m207182g(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: n */
    public int mo8469n(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.BasePool
    /* JADX INFO: renamed from: p */
    public int mo8471p(int i) {
        return i;
    }
}
