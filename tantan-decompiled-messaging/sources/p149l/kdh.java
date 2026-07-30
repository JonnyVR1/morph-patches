package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.commend.FeedMemePhotoPreviewAct;
import java.util.ArrayList;
import java.util.List;
import p147v.VText;
import p147v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class kdh implements s7m<edh> {

    /* JADX INFO: renamed from: a */
    public PhotoDraweeView f122558a;

    /* JADX INFO: renamed from: b */
    public View f122559b;

    /* JADX INFO: renamed from: c */
    public VText f122560c;

    /* JADX INFO: renamed from: d */
    public FeedMemePhotoPreviewAct f122561d;

    public kdh(FeedMemePhotoPreviewAct feedMemePhotoPreviewAct) {
        this.f122561d = feedMemePhotoPreviewAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m145633l(ArrayList arrayList, View view) {
        if (m145637k(arrayList)) {
            m145642s((Picture) arrayList.get(0));
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f122561d;
    }

    /* JADX INFO: renamed from: f */
    public View m145634f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ldh.m149443b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m145634f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m145636j(final ArrayList<Media> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        qib0.f154691G.m102363i0(this.f122558a, arrayList.get(0).url);
        xdl0.m208329E0(this.f122560c, new View.OnClickListener() { // from class: l.fdh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97043a.m145633l(arrayList, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final boolean m145637k(ArrayList<Media> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            int iM112146b = djx.m112144h().m112146b();
            int iM112148d = djx.m112144h().m112148d();
            Media media = arrayList.get(0);
            if (!(media instanceof Picture)) {
                lsi0.m151595y("只能选择图片");
                return false;
            }
            Picture picture = (Picture) media;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(rhi.m179382z(picture.url), options);
            picture.nullCheck();
            Dimension dimension = picture.size;
            dimension.width = options.outWidth;
            dimension.height = options.outHeight;
            int iBigAspectRate = picture.bigAspectRate();
            if (picture.isHorizontal() && iBigAspectRate > iM112146b) {
                lsi0.m151595y("图片宽度超出上限");
                return false;
            }
            if (!picture.isHorizontal() && iBigAspectRate > iM112148d) {
                lsi0.m151595y("图片长度超出上限");
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean m145638m(String str, List list) {
        return Boolean.valueOf(m145641q(str));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m145639n(List list) {
        this.f122561d.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("selectedImages", new ArrayList(list));
        this.f122561d.setResult(-1, intent);
        this.f122561d.m44477e2();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m145640p(Throwable th) {
        this.f122561d.progressDismiss();
        lsi0.m151580j("图片上传失败，请检查网络设置");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m145641q(String str) {
        return FeedModule.m60221F().signedIn_() && TextUtils.equals(str, FeedModule.m60221F().userId());
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: s */
    public void m145642s(Media media) {
        this.f122561d.progress("图片上传中...", true);
        if (TEnum.equals(media.status, "raw")) {
            Picture picture = (Picture) media;
            if (picture.size == null || media.mediaType == null) {
                pgm pgmVar = new pgm(rhi.m179382z(media.url));
                picture.size = new Dimension(pgmVar.f148730d);
                media.mediaType = pgmVar.f148729c;
            }
            final String strUserId = FeedModule.m60221F().userId();
            this.f122561d.duringCreated(new lsx((List<Media>) vwb.m200324f0(media), false, strUserId)).observeOn(jo0.m142408a()).last().compose(mkd0.m154965Q()).filter(new w9j() { // from class: l.gdh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f102112a.m145638m(strUserId, (List) obj);
                }
            }).flatMap(new w9j() { // from class: l.hdh
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ijb0.m136548L((List) obj, "unknown", null, UploadSource.get("unknown_"));
                }
            }).compose(omg.m165092n0()).subscribe(mkd0.m154956H(new e30() { // from class: l.idh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f112554a.m145639n((List) obj);
                }
            }, new e30() { // from class: l.jdh
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f117384a.m145640p((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(edh edhVar) {
    }
}
