package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.commend.FeedMemePhotoPreviewAct;
import java.util.ArrayList;
import java.util.List;
import p151v.VText;
import p151v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class zeh implements iam<teh> {

    /* JADX INFO: renamed from: a */
    public PhotoDraweeView f204009a;

    /* JADX INFO: renamed from: b */
    public View f204010b;

    /* JADX INFO: renamed from: c */
    public VText f204011c;

    /* JADX INFO: renamed from: d */
    public FeedMemePhotoPreviewAct f204012d;

    public zeh(FeedMemePhotoPreviewAct feedMemePhotoPreviewAct) {
        this.f204012d = feedMemePhotoPreviewAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m219472l(ArrayList arrayList, View view) {
        if (m219476k(arrayList)) {
            m219481s((Picture) arrayList.get(0));
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f204012d;
    }

    /* JADX INFO: renamed from: f */
    public View m219473f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return afh.m97336b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m219473f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m219475j(final ArrayList<Media> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        uqb0.f180374G.m127146i0(this.f204009a, arrayList.get(0).url);
        bnl0.m105509E0(this.f204011c, new View.OnClickListener() { // from class: l.ueh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178651a.m219472l(arrayList, view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final boolean m219476k(ArrayList<Media> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            int iM99992b = asx.m99990h().m99992b();
            int iM99994d = asx.m99990h().m99994d();
            Media media = arrayList.get(0);
            if (!(media instanceof Picture)) {
                o1j0.m165651y("只能选择图片");
                return false;
            }
            Picture picture = (Picture) media;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(oki.m168038z(picture.url), options);
            picture.nullCheck();
            Dimension dimension = picture.size;
            dimension.width = options.outWidth;
            dimension.height = options.outHeight;
            int iBigAspectRate = picture.bigAspectRate();
            if (picture.isHorizontal() && iBigAspectRate > iM99992b) {
                o1j0.m165651y("图片宽度超出上限");
                return false;
            }
            if (!picture.isHorizontal() && iBigAspectRate > iM99994d) {
                o1j0.m165651y("图片长度超出上限");
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Boolean m219477m(String str, List list) {
        return Boolean.valueOf(m219480q(str));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m219478n(List list) {
        this.f204012d.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("selectedImages", new ArrayList(list));
        this.f204012d.setResult(-1, intent);
        this.f204012d.m45660g2();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m219479p(Throwable th) {
        this.f204012d.progressDismiss();
        o1j0.m165636j("图片上传失败，请检查网络设置");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m219480q(String str) {
        return FeedModule.m61405F().signedIn_() && TextUtils.equals(str, FeedModule.m61405F().userId());
    }

    @SuppressLint({"LogUseError"})
    /* JADX INFO: renamed from: s */
    public void m219481s(Media media) {
        this.f204012d.progress("图片上传中...", true);
        if (TEnum.equals(media.status, "raw")) {
            Picture picture = (Picture) media;
            if (picture.size == null || media.mediaType == null) {
                sim simVar = new sim(oki.m168038z(media.url));
                picture.size = new Dimension(simVar.f168843d);
                media.mediaType = simVar.f168842c;
            }
            final String strUserId = FeedModule.m61405F().userId();
            this.f204012d.duringCreated(new i1y((List<Media>) jyb.m147507f0(media), false, strUserId)).observeOn(fo0.m126432a()).last().compose(psd0.m173606Q()).filter(new qcj() { // from class: l.veh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f183773a.m219477m(strUserId, (List) obj);
                }
            }).flatMap(new qcj() { // from class: l.weh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return mrb0.m159634L((List) obj, "unknown", null, UploadSource.get("unknown_"));
                }
            }).compose(dog.m117253n0()).subscribe(psd0.m173597H(new y20() { // from class: l.xeh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f193934a.m219478n((List) obj);
                }
            }, new y20() { // from class: l.yeh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f199347a.m219479p((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(teh tehVar) {
    }
}
