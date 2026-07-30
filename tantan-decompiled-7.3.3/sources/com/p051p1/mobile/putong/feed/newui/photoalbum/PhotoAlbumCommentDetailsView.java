package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CommentStatus;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.cai;
import p153l.d4h;
import p153l.ezq;
import p153l.i4h;
import p153l.jyb;
import p153l.l51;
import p153l.n570;
import p153l.owi;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qtg;
import p153l.r970;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w1e;
import p153l.wh00;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumCommentDetailsView extends RelativeLayout {

    /* JADX INFO: renamed from: n */
    public static String f42000n;

    /* JADX INFO: renamed from: a */
    public FrameLayout f42001a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f42002b;

    /* JADX INFO: renamed from: c */
    public VImage f42003c;

    /* JADX INFO: renamed from: d */
    public VText f42004d;

    /* JADX INFO: renamed from: e */
    public VText f42005e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f42006f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f42007g;

    /* JADX INFO: renamed from: h */
    public VText f42008h;

    /* JADX INFO: renamed from: i */
    public VText f42009i;

    /* JADX INFO: renamed from: j */
    public MomentMessage f42010j;

    /* JADX INFO: renamed from: k */
    public n570 f42011k;

    /* JADX INFO: renamed from: l */
    public PutongFrag f42012l;

    /* JADX INFO: renamed from: m */
    public boolean f42013m;

    public PhotoAlbumCommentDetailsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    public final void m64680i(View view) {
        r970.m180575a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public Act m64681j() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: k */
    public final CommentStatus m64682k(boolean z) {
        MomentMessage momentMessage = this.f42010j;
        return z ? momentMessage.status : momentMessage.commentInfo.status;
    }

    /* JADX INFO: renamed from: l */
    public final String m64683l(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (owi.m169566b() && TEnum.equals(m64682k(z), "selfOnly")) {
            sb.append(m64681j().getString(R$string.f39941k5));
            if (f42000n == null) {
                f42000n = cai.m108499g(this.f42008h, qa00.m175859d(5.0f));
            }
            sb.append(f42000n);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m64684m(View view) {
        ((wh00) this.f42011k).mo139300d(this.f42010j, "");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m64685n(View view) {
        m64681j().startActivity(PhotoAlbumFeedAct.m65538X1(m64681j(), this.f42010j.owner, "all_comment_detail_item", -1, 2));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m64686o(Media media, StickerInfo stickerInfo, String str, View view) {
        m64681j().startActivityWithCustomTransition(FeedCommentPhotoPreviewAct.m65249X1(m64681j(), jyb.m147507f0(media), stickerInfo, str), new d4h());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64680i(this);
        this.f42009i.setOnClickListener(new View.OnClickListener() { // from class: l.j970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118855a.m64684m(view);
            }
        });
        this.f42002b.setOnClickListener(new View.OnClickListener() { // from class: l.k970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124459a.m64685n(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ boolean m64687p(MomentMessage momentMessage, View view) {
        w1e.m204398b(m64681j(), momentMessage.value);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m64688q(n570 n570Var, uxj0 uxj0Var) {
        m64681j().progressDismiss();
        ((wh00) n570Var).mo139298a();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m64689r(Throwable th) {
        i4h.m138538g(th);
        m64681j().progressDismiss();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m64690s(MomentMessage momentMessage, final n570 n570Var, String str, String str2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            l51.m152911q(momentMessage.value);
        } else {
            m64681j().progress(R$string.f39832U2, true);
            n570Var.m161686l(str, str2, momentMessage).subscribe(psd0.m173597H(new y20() { // from class: l.p970
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151113a.m64688q(n570Var, (uxj0) obj);
                }
            }, new y20() { // from class: l.q970
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156200a.m64689r((Throwable) obj);
                }
            }));
        }
    }

    public void setCurrentFrag(PutongFrag putongFrag) {
        this.f42012l = putongFrag;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean m64691t(final MomentMessage momentMessage, final n570 n570Var, final String str, final String str2, View view) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(m64681j().getString(R$string.f39893e), m64681j().getString(R$string.f39797O3));
        if (!TEnum.equals(momentMessage.status(), "normal")) {
            arrayListM147507f0.remove(1);
        }
        m64681j().dialog().m21534e0(arrayListM147507f0).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.o970
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f145500a.m64690s(momentMessage, n570Var, str, str2, dialog, view2, i, charSequence);
            }
        }).m21567z0();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX INFO: renamed from: u */
    public void m64692u(final n570 n570Var, final MomentMessage momentMessage, final String str, String str2) {
        final StickerInfo stickerInfo;
        final String str3;
        this.f42010j = momentMessage;
        this.f42011k = n570Var;
        User userMo137270m = n570Var.mo137270m(momentMessage.owner);
        if (userMo137270m == null) {
            return;
        }
        uqb0.f180374G.m127125Q0(this.f42002b, userMo137270m.m61308fp().profileSmall());
        String str4 = userMo137270m.name;
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m64681j(), userMo137270m, this.f42003c);
        String string = getResources().getString(R$string.f39869a3);
        final Media media = null;
        User userMo137270m2 = !TextUtils.isEmpty(momentMessage.api_only_otherUser) ? n570Var.mo137270m(momentMessage.api_only_otherUser) : null;
        StringBuilder sb = new StringBuilder();
        if (momentMessage.owner.equals(str) && !str.equals(momentMessage.api_only_otherUser) && NullChecker.m82486a(userMo137270m2)) {
            String str5 = userMo137270m2.name;
            sb.append(str4);
            sb.append(string);
            sb.append(str5);
            this.f42013m = true;
        } else {
            sb.append(str4);
            this.f42013m = false;
        }
        if (TEnum.equals(momentMessage.messageType, "sticker")) {
            String str6 = momentMessage.accessory.f40061id;
            if (TextUtils.isEmpty(str6)) {
                stickerInfo = null;
            } else {
                stickerInfo = FeedModule.f39703d.f121303I0.get(str6);
            }
        } else if (TEnum.equals(momentMessage.messageType, "picture")) {
            List<Media> list = momentMessage.media;
            if (jyb.m147479J(list)) {
                stickerInfo = null;
            } else {
                media = list.get(0);
                stickerInfo = null;
            }
        } else {
            stickerInfo = null;
        }
        if (NullChecker.m82486a(media) || NullChecker.m82486a(stickerInfo)) {
            this.f42007g.getHierarchy().m207045H(RoundingParams.m8303c(qa00.m175859d(10.0f)).m8323w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            ezq.m123397b(this.f42007g, 10.0f);
            Picture picture = NullChecker.m82486a(media) ? (Picture) media : stickerInfo.pictures.get(0);
            this.f42007g.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
            Dimension dimensionM177926b = qtg.m177926b(picture, false);
            int i = dimensionM177926b.width;
            int i2 = dimensionM177926b.height;
            if (i != 0) {
                int iM175859d = (i2 * qa00.m175859d(122.0f)) / i;
                if (iM175859d >= qa00.m175859d(215.0f)) {
                    iM175859d = qa00.m175859d(215.0f);
                } else if (iM175859d <= qa00.m175859d(69.0f)) {
                    iM175859d = qa00.m175859d(69.0f);
                }
                bnl0.m105505C0(this.f42006f, iM175859d);
                bnl0.m105505C0(this.f42007g, iM175859d - qa00.m175859d(2.0f));
                if (NullChecker.m82486a(media)) {
                    uqb0.f180374G.m127109I0(this.f42007g, media.url, qa00.m175859d(120.0f), iM175859d - qa00.m175859d(2.0f));
                } else if (TEnum.equals(stickerInfo.source, "shanmeng")) {
                    uqb0.f180374G.m127109I0(this.f42007g, stickerInfo.pictures.get(0).url, qa00.m175859d(120.0f), iM175859d - qa00.m175859d(2.0f));
                } else {
                    uqb0.f180374G.m127096B0(this.f42007g, m64693v(stickerInfo.pictures.get(0)));
                }
            }
            bnl0.m105524M(this.f42006f, true);
            str3 = str2;
            bnl0.m105509E0(this.f42007g, new View.OnClickListener() { // from class: l.l970
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f130559a.m64686o(media, stickerInfo, str3, view);
                }
            });
        } else {
            bnl0.m105524M(this.f42006f, false);
            str3 = str2;
        }
        this.f42005e.setText(momentMessage.value);
        bnl0.m105524M(this.f42005e, !TextUtils.isEmpty(momentMessage.value));
        this.f42004d.setText(sb.toString());
        this.f42008h.setText(m64683l(false) + pzi0.m174442G(momentMessage.createdTime));
        if (!FeedModule.m61405F().userId().equals(str) || str.equals(momentMessage.owner)) {
            this.f42009i.setVisibility(8);
        } else {
            this.f42009i.setVisibility(0);
        }
        if (!FeedModule.m61405F().userId().equals(momentMessage.owner)) {
            setOnLongClickListener(new View.OnLongClickListener() { // from class: l.m970
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f135354a.m64687p(momentMessage, view);
                }
            });
        } else {
            final String str7 = str3;
            setOnLongClickListener(new View.OnLongClickListener() { // from class: l.n970
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.f140746a.m64691t(momentMessage, n570Var, str, str7, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public Picture.ImageUri m64693v(Picture picture) {
        return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
    }

    public PhotoAlbumCommentDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
