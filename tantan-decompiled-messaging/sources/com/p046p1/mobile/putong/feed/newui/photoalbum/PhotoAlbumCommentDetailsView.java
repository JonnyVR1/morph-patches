package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CommentStatus;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bsg;
import p149l.e30;
import p149l.e51;
import p149l.exq;
import p149l.hx60;
import p149l.i0e;
import p149l.l170;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n8i;
import p149l.n900;
import p149l.o2h;
import p149l.qib0;
import p149l.roj0;
import p149l.sti;
import p149l.t100;
import p149l.t2h;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumCommentDetailsView extends RelativeLayout {

    /* JADX INFO: renamed from: n */
    public static String f41152n;

    /* JADX INFO: renamed from: a */
    public FrameLayout f41153a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f41154b;

    /* JADX INFO: renamed from: c */
    public VImage f41155c;

    /* JADX INFO: renamed from: d */
    public VText f41156d;

    /* JADX INFO: renamed from: e */
    public VText f41157e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f41158f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f41159g;

    /* JADX INFO: renamed from: h */
    public VText f41160h;

    /* JADX INFO: renamed from: i */
    public VText f41161i;

    /* JADX INFO: renamed from: j */
    public MomentMessage f41162j;

    /* JADX INFO: renamed from: k */
    public hx60 f41163k;

    /* JADX INFO: renamed from: l */
    public PutongFrag f41164l;

    /* JADX INFO: renamed from: m */
    public boolean f41165m;

    public PhotoAlbumCommentDetailsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    public final void m63497i(View view) {
        l170.m148151a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m63498j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public final CommentStatus m63499k(boolean z) {
        MomentMessage momentMessage = this.f41162j;
        return z ? momentMessage.status : momentMessage.commentInfo.status;
    }

    /* JADX INFO: renamed from: l */
    public final String m63500l(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (sti.m185956b() && TEnum.equals(m63499k(z), "selfOnly")) {
            sb.append(m63498j().getString(R$string.f39093k5));
            if (f41152n == null) {
                f41152n = n8i.m158500g(this.f41160h, t100.m186890d(5.0f));
            }
            sb.append(f41152n);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m63501m(View view) {
        ((n900) this.f41163k).mo104989d(this.f41162j, "");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m63502n(View view) {
        m63498j().startActivity(PhotoAlbumFeedAct.m64355V1(m63498j(), this.f41162j.owner, "all_comment_detail_item", -1, 2));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m63503o(Media media, StickerInfo stickerInfo, String str, View view) {
        m63498j().startActivityWithCustomTransition(FeedCommentPhotoPreviewAct.m64066V1(m63498j(), vwb.m200324f0(media), stickerInfo, str), new o2h());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63497i(this);
        this.f41161i.setOnClickListener(new View.OnClickListener() { // from class: l.d170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83244a.m63501m(view);
            }
        });
        this.f41154b.setOnClickListener(new View.OnClickListener() { // from class: l.e170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88714a.m63502n(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m63504p(MomentMessage momentMessage, View view) {
        i0e.m133793b(m63498j(), momentMessage.value);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m63505q(hx60 hx60Var, roj0 roj0Var) {
        m63498j().progressDismiss();
        ((n900) hx60Var).mo104987a();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m63506r(Throwable th) {
        t2h.m186976g(th);
        m63498j().progressDismiss();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m63507s(MomentMessage momentMessage, final hx60 hx60Var, String str, String str2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            e51.m114766q(momentMessage.value);
        } else {
            m63498j().progress(R$string.f38984U2, true);
            hx60Var.m133305l(str, str2, momentMessage).subscribe(mkd0.m154956H(new e30() { // from class: l.j170
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115767a.m63505q(hx60Var, (roj0) obj);
                }
            }, new e30() { // from class: l.k170
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120543a.m63506r((Throwable) obj);
                }
            }));
        }
    }

    public void setCurrentFrag(PutongFrag putongFrag) {
        this.f41164l = putongFrag;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean m63508t(final MomentMessage momentMessage, final hx60 hx60Var, final String str, final String str2, View view) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(m63498j().getString(R$string.f39045e), m63498j().getString(R$string.f38949O3));
        if (!TEnum.equals(momentMessage.status(), "normal")) {
            arrayListM200324f0.remove(1);
        }
        m63498j().dialog().m20535e0(arrayListM200324f0).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.i170
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f110425a.m63507s(momentMessage, hx60Var, str, str2, dialog, view2, i, charSequence);
            }
        }).m20568z0();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX INFO: renamed from: u */
    public void m63509u(final hx60 hx60Var, final MomentMessage momentMessage, final String str, String str2) {
        final StickerInfo stickerInfo;
        final String str3;
        this.f41162j = momentMessage;
        this.f41163k = hx60Var;
        User userMo133306m = hx60Var.mo133306m(momentMessage.owner);
        if (userMo133306m == null) {
            return;
        }
        qib0.f154691G.m102341Q0(this.f41154b, userMo133306m.m60124fp().profileSmall());
        String str4 = userMo133306m.name;
        qib0.f154713b0.f139231b.showUserVerificationLogo(m63498j(), userMo133306m, this.f41155c);
        String string = getResources().getString(R$string.f39021a3);
        final Media media = null;
        User userMo133306m2 = !TextUtils.isEmpty(momentMessage.api_only_otherUser) ? hx60Var.mo133306m(momentMessage.api_only_otherUser) : null;
        StringBuilder sb = new StringBuilder();
        if (momentMessage.owner.equals(str) && !str.equals(momentMessage.api_only_otherUser) && NullChecker.m81303a(userMo133306m2)) {
            String str5 = userMo133306m2.name;
            sb.append(str4);
            sb.append(string);
            sb.append(str5);
            this.f41165m = true;
        } else {
            sb.append(str4);
            this.f41165m = false;
        }
        if (TEnum.equals(momentMessage.messageType, "sticker")) {
            String str6 = momentMessage.accessory.f39213id;
            if (TextUtils.isEmpty(str6)) {
                stickerInfo = null;
            } else {
                stickerInfo = FeedModule.f38855d.f192993I0.get(str6);
            }
        } else if (TEnum.equals(momentMessage.messageType, "picture")) {
            List<Media> list = momentMessage.media;
            if (vwb.m200296J(list)) {
                stickerInfo = null;
            } else {
                media = list.get(0);
                stickerInfo = null;
            }
        } else {
            stickerInfo = null;
        }
        if (NullChecker.m81303a(media) || NullChecker.m81303a(stickerInfo)) {
            this.f41159g.getHierarchy().m112053H(RoundingParams.m8249c(t100.m186890d(10.0f)).m8269w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            exq.m118693b(this.f41159g, 10.0f);
            Picture picture = NullChecker.m81303a(media) ? (Picture) media : stickerInfo.pictures.get(0);
            this.f41159g.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
            Dimension dimensionM103711b = bsg.m103711b(picture, false);
            int i = dimensionM103711b.width;
            int i2 = dimensionM103711b.height;
            if (i != 0) {
                int iM186890d = (i2 * t100.m186890d(122.0f)) / i;
                if (iM186890d >= t100.m186890d(215.0f)) {
                    iM186890d = t100.m186890d(215.0f);
                } else if (iM186890d <= t100.m186890d(69.0f)) {
                    iM186890d = t100.m186890d(69.0f);
                }
                xdl0.m208325C0(this.f41158f, iM186890d);
                xdl0.m208325C0(this.f41159g, iM186890d - t100.m186890d(2.0f));
                if (NullChecker.m81303a(media)) {
                    qib0.f154691G.m102325I0(this.f41159g, media.url, t100.m186890d(120.0f), iM186890d - t100.m186890d(2.0f));
                } else if (TEnum.equals(stickerInfo.source, "shanmeng")) {
                    qib0.f154691G.m102325I0(this.f41159g, stickerInfo.pictures.get(0).url, t100.m186890d(120.0f), iM186890d - t100.m186890d(2.0f));
                } else {
                    qib0.f154691G.m102312B0(this.f41159g, m63510v(stickerInfo.pictures.get(0)));
                }
            }
            xdl0.m208344M(this.f41158f, true);
            str3 = str2;
            xdl0.m208329E0(this.f41159g, new View.OnClickListener() { // from class: l.f170
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94049a.m63503o(media, stickerInfo, str3, view);
                }
            });
        } else {
            xdl0.m208344M(this.f41158f, false);
            str3 = str2;
        }
        this.f41157e.setText(momentMessage.value);
        xdl0.m208344M(this.f41157e, !TextUtils.isEmpty(momentMessage.value));
        this.f41156d.setText(sb.toString());
        this.f41160h.setText(m63500l(false) + mqi0.m155932G(momentMessage.createdTime));
        if (!FeedModule.m60221F().userId().equals(str) || str.equals(momentMessage.owner)) {
            this.f41161i.setVisibility(8);
        } else {
            this.f41161i.setVisibility(0);
        }
        if (!FeedModule.m60221F().userId().equals(momentMessage.owner)) {
            setOnLongClickListener(new View.OnLongClickListener() { // from class: l.g170
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f100122a.m63504p(momentMessage, view);
                }
            });
        } else {
            final String str7 = str3;
            setOnLongClickListener(new View.OnLongClickListener() { // from class: l.h170
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f105284a.m63508t(momentMessage, hx60Var, str, str7, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public Picture.ImageUri m63510v(Picture picture) {
        return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
    }

    public PhotoAlbumCommentDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
