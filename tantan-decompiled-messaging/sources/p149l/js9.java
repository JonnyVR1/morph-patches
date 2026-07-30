package p149l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.StickerSource;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes3.dex */
public class js9 extends jq2<ls9> {

    /* JADX INFO: renamed from: a */
    public Media f119481a;

    /* JADX INFO: renamed from: b */
    public Sticker f119482b;

    public js9(mcr mcrVar) {
        super(mcrVar);
        this.f119481a = null;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ Picture m142995g0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Media m142996h0(List list) {
        return (Media) list.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m143002n0(Bundle bundle) {
        ((ls9) this.viewModel).m151520d((ArrayList) act().getIntent().getSerializableExtra("selectedImages"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m143003r0(Throwable th) {
        act().progressDismiss();
        if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
            lsi0.m151593w(R$string.f21031m6);
        } else {
            lsi0.m151593w(R$string.f20977g6);
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.gs9
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19624Z.f20143T.m121236q();
                }
            }, 50L);
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.as9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71400a.m143002n0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C22306c m143004o0(Media media) {
        if (NullChecker.m81303a(this.f119481a)) {
            return C22306c.just(this.f119481a);
        }
        return TEnum.equals(media.status, MediaLocalStatus.preprocessed) ? ya5.m213793I(vwb.m200324f0(media), "custom_sticker").map(new w9j() { // from class: l.hs9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return js9.m142995g0((List) obj);
            }
        }) : C22306c.just(media);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C22306c m143005p0(String str, Media media) {
        this.f119481a = media;
        Sticker stickerNew_ = Sticker.new_();
        this.f119482b = stickerNew_;
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
        this.f119482b.pictures.add(pictureNew_);
        pictureNew_.attachments.add(pictureNew_2);
        this.f119482b.source = StickerSource.get("selfCollect");
        try {
            this.f119482b.hash = ogw.m164283d(new File(rhi.m179382z(str)));
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        return CoreModule.f17545c.f19624Z.f20143T.m34950O(this.f119482b);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m143006q0(roj0 roj0Var) {
        if (!vwb.m200296J(this.f119482b.pictures)) {
            qib0.f154691G.m102377x0(this.f119482b.pictures.get(0).url);
            if (!vwb.m200296J(this.f119482b.pictures.get(0).attachments)) {
                qib0.f154691G.m102377x0(this.f119482b.pictures.get(0).attachments.get(0).url);
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
        lsi0.m151593w(R$string.f20986h6);
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.is9
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19624Z.f20143T.m121236q();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: s0 */
    public void m143007s0(Media media) {
        Media mediaMo223809clone = media.mo223809clone();
        final String str = mediaMo223809clone.url;
        act().duringCreated(new lsx(vwb.m200324f0(mediaMo223809clone), 720, 1, Bitmap.CompressFormat.JPEG, true).map(new w9j() { // from class: l.bs9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return js9.m142996h0((List) obj);
            }
        }).observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.cs9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f82333a.m143004o0((Media) obj);
            }
        })).last().flatMap(new w9j() { // from class: l.ds9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f87733a.m143005p0(str, (Media) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.es9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92997a.m143006q0((roj0) obj);
            }
        }, new e30() { // from class: l.fs9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99051a.m143003r0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
