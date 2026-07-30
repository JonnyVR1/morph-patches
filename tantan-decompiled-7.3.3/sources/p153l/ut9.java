package p153l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.StickerSource;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes3.dex */
public class ut9 extends ar2<wt9> {

    /* JADX INFO: renamed from: a */
    public Media f180898a;

    /* JADX INFO: renamed from: b */
    public Sticker f180899b;

    public ut9(ner nerVar) {
        super(nerVar);
        this.f180898a = null;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ Picture m197964g0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Media m197965h0(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m197971n0(Bundle bundle) {
        ((wt9) this.viewModel).m207826d((ArrayList) act().getIntent().getSerializableExtra("selectedImages"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m197972r0(Throwable th) {
        act().progressDismiss();
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            o1j0.m165649w(R$string.f21773m6);
        } else {
            o1j0.m165649w(R$string.f21719g6);
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.rt9
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20366Z.f20885T.m159280q();
                }
            }, 50L);
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.lt9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133531a.m197971n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22421c m197973o0(Media media) {
        if (NullChecker.m82486a(this.f180898a)) {
            return C22421c.just(this.f180898a);
        }
        return TEnum.equals(media.status, MediaLocalStatus.preprocessed) ? yb5.m214980I(jyb.m147507f0(media), "custom_sticker").map(new qcj() { // from class: l.st9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ut9.m197964g0((List) obj);
            }
        }) : C22421c.just(media);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22421c m197974p0(String str, Media media) {
        this.f180898a = media;
        Sticker stickerNew_ = Sticker.new_();
        this.f180899b = stickerNew_;
        stickerNew_.pictures = new ArrayList();
        Picture pictureNew_ = Picture.new_();
        pictureNew_.url = media.url;
        Picture picture = (Picture) media;
        pictureNew_.size = picture.size;
        pictureNew_.mediaType = media.mediaType;
        pictureNew_.attachments = new ArrayList();
        Picture pictureNew_2 = Picture.new_();
        pictureNew_2.url = media.url;
        pictureNew_2.size = picture.size;
        pictureNew_2.mediaType = media.mediaType;
        this.f180899b.pictures.add(pictureNew_);
        pictureNew_.attachments.add(pictureNew_2);
        this.f180899b.source = StickerSource.get("selfCollect");
        try {
            this.f180899b.hash = niw.m163314d(new File(oki.m168038z(str)));
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        return CoreModule.f18264c.f20366Z.f20885T.m35953O(this.f180899b);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m197975q0(uxj0 uxj0Var) {
        if (!jyb.m147479J(this.f180899b.pictures)) {
            uqb0.f180374G.m127160x0(this.f180899b.pictures.get(0).url);
            if (!jyb.m147479J(this.f180899b.pictures.get(0).attachments)) {
                uqb0.f180374G.m127160x0(this.f180899b.pictures.get(0).attachments.get(0).url);
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
        act().lambda$debugItems$19();
        o1j0.m165649w(R$string.f21728h6);
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.tt9
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20366Z.f20885T.m159280q();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: s0 */
    public void m197976s0(Media media) {
        Media mediaMo225055clone = media.mo225055clone();
        final String str = mediaMo225055clone.url;
        act().duringCreated(new i1y(jyb.m147507f0(mediaMo225055clone), 720, 1, Bitmap.CompressFormat.JPEG, true).map(new qcj() { // from class: l.mt9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ut9.m197965h0((List) obj);
            }
        }).observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.nt9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f143584a.m197973o0((Media) obj);
            }
        })).last().flatMap(new qcj() { // from class: l.ot9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f148934a.m197974p0(str, (Media) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.pt9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153994a.m197975q0((uxj0) obj);
            }
        }, new y20() { // from class: l.qt9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159400a.m197972r0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
