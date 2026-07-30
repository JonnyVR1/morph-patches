package p003l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.StickerSource;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l.e51;
import l.jq2;
import l.lsi0;
import l.lsx;
import l.mcr;
import l.mkd0;
import l.ogw;
import l.qib0;
import l.rhi;
import l.roj0;
import l.vwb;
import l.ya5;
import p014rx.C1099c;
import p014rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class js9 extends jq2<ls9> {

    /* JADX INFO: renamed from: a */
    public Media f4720a;

    /* JADX INFO: renamed from: b */
    public Sticker f4721b;

    public js9(mcr mcrVar) {
        super(mcrVar);
        this.f4720a = null;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ Picture m5421g0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Media m5422h0(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m5428n0(Bundle bundle) {
        ((ls9) ((jq2) this).viewModel).m6147d((ArrayList) act().getIntent().getSerializableExtra("selectedImages"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m5429r0(Throwable th) {
        act().progressDismiss();
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            lsi0.w(R.string.m6);
        } else {
            lsi0.w(R.string.g6);
            e51.H(CoreModule.b, new Runnable() { // from class: l.gs9
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.Z.T.z();
                }
            }, 50L);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m5430a0() {
        creates(new e30() { // from class: l.as9
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2268a.m5428n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1099c m5431o0(Media media) {
        if (NullChecker.a(this.f4720a)) {
            return C1099c.just(this.f4720a);
        }
        return TEnum.equals(media.status, "preprocessed") ? ya5.I(vwb.f0(new Media[]{media}), "custom_sticker").map(new w9j() { // from class: l.hs9
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return js9.m5421g0((List) obj);
            }
        }) : C1099c.just(media);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C1099c m5432p0(String str, Media media) {
        this.f4720a = media;
        Sticker stickerNew_ = Sticker.new_();
        this.f4721b = stickerNew_;
        stickerNew_.pictures = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        ((Media) pictureNew_).url = media.url;
        Picture picture = (Picture) media;
        pictureNew_.size = picture.size;
        ((Media) pictureNew_).mediaType = media.mediaType;
        pictureNew_.attachments = new ArrayList();
        Picture pictureNew_2 = Picture.new_();
        ((Media) pictureNew_2).url = media.url;
        pictureNew_2.size = picture.size;
        ((Media) pictureNew_2).mediaType = media.mediaType;
        this.f4721b.pictures.add(pictureNew_);
        pictureNew_.attachments.add(pictureNew_2);
        this.f4721b.source = StickerSource.get("selfCollect");
        try {
            this.f4721b.hash = ogw.d(new File(rhi.z(str)));
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        return CoreModule.c.Z.T.O(this.f4721b);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m5433q0(roj0 roj0Var) {
        if (!vwb.J(this.f4721b.pictures)) {
            qib0.G.x0(((Media) ((Picture) this.f4721b.pictures.get(0))).url);
            if (!vwb.J(((Picture) this.f4721b.pictures.get(0)).attachments)) {
                qib0.G.x0(((Media) ((Picture) ((Picture) this.f4721b.pictures.get(0)).attachments.get(0))).url);
            }
        }
        act().progressDismiss();
        ArrayList arrayList = (ArrayList) act().getIntent().getSerializableExtra("selectedImages");
        if (arrayList.size() > 0) {
            Intent intent = new Intent();
            intent.putExtra("selectedImages", arrayList);
            act().setResult(-1, intent);
        } else {
            act().setResult(0);
        }
        act().finish();
        lsi0.w(R.string.h6);
        e51.H(CoreModule.b, new Runnable() { // from class: l.is9
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.Z.T.z();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: s0 */
    public void m5434s0(Media media) {
        Media mediaClone = media.clone();
        final String str = mediaClone.url;
        act().duringCreated(new lsx(vwb.f0(new Media[]{mediaClone}), 720, 1, Bitmap.CompressFormat.JPEG, true).map(new w9j() { // from class: l.bs9
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return js9.m5422h0((List) obj);
            }
        }).observeOn(Schedulers.m9950io()).flatMap(new w9j() { // from class: l.cs9
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f2767a.m5431o0((Media) obj);
            }
        })).last().flatMap(new w9j() { // from class: l.ds9
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3101a.m5432p0(str, (Media) obj);
            }
        }).observeOn(jo0.m5414a()).subscribe((m250) mkd0.H(new e30() { // from class: l.es9
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3370a.m5433q0((roj0) obj);
            }
        }, new e30() { // from class: l.fs9
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3695a.m5429r0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
