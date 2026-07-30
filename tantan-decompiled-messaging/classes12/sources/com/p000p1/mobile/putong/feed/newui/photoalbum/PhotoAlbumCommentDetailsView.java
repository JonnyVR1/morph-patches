package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.StickerSourceInfo;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.CommentStatus;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.e51;
import l.i0e;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.bsg;
import p007l.exq;
import p007l.hx60;
import p007l.l170;
import p007l.n8i;
import p007l.n900;
import p007l.o2h;
import p007l.sti;
import p007l.t2h;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumCommentDetailsView extends RelativeLayout {

    /* JADX INFO: renamed from: n */
    public static String f2613n;

    /* JADX INFO: renamed from: a */
    public FrameLayout f2614a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f2615b;

    /* JADX INFO: renamed from: c */
    public VImage f2616c;

    /* JADX INFO: renamed from: d */
    public VText f2617d;

    /* JADX INFO: renamed from: e */
    public VText f2618e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f2619f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f2620g;

    /* JADX INFO: renamed from: h */
    public VText f2621h;

    /* JADX INFO: renamed from: i */
    public VText f2622i;

    /* JADX INFO: renamed from: j */
    public MomentMessage f2623j;

    /* JADX INFO: renamed from: k */
    public hx60 f2624k;

    /* JADX INFO: renamed from: l */
    public PutongFrag f2625l;

    /* JADX INFO: renamed from: m */
    public boolean f2626m;

    public PhotoAlbumCommentDetailsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    public final void m4514i(View view) {
        l170.m11541a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m4515j() {
        return getContext();
    }

    /* JADX INFO: renamed from: k */
    public final CommentStatus m4516k(boolean z) {
        MomentMessage momentMessage = this.f2623j;
        return z ? momentMessage.status : momentMessage.commentInfo.status;
    }

    /* JADX INFO: renamed from: l */
    public final String m4517l(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (sti.m14316b() && TEnum.equals(m4516k(z), "selfOnly")) {
            sb.append(m4515j().getString(R$string.f554k5));
            if (f2613n == null) {
                f2613n = n8i.m12113g(this.f2621h, t100.d(5.0f));
            }
            sb.append(f2613n);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m4518m(View view) {
        ((n900) this.f2624k).mo9082d(this.f2623j, "");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m4519n(View view) {
        m4515j().startActivity(PhotoAlbumFeedAct.m5428V1(m4515j(), this.f2623j.owner, "all_comment_detail_item", -1, 2));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m4520o(Media media, StickerInfo stickerInfo, String str, View view) {
        m4515j().startActivityWithCustomTransition(FeedCommentPhotoPreviewAct.m5113V1(m4515j(), vwb.f0(new Media[]{media}), stickerInfo, str), new o2h());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4514i(this);
        this.f2622i.setOnClickListener(new View.OnClickListener() { // from class: l.d170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6771a.m4518m(view);
            }
        });
        this.f2615b.setOnClickListener(new View.OnClickListener() { // from class: l.e170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7101a.m4519n(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m4521p(MomentMessage momentMessage, View view) {
        i0e.b(m4515j(), momentMessage.value);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m4522q(hx60 hx60Var, roj0 roj0Var) {
        m4515j().progressDismiss();
        ((n900) hx60Var).mo9080a();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m4523r(Throwable th) {
        t2h.m14427g(th);
        m4515j().progressDismiss();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m4524s(MomentMessage momentMessage, final hx60 hx60Var, String str, String str2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            e51.q(momentMessage.value);
        } else {
            m4515j().progress(R$string.f445U2, true);
            hx60Var.m10740l(str, str2, momentMessage).subscribe(mkd0.H(new e30() { // from class: l.j170
                public final void call(Object obj) {
                    this.f9177a.m4522q(hx60Var, (roj0) obj);
                }
            }, new e30() { // from class: l.k170
                public final void call(Object obj) {
                    this.f9567a.m4523r((Throwable) obj);
                }
            }));
        }
    }

    public void setCurrentFrag(PutongFrag putongFrag) {
        this.f2625l = putongFrag;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean m4525t(final MomentMessage momentMessage, final hx60 hx60Var, final String str, final String str2, View view) {
        ArrayList arrayListF0 = vwb.f0(new String[]{m4515j().getString(R$string.f506e), m4515j().getString(R$string.f410O3)});
        if (!TEnum.equals(momentMessage.status(), "normal")) {
            arrayListF0.remove(1);
        }
        m4515j().dialog().e0(arrayListF0).g0(new Dialog.g() { // from class: l.i170
            /* JADX INFO: renamed from: a */
            public final void m10760a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f8859a.m4524s(momentMessage, hx60Var, str, str2, dialog, view2, i, charSequence);
            }
        }).z0();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX INFO: renamed from: u */
    public void m4526u(final hx60 hx60Var, final MomentMessage momentMessage, final String str, String str2) {
        final StickerInfo stickerInfo;
        final String str3;
        this.f2623j = momentMessage;
        this.f2624k = hx60Var;
        User userMo10741m = hx60Var.mo10741m(momentMessage.owner);
        if (userMo10741m == null) {
            return;
        }
        qib0.G.Q0(this.f2615b, userMo10741m.m1042fp().profileSmall());
        String str4 = userMo10741m.name;
        qib0.b0.b.showUserVerificationLogo(m4515j(), userMo10741m, this.f2616c);
        String string = getResources().getString(R$string.f482a3);
        final Media media = null;
        User userMo10741m2 = !TextUtils.isEmpty(momentMessage.api_only_otherUser) ? hx60Var.mo10741m(momentMessage.api_only_otherUser) : null;
        StringBuilder sb = new StringBuilder();
        if (momentMessage.owner.equals(str) && !str.equals(momentMessage.api_only_otherUser) && NullChecker.a(userMo10741m2)) {
            String str5 = userMo10741m2.name;
            sb.append(str4);
            sb.append(string);
            sb.append(str5);
            this.f2626m = true;
        } else {
            sb.append(str4);
            this.f2626m = false;
        }
        if (TEnum.equals(momentMessage.messageType, "sticker")) {
            String str6 = momentMessage.accessory.f674id;
            if (TextUtils.isEmpty(str6)) {
                stickerInfo = null;
            } else {
                stickerInfo = FeedModule.f316d.f14928I0.get(str6);
            }
        } else if (TEnum.equals(momentMessage.messageType, "picture")) {
            List<Media> list = momentMessage.media;
            if (vwb.J(list)) {
                stickerInfo = null;
            } else {
                media = list.get(0);
                stickerInfo = null;
            }
        } else {
            stickerInfo = null;
        }
        if (NullChecker.a(media) || NullChecker.a(stickerInfo)) {
            this.f2620g.getHierarchy().H(RoundingParams.c(t100.d(10.0f)).w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            exq.m9962b(this.f2620g, 10.0f);
            Picture picture = NullChecker.a(media) ? (Picture) media : stickerInfo.pictures.get(0);
            this.f2620g.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
            Dimension dimensionM9024b = bsg.m9024b(picture, false);
            int i = dimensionM9024b.width;
            int i2 = dimensionM9024b.height;
            if (i != 0) {
                int iD = (i2 * t100.d(122.0f)) / i;
                if (iD >= t100.d(215.0f)) {
                    iD = t100.d(215.0f);
                } else if (iD <= t100.d(69.0f)) {
                    iD = t100.d(69.0f);
                }
                xdl0.C0(this.f2619f, iD);
                xdl0.C0(this.f2620g, iD - t100.d(2.0f));
                if (NullChecker.a(media)) {
                    qib0.G.I0(this.f2620g, media.url, t100.d(120.0f), iD - t100.d(2.0f));
                } else if (TEnum.equals(stickerInfo.source, StickerSourceInfo.shanmeng)) {
                    qib0.G.I0(this.f2620g, stickerInfo.pictures.get(0).url, t100.d(120.0f), iD - t100.d(2.0f));
                } else {
                    qib0.G.B0(this.f2620g, m4527v(stickerInfo.pictures.get(0)));
                }
            }
            xdl0.M(this.f2619f, true);
            str3 = str2;
            xdl0.E0(this.f2620g, new View.OnClickListener() { // from class: l.f170
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7514a.m4520o(media, stickerInfo, str3, view);
                }
            });
        } else {
            xdl0.M(this.f2619f, false);
            str3 = str2;
        }
        this.f2618e.setText(momentMessage.value);
        xdl0.M(this.f2618e, !TextUtils.isEmpty(momentMessage.value));
        this.f2617d.setText(sb.toString());
        this.f2621h.setText(m4517l(false) + mqi0.G(momentMessage.createdTime));
        if (!FeedModule.m1139F().userId().equals(str) || str.equals(momentMessage.owner)) {
            this.f2622i.setVisibility(8);
        } else {
            this.f2622i.setVisibility(0);
        }
        if (!FeedModule.m1139F().userId().equals(momentMessage.owner)) {
            setOnLongClickListener(new View.OnLongClickListener() { // from class: l.g170
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f8296a.m4521p(momentMessage, view);
                }
            });
        } else {
            final String str7 = str3;
            setOnLongClickListener(new View.OnLongClickListener() { // from class: l.h170
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f8552a.m4525t(momentMessage, hx60Var, str, str7, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public Picture.ImageUri m4527v(Picture picture) {
        return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
    }

    public PhotoAlbumCommentDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
