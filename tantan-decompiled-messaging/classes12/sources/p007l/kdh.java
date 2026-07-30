package p007l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.UploadSource;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.commend.FeedMemePhotoPreviewAct;
import java.util.ArrayList;
import java.util.List;
import l.djx;
import l.e30;
import l.jo0;
import l.lsi0;
import l.lsx;
import l.mkd0;
import l.pgm;
import l.qib0;
import l.rhi;
import l.s7m;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VText;
import v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kdh implements s7m<edh> {

    /* JADX INFO: renamed from: a */
    public PhotoDraweeView f9683a;

    /* JADX INFO: renamed from: b */
    public View f9684b;

    /* JADX INFO: renamed from: c */
    public VText f9685c;

    /* JADX INFO: renamed from: d */
    public FeedMemePhotoPreviewAct f9686d;

    public kdh(FeedMemePhotoPreviewAct feedMemePhotoPreviewAct) {
        this.f9686d = feedMemePhotoPreviewAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m11412l(ArrayList arrayList, View view) {
        if (m11418k(arrayList)) {
            m11423s((Picture) arrayList.get(0));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11413C0() {
        return this.f9686d;
    }

    /* JADX INFO: renamed from: f */
    public View m11414f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ldh.m11638b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11414f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m11417j(final ArrayList<Media> arrayList) {
        if (vwb.J(arrayList)) {
            return;
        }
        qib0.G.i0(this.f9683a, arrayList.get(0).url);
        xdl0.E0(this.f9685c, new View.OnClickListener() { // from class: l.fdh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8071a.m11412l(arrayList, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11418k(ArrayList<Media> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            int iB = djx.h().b();
            int iD = djx.h().d();
            Media media = arrayList.get(0);
            if (!(media instanceof Picture)) {
                lsi0.y("只能选择图片");
                return false;
            }
            Picture picture = (Picture) media;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(rhi.z(picture.url), options);
            picture.nullCheck();
            Dimension dimension = picture.size;
            dimension.width = options.outWidth;
            dimension.height = options.outHeight;
            int iBigAspectRate = picture.bigAspectRate();
            if (picture.isHorizontal() && iBigAspectRate > iB) {
                lsi0.y("图片宽度超出上限");
                return false;
            }
            if (!picture.isHorizontal() && iBigAspectRate > iD) {
                lsi0.y("图片长度超出上限");
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean m11419m(String str, List list) {
        return Boolean.valueOf(m11422q(str));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m11420n(List list) {
        this.f9686d.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("selectedImages", new ArrayList(list));
        this.f9686d.setResult(-1, intent);
        this.f9686d.finish();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m11421p(Throwable th) {
        this.f9686d.progressDismiss();
        lsi0.j("图片上传失败，请检查网络设置");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11422q(String str) {
        return FeedModule.m1139F().signedIn_() && TextUtils.equals(str, FeedModule.m1139F().userId());
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: s */
    public void m11423s(Media media) {
        this.f9686d.progress("图片上传中...", true);
        if (TEnum.equals(media.status, MediaLocalStatus.raw)) {
            Picture picture = (Picture) media;
            if (picture.size == null || media.mediaType == null) {
                pgm pgmVar = new pgm(rhi.z(media.url));
                picture.size = new Dimension(pgmVar.d);
                media.mediaType = pgmVar.c;
            }
            final String strUserId = FeedModule.m1139F().userId();
            this.f9686d.duringCreated(new lsx(vwb.f0(new Media[]{media}), false, strUserId)).observeOn(jo0.a()).last().compose(mkd0.Q()).filter(new w9j() { // from class: l.gdh
                public final Object call(Object obj) {
                    return this.f8426a.m11419m(strUserId, (List) obj);
                }
            }).flatMap(new w9j() { // from class: l.hdh
                public final Object call(Object obj) {
                    return ijb0.m10901L((List) obj, "unknown", null, UploadSource.get("unknown_"));
                }
            }).compose(omg.m12710n0()).subscribe(mkd0.H(new e30() { // from class: l.idh
                public final void call(Object obj) {
                    this.f8992a.m11420n((List) obj);
                }
            }, new e30() { // from class: l.jdh
                public final void call(Object obj) {
                    this.f9319a.m11421p((Throwable) obj);
                }
            }));
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m11416i1(edh edhVar) {
    }
}
