package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C1057a;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.p051p1.mobile.putong.core.data.Target;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/qpd;", "Ll/nvl;", "<init>", "()V", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "", "roundPx", "", "a", "(Ljava/lang/String;Landroid/widget/ImageView;I)V", "Ll/vim;", "callback", "b", "(Ljava/lang/String;Ll/vim;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class qpd implements nvl {

    /* JADX INFO: renamed from: l.qpd$a */
    @Metadata(m88120d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J;\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u0010\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012¸\u0006\u0000"}, m88121d2 = {"com/hellogroup/mk/business/impl/DefaultImageLoader$loadImage$2$1", "Ll/l2d0;", "Landroid/graphics/Bitmap;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", "model", "Ll/cli0;", Target.TYPE, "", "isFirstResource", "b", "(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Ll/cli0;Z)Z", "resource", "LLcom/bumptech/glide/load/DataSource;;", "dataSource", "onResourceReady", "(Landroid/graphics/Bitmap;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;LLcom/bumptech/glide/load/DataSource;;Z)Z", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C19622a implements l2d0<Bitmap> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f158854a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ vim f158855b;

        public C19622a(String str, vim vimVar) {
            this.f158854a = str;
            this.f158855b = vimVar;
        }

        @Override // p153l.l2d0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean mo119082f(@Nullable Bitmap bitmap, @Nullable Object obj, @Nullable cli0<Bitmap> cli0Var, @Nullable DataSource dataSource, boolean z) {
            vim vimVar = this.f158855b;
            if (vimVar == null) {
                return true;
            }
            vimVar.mo18019a(this.f158854a, bitmap);
            return true;
        }

        @Override // p153l.l2d0
        /* JADX INFO: renamed from: b */
        public boolean mo119081b(@Nullable GlideException e, @Nullable Object model, @Nullable cli0<Bitmap> target, boolean isFirstResource) {
            vim vimVar = this.f158855b;
            if (vimVar == null) {
                return true;
            }
            vimVar.onFailed(this.f158854a);
            return true;
        }
    }

    /* JADX INFO: renamed from: l.qpd$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/qpd$b", "Ll/ypf0;", "Landroid/graphics/Bitmap;", "resource", "Ll/zgj0;", "transition", "", "b", "(Landroid/graphics/Bitmap;Ll/zgj0;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class C19623b extends ypf0<Bitmap> {
        @Override // p153l.cli0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo104924i(@NotNull Bitmap resource, @Nullable zgj0<? super Bitmap> transition) {
            resource.getClass();
        }
    }

    @Override // p153l.nvl
    /* JADX INFO: renamed from: a */
    public void mo134606a(@Nullable String imageUrl, @Nullable ImageView imageView, int roundPx) {
        if (imageView != null) {
            ComponentCallbacks2C1057a.m5326u(imageView).m156813h().m155558j0(new gnd0(roundPx)).m95642D0(imageUrl).m95652x0(imageView);
        }
    }

    @Override // p153l.nvl
    /* JADX INFO: renamed from: b */
    public void mo134607b(@Nullable String imageUrl, @Nullable vim callback) {
        Context context = lv0.f133670a;
        if (context != null) {
        }
    }
}
