package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
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
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.CommentStatus;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.immersionvideo.ImmersionVideoMomentDetailAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.aaj;
import l.c40;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.i0e;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p007l.bsg;
import p007l.dh5;
import p007l.e1c0;
import p007l.exq;
import p007l.f3c0;
import p007l.hx60;
import p007l.j2i;
import p007l.n8i;
import p007l.n900;
import p007l.o2h;
import p007l.p6j0;
import p007l.s7i;
import p007l.sti;
import p007l.t2h;
import p007l.v1h;
import p007l.vs0;
import p007l.vwi;
import p007l.zi60;
import p007l.zrg;
import v.VDraweeView;
import v.VImage;
import v.VListCell;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class PhotoAlbumCommentExpandDetailsView extends RelativeLayout {

    /* JADX INFO: renamed from: m */
    public static String f2627m;

    /* JADX INFO: renamed from: a */
    public MomentMessage f2628a;

    /* JADX INFO: renamed from: b */
    public dh5 f2629b;

    /* JADX INFO: renamed from: c */
    public hx60 f2630c;

    /* JADX INFO: renamed from: d */
    public String f2631d;

    /* JADX INFO: renamed from: e */
    public String f2632e;

    /* JADX INFO: renamed from: f */
    public Moment f2633f;

    /* JADX INFO: renamed from: g */
    public String f2634g;

    /* JADX INFO: renamed from: h */
    public String f2635h;

    /* JADX INFO: renamed from: i */
    public boolean f2636i;

    /* JADX INFO: renamed from: j */
    public String f2637j;

    /* JADX INFO: renamed from: k */
    public c40 f2638k;

    /* JADX INFO: renamed from: l */
    public c40 f2639l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView$a */
    public class C2111a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2640a;

        public C2111a(int i) {
            this.f2640a = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PhotoAlbumCommentExpandDetailsView photoAlbumCommentExpandDetailsView = PhotoAlbumCommentExpandDetailsView.this;
            photoAlbumCommentExpandDetailsView.m4601y0(photoAlbumCommentExpandDetailsView.f2628a.owner);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f2640a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView$b */
    public class C2112b extends ClickableSpan {
        public C2112b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PhotoAlbumCommentExpandDetailsView photoAlbumCommentExpandDetailsView = PhotoAlbumCommentExpandDetailsView.this;
            photoAlbumCommentExpandDetailsView.m4601y0(photoAlbumCommentExpandDetailsView.f2628a.owner);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(FeedModule.f313a.getResources().getColor(e1c0.f7103B));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView$c */
    public class C2113c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2643a;

        public C2113c(int i) {
            this.f2643a = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PhotoAlbumCommentExpandDetailsView photoAlbumCommentExpandDetailsView = PhotoAlbumCommentExpandDetailsView.this;
            photoAlbumCommentExpandDetailsView.m4601y0(photoAlbumCommentExpandDetailsView.f2628a.api_only_otherUser);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f2643a);
        }
    }

    public PhotoAlbumCommentExpandDetailsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m4529B(MomentMessage momentMessage, e30 e30Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            e51.q(momentMessage.value);
        } else if (NullChecker.b(e30Var)) {
            e30Var.call(momentMessage);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m4549r0(boolean z, int i, ImageView imageView, TextView textView) {
        if (z) {
            imageView.setImageResource(f3c0.f7757a1);
            textView.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7154n));
        } else {
            imageView.setImageResource(f3c0.f7749Z0);
            textView.setTextColor(FeedModule.f313a.getResources().getColor(e1c0.f7112K));
        }
        xdl0.M(textView, i > 0);
        textView.setText(i0g0.h0(i));
    }

    /* JADX INFO: renamed from: D */
    public abstract Act mo4502D();

    /* JADX INFO: renamed from: E */
    public final int m4558E(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append("     ");
        spannableStringBuilder.setSpan(new zrg(getContext(), BitmapFactory.decodeResource(getResources(), f3c0.f7580C0)), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 33);
        return 3;
    }

    /* JADX INFO: renamed from: F */
    public final void m4559F() {
        v1h.m15269w0(mo4502D(), mo4502D().getString(R$string.f619u4), new d30() { // from class: l.e270
            public final void call() {
                this.f7175a.m4572U();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m4560G(c40 c40Var) {
        if (NullChecker.a(c40Var) && c40Var.d()) {
            c40Var.b();
        }
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m4561H(String str, String str2, String str3, String str4, boolean z, int i, int i2) {
        List<String> listM14040f = s7i.m14040f(getCommentName().getPaint(), mo4504N(str, str2, z), str, str2, str3, str4, z, new aaj() { // from class: l.p170
            /* JADX INFO: renamed from: a */
            public final Object m12900a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return this.f11668a.m4564K((String) obj, (String) obj2, (String) obj3, (String) obj4, ((Boolean) obj5).booleanValue());
            }
        });
        return m4563J(str, str2, listM14040f.get(0), listM14040f.get(1), z, i, i2);
    }

    /* JADX INFO: renamed from: I */
    public final CommentStatus m4562I(boolean z) {
        MomentMessage momentMessage = this.f2628a;
        return z ? momentMessage.status : momentMessage.commentInfo.status;
    }

    /* JADX INFO: renamed from: J */
    public CharSequence m4563J(String str, String str2, String str3, String str4, boolean z, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = str3.length();
        int length2 = str4.length();
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new C2111a(i), 0, length, 17);
        m4566O(str, spannableStringBuilder, length);
        if (z) {
            spannableStringBuilder.setSpan(new C2112b(), spannableStringBuilder.length() - m4558E(spannableStringBuilder), spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) str4);
            spannableStringBuilder.setSpan(new C2113c(i2), spannableStringBuilder.length() - length2, spannableStringBuilder.length(), 17);
            m4566O(str2, spannableStringBuilder, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K */
    public String m4564K(String str, String str2, String str3, String str4, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append(m4567P(str) ? "作者" : "");
        if (z) {
            spannableStringBuilder.append((CharSequence) (" " + getResources().getString(R$string.f482a3) + " "));
            spannableStringBuilder.append((CharSequence) str4);
            spannableStringBuilder.append((CharSequence) (m4567P(str2) ? "作者" : ""));
        }
        return spannableStringBuilder.toString();
    }

    /* JADX INFO: renamed from: L */
    public abstract String mo4503L(boolean z);

    /* JADX INFO: renamed from: M */
    public final String m4565M(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (sti.m14316b() && TEnum.equals(m4562I(z), "selfOnly")) {
            sb.append(mo4502D().getString(R$string.f554k5));
            if (f2627m == null) {
                f2627m = n8i.m12113g(getTime(), t100.d(5.0f));
            }
            sb.append(f2627m);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: N */
    public abstract float mo4504N(String str, String str2, boolean z);

    /* JADX INFO: renamed from: O */
    public final void m4566O(String str, SpannableStringBuilder spannableStringBuilder, int i) {
        if (m4567P(str)) {
            TextView textView = new TextView(getContext());
            textView.setText("作者");
            textView.setTextSize(9.0f);
            textView.setTextColor(getResources().getColor(e1c0.f7152m));
            textView.setPadding(t100.d(4.0f), t100.d(2.0f), t100.d(4.0f), t100.d(2.0f));
            textView.setGravity(17);
            textView.getPaint().setFakeBoldText(true);
            textView.setBackgroundResource(f3c0.f7572B0);
            textView.setDrawingCacheEnabled(true);
            textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
            Bitmap drawingCache = textView.getDrawingCache();
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(new zrg(getContext(), drawingCache), i + 1, i + 2, 33);
        }
    }

    /* JADX INFO: renamed from: P */
    public boolean m4567P(String str) {
        String str2;
        return (TextUtils.isEmpty(str) || (str2 = this.f2631d) == null || !str2.equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m4568Q() {
        return FeedModule.m1139F().userId().equals(this.f2628a.owner);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m4569R() {
        return FeedModule.m1139F().userId().equals(this.f2631d);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m4570S(roj0 roj0Var) {
        mo4502D().progressDismiss();
        ((n900) this.f2630c).mo9080a();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m4571T(Throwable th) {
        t2h.m14427g(th);
        mo4502D().progressDismiss();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m4572U() {
        mo4502D().progress(R$string.f445U2, true);
        this.f2630c.m10740l(this.f2631d, this.f2632e, this.f2628a).subscribe(mkd0.H(new e30() { // from class: l.f270
            public final void call(Object obj) {
                this.f7524a.m4570S((roj0) obj);
            }
        }, new e30() { // from class: l.g270
            public final void call(Object obj) {
                this.f8304a.m4571T((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m4573V(String str, View view) {
        if (m4568Q()) {
            ArrayList<CharSequence> arrayListF0 = vwb.f0(new CharSequence[]{mo4502D().getString(R$string.f482a3)});
            if (!TextUtils.isEmpty(getCommentText().getText().toString())) {
                arrayListF0.add(mo4502D().getString(R$string.f359G0));
            }
            arrayListF0.add(mo4502D().getString(R$string.f513f));
            m4598v0(arrayListF0, str);
            return true;
        }
        if (!m4569R()) {
            ArrayList<CharSequence> arrayListF1 = vwb.f0(new CharSequence[]{mo4502D().getString(R$string.f482a3)});
            if (!TextUtils.isEmpty(getCommentText().getText().toString())) {
                arrayListF1.add(mo4502D().getString(R$string.f359G0));
            }
            arrayListF1.add(mo4502D().getString(R$string.f434S3));
            m4599w0(arrayListF1, str);
            return true;
        }
        ArrayList<CharSequence> arrayListF2 = vwb.f0(new CharSequence[]{mo4502D().getString(R$string.f482a3)});
        if (!TextUtils.isEmpty(getCommentText().getText().toString())) {
            arrayListF2.add(mo4502D().getString(R$string.f359G0));
        }
        arrayListF2.add(mo4502D().getString(R$string.f513f));
        arrayListF2.add(mo4502D().getString(R$string.f434S3));
        if (!TEnum.equals(this.f2628a.status(), "normal")) {
            arrayListF2.remove(1);
        }
        m4598v0(arrayListF2, str);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m4574W(final String str, View view) {
        if (NullChecker.b(view)) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.q170
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f12047a.m4573V(str, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m4575X(View view) {
        if (NullChecker.a(this.f2628a)) {
            if (this.f2636i) {
                zi60.m17436w().m17448e(this.f2633f, this.f2628a);
            } else {
                zi60.m17436w().m17453j(this.f2633f, this.f2628a);
            }
            m4601y0(this.f2628a.owner);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m4576Y() {
        if (NullChecker.a(this.f2639l) && this.f2639l.d()) {
            this.f2639l.b();
        }
        if (NullChecker.a(this.f2638k) && this.f2638k.d()) {
            this.f2638k.b();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m4577Z(ImageView imageView, TextView textView, roj0 roj0Var) {
        MomentMessage momentMessage = this.f2628a;
        boolean z = momentMessage.liked;
        boolean z2 = !z;
        momentMessage.liked = z2;
        if (z) {
            momentMessage.likes--;
        } else {
            momentMessage.likes++;
        }
        m4549r0(z2, momentMessage.likes, imageView, textView);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m4578a0(ImageView imageView, TextView textView, roj0 roj0Var) {
        Object obj = this.f2630c;
        if (obj instanceof n900) {
            ((n900) obj).mo9081c();
        }
        MomentMessage momentMessage = this.f2628a;
        CommentInfo commentInfo = momentMessage.commentInfo;
        boolean z = commentInfo.liked;
        commentInfo.liked = !z;
        if (z) {
            commentInfo.likes--;
        } else {
            commentInfo.likes++;
        }
        FeedModule.f316d.f14925H0.put(((CopyObject) momentMessage).id, momentMessage);
        CommentInfo commentInfo2 = this.f2628a.commentInfo;
        m4549r0(commentInfo2.liked, commentInfo2.likes, imageView, textView);
        FeedModule.f316d.f14949R0.onNext(((CopyObject) this.f2628a).id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m4579b0(hx60 hx60Var, MomentMessage momentMessage, View view) {
        ((n900) hx60Var).mo9082d(momentMessage, mo4503L(false));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m4580c0(boolean z, View view) {
        m4593p0(getLikeIndicator(), getLikeCount(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m4581d0(hx60 hx60Var, MomentMessage momentMessage, View view) {
        ((n900) hx60Var).mo9082d(momentMessage, mo4503L(true));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ boolean m4582e0(final MomentMessage momentMessage, final e30 e30Var, View view) {
        if (!FeedModule.m1139F().userId().equals(momentMessage.owner)) {
            i0e.b(mo4502D(), momentMessage.value);
            return true;
        }
        ArrayList arrayListF0 = vwb.f0(new String[]{mo4502D().getString(R$string.f506e), mo4502D().getString(R$string.f410O3)});
        if (!TEnum.equals(momentMessage.status(), "normal")) {
            arrayListF0.remove(1);
        }
        mo4502D().dialog().e0(arrayListF0).g0(new Dialog.g() { // from class: l.o270
            /* JADX INFO: renamed from: a */
            public final void m12426a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                PhotoAlbumCommentExpandDetailsView.m4529B(momentMessage, e30Var, dialog, view2, i, charSequence);
            }
        }).z0();
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m4583f0(final MomentMessage momentMessage, final e30 e30Var, View view) {
        if (NullChecker.b(view)) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.m270
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f10188a.m4582e0(momentMessage, e30Var, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m4584g0(Media media, StickerInfo stickerInfo, View view) {
        mo4502D().startActivityWithCustomTransition(FeedCommentPhotoPreviewAct.m5113V1(mo4502D(), vwb.f0(new Media[]{media}), stickerInfo, this.f2632e), new o2h());
    }

    public abstract VText getCommentName();

    public abstract VDraweeView getCommentSticker();

    public abstract RelativeLayout getCommentStickerContent();

    public abstract VText getCommentText();

    public abstract VText getLikeCount();

    public abstract VRelative getLikeCountContainer();

    public abstract VImage getLikeIndicator();

    public abstract VDraweeView getPic();

    public abstract HeaderFrameWrapper getPicFrame();

    public abstract VImage getPicVerification();

    public abstract VText getReply();

    public abstract VText getTime();

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m4585h0(boolean z, View view) {
        j2i.m11067a(this.f2633f, this.f2637j);
        ((n900) this.f2630c).mo9082d(this.f2628a, mo4503L(z));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m4586i0(String str, VListCell vListCell, VListCell.a aVar, int i) {
        if (TextUtils.equals(aVar.a, mo4502D().getString(R$string.f482a3))) {
            m4560G(this.f2638k);
            e51.H(mo4502D(), new Runnable() { // from class: l.d270
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6780a.m4588k0();
                }
            }, 200L);
        } else if (TextUtils.equals(aVar.a, mo4502D().getString(R$string.f513f))) {
            m4559F();
        } else if (TextUtils.equals(aVar.a, mo4502D().getString(R$string.f434S3))) {
            Act actMo4502D = mo4502D();
            MomentMessage momentMessage = this.f2628a;
            vwi.m15607V(actMo4502D, "dynamicReview", momentMessage.owner, str, ((CopyObject) momentMessage).id);
        } else {
            zvf0.u("e_copy_comment", "p_comment_interaction_pop", new j760[]{vwb.Y("moment_id", str), vwb.Y("comment_id", NullChecker.a(this.f2628a) ? ((CopyObject) this.f2628a).id : "")});
            e51.q(this.f2628a.value);
            osi0.g(mo4502D().getString(R$string.f353F0));
        }
        m4560G(this.f2638k);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m4587j0(View view) {
        this.f2638k.b();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m4588k0() {
        getCommentText().performClick();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m4589l0(View view) {
        this.f2639l.b();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m4590m0() {
        getCommentText().performClick();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m4591n0(String str, VListCell vListCell, VListCell.a aVar, int i) {
        if (i == 0) {
            m4560G(this.f2639l);
            e51.H(mo4502D(), new Runnable() { // from class: l.c270
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6492a.m4590m0();
                }
            }, 200L);
        } else if (i == 1) {
            zvf0.u("e_copy_comment", "p_comment_interaction_pop", new j760[]{vwb.Y("moment_id", str), vwb.Y("comment_id", NullChecker.a(this.f2628a) ? ((CopyObject) this.f2628a).id : "")});
            e51.q(this.f2628a.value);
            osi0.g(mo4502D().getString(R$string.f353F0));
        } else {
            Act actMo4502D = mo4502D();
            MomentMessage momentMessage = this.f2628a;
            vwi.m15607V(actMo4502D, "dynamicReview", momentMessage.owner, str, ((CopyObject) momentMessage).id);
        }
        m4560G(this.f2639l);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m4592o0(final String str) {
        vwb.z(vwb.f0(new View[]{this, getCommentName(), getCommentText(), getCommentSticker()}), new e30() { // from class: l.o170
            public final void call(Object obj) {
                this.f10971a.m4574W(str, (View) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        getPic().setOnClickListener(new View.OnClickListener() { // from class: l.h270
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8564a.m4575X(view);
            }
        });
        mo4502D().creates((e30) null, new d30() { // from class: l.i270
            public final void call() {
                this.f8873a.m4576Y();
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m4593p0(final ImageView imageView, final TextView textView, boolean z) {
        if (((CopyObject) this.f2628a).id.startsWith("fake_id_")) {
            return;
        }
        MomentMessage momentMessage = this.f2628a;
        if (!z ? !momentMessage.commentInfo.liked : !momentMessage.liked) {
            p6j0.m12912b("e_comment_like", this.f2636i ? "p_immersion_comment_page" : "p_user_moment_interactions_details_view", p6j0.C2456a.m12922g("moment_id", this.f2632e), p6j0.C2456a.m12922g("owner_id", this.f2631d));
        }
        hx60 hx60Var = this.f2630c;
        if (z) {
            String str = this.f2635h;
            String str2 = this.f2634g;
            MomentMessage momentMessage2 = this.f2628a;
            hx60Var.m10749v(str, str2, ((CopyObject) momentMessage2).id, !momentMessage2.liked).subscribe(mkd0.H(new e30() { // from class: l.r170
                public final void call(Object obj) {
                    this.f12452a.m4577Z(imageView, textView, (roj0) obj);
                }
            }, new e30() { // from class: l.s170
                public final void call(Object obj) {
                    t2h.m14427g((Throwable) obj);
                }
            }));
            return;
        }
        String str3 = this.f2631d;
        String str4 = this.f2632e;
        MomentMessage momentMessage3 = this.f2628a;
        hx60Var.m10748u(str3, str4, ((CopyObject) momentMessage3).id, !momentMessage3.commentInfo.liked).subscribe(mkd0.H(new e30() { // from class: l.t170
            public final void call(Object obj) {
                this.f13154a.m4578a0(imageView, textView, (roj0) obj);
            }
        }, new e30() { // from class: l.u170
            public final void call(Object obj) {
                t2h.m14427g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public void m4594q0(dh5 dh5Var, final hx60 hx60Var, final MomentMessage momentMessage, String str, Moment moment, String str2) {
        this.f2629b = dh5Var;
        this.f2628a = momentMessage;
        this.f2630c = hx60Var;
        this.f2631d = str;
        this.f2632e = ((DbObject) moment).id;
        this.f2633f = moment;
        this.f2637j = str2;
        m4597u0(false);
        getCommentText().setOnClickListener(new View.OnClickListener() { // from class: l.n270
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10626a.m4579b0(hx60Var, momentMessage, view);
            }
        });
        m4592o0(this.f2632e);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m4595s0(final boolean z) {
        MomentMessage momentMessage = this.f2628a;
        boolean z2 = z ? momentMessage.liked : momentMessage.commentInfo.liked;
        MomentMessage momentMessage2 = this.f2628a;
        m4549r0(z2, z ? momentMessage2.likes : momentMessage2.commentInfo.likes, getLikeIndicator(), getLikeCount());
        getLikeCountContainer().setOnClickListener(new View.OnClickListener() { // from class: l.n170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10618a.m4580c0(z, view);
            }
        });
    }

    public void setIsFromImmersionVideo(boolean z) {
        this.f2636i = z;
    }

    /* JADX INFO: renamed from: t0 */
    public void m4596t0(dh5 dh5Var, final hx60 hx60Var, final MomentMessage momentMessage, final e30<MomentMessage> e30Var, String str, String str2, String str3) {
        this.f2629b = dh5Var;
        this.f2628a = momentMessage;
        this.f2630c = hx60Var;
        this.f2634g = str;
        this.f2635h = str2;
        this.f2632e = str3;
        m4597u0(true);
        getCommentText().setOnClickListener(new View.OnClickListener() { // from class: l.m170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10180a.m4581d0(hx60Var, momentMessage, view);
            }
        });
        vwb.z(vwb.f0(new View[]{this, getCommentName(), getCommentText()}), new e30() { // from class: l.x170
            public final void call(Object obj) {
                this.f14734a.m4583f0(momentMessage, e30Var, (View) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0199  */
    /* JADX INFO: renamed from: u0 */
    public final void m4597u0(final boolean z) {
        String str;
        final StickerInfo stickerInfo;
        User userMo10741m = this.f2630c.mo10741m(this.f2628a.owner);
        if (userMo10741m == null) {
            return;
        }
        if (mo4502D() instanceof ImmersionVideoMomentDetailAct) {
            qib0.G.Q0(getPic(), userMo10741m.m1042fp().profileSmall());
            getPicFrame().G0(false);
        } else {
            vs0.m15567e(this.f2633f, getPic(), userMo10741m);
            if (!vs0.m15566d(this.f2633f)) {
                getPicFrame().n0(userMo10741m);
            }
        }
        String str2 = userMo10741m.name;
        qib0.b0.b.showUserVerificationLogo(mo4502D(), userMo10741m, getPicVerification());
        getResources().getString(R$string.f482a3);
        final Media media = null;
        User userMo10741m2 = (TextUtils.isEmpty(this.f2628a.api_only_otherUser) || this.f2628a.api_only_otherUser.equals("-10010")) ? null : this.f2630c.mo10741m(this.f2628a.api_only_otherUser);
        if (NullChecker.a(userMo10741m2) && this.f2628a.isChildComment()) {
            getCommentName().setText(m4561H(((DbObject) userMo10741m).id, ((DbObject) userMo10741m2).id, vs0.m15563a(this.f2633f, str2), vs0.m15563a(this.f2633f, userMo10741m2.name), true, n8i.m12107a(userMo10741m), n8i.m12107a(userMo10741m2)));
        } else if (!NullChecker.a(userMo10741m2) || ((str = this.f2631d) != null && str.equals(this.f2628a.api_only_otherUser))) {
            getCommentName().setText(m4561H(((DbObject) userMo10741m).id, "", vs0.m15563a(this.f2633f, str2), "", false, n8i.m12107a(userMo10741m), n8i.m12107a(userMo10741m2)));
        } else {
            getCommentName().setText(m4561H(((DbObject) userMo10741m).id, ((DbObject) userMo10741m2).id, vs0.m15563a(this.f2633f, str2), vs0.m15563a(this.f2633f, userMo10741m2.name), true, n8i.m12107a(userMo10741m), n8i.m12107a(userMo10741m2)));
        }
        getCommentName().setMovementMethod(LinkMovementMethod.getInstance());
        getCommentText().setText(this.f2628a.value);
        xdl0.M(getCommentText(), !TextUtils.isEmpty(this.f2628a.value));
        boolean zEquals = TEnum.equals(this.f2628a.messageType, "sticker");
        MomentMessage momentMessage = this.f2628a;
        if (zEquals) {
            final String str3 = momentMessage.accessory.f674id;
            if (TextUtils.isEmpty(str3) || vwb.J(this.f2629b.f6932d)) {
                stickerInfo = null;
            } else {
                stickerInfo = (StickerInfo) vwb.r(this.f2629b.f6932d, new w9j() { // from class: l.j270
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((DbObject) ((StickerInfo) obj)).id, str3));
                    }
                });
            }
        } else if (TEnum.equals(momentMessage.messageType, "picture")) {
            List<Media> list = this.f2628a.media;
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
            getCommentSticker().getHierarchy().H(RoundingParams.c(t100.d(10.0f)).w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            exq.m9962b(getCommentSticker(), 10.0f);
            Picture picture = NullChecker.a(media) ? (Picture) media : stickerInfo.pictures.get(0);
            getCommentSticker().setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
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
                xdl0.C0(getCommentStickerContent(), iD);
                xdl0.C0(getCommentSticker(), iD - t100.d(2.0f));
                if (NullChecker.a(media)) {
                    qib0.G.I0(getCommentSticker(), media.url, t100.d(120.0f), iD - t100.d(2.0f));
                } else if (TEnum.equals(stickerInfo.source, StickerSourceInfo.shanmeng)) {
                    qib0.G.I0(getCommentSticker(), stickerInfo.pictures.get(0).url, t100.d(120.0f), iD - t100.d(2.0f));
                } else {
                    qib0.G.B0(getCommentSticker(), m4600x0(stickerInfo.pictures.get(0)));
                }
            }
            xdl0.M(getCommentStickerContent(), true);
            xdl0.E0(getCommentSticker(), new View.OnClickListener() { // from class: l.k270
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9574a.m4584g0(media, stickerInfo, view);
                }
            });
        } else {
            xdl0.M(getCommentStickerContent(), false);
        }
        getTime().setText(m4565M(z) + mqi0.G(this.f2628a.createdTime));
        m4595s0(z);
        getReply().setOnClickListener(new View.OnClickListener() { // from class: l.l270
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9849a.m4585h0(z, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m4598v0(ArrayList<CharSequence> arrayList, final String str) {
        final cwf0 cwf0VarC = i0e.c("p_comment_interaction_pop", android.app.Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("moment_id", str), vwb.Y("comment_id", NullChecker.a(this.f2628a) ? ((CopyObject) this.f2628a).id : "")});
        i0e.f(cwf0VarC);
        c40.b bVar = new c40.b(mo4502D());
        bVar.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.v170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14016a.m4587j0(view);
            }
        }).Q(arrayList).T(new DialogInterface.OnDismissListener() { // from class: l.w170
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).R(new int[]{arrayList.indexOf(mo4502D().getString(R$string.f434S3))}, new int[]{e1c0.f7156o}).V(new c40.d() { // from class: l.y170
            /* JADX INFO: renamed from: a */
            public final void m16886a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f15200a.m4586i0(str, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f2638k = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: w0 */
    public void m4599w0(ArrayList<CharSequence> arrayList, final String str) {
        final cwf0 cwf0VarC = i0e.c("p_comment_interaction_pop", android.app.Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("moment_id", str), vwb.Y("comment_id", NullChecker.a(this.f2628a) ? ((CopyObject) this.f2628a).id : "")});
        i0e.f(cwf0VarC);
        c40.b bVar = new c40.b(mo4502D());
        bVar.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.z170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15552a.m4589l0(view);
            }
        }).T(new DialogInterface.OnDismissListener() { // from class: l.a270
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).R(new int[]{arrayList.indexOf(mo4502D().getString(R$string.f434S3))}, new int[]{e1c0.f7156o}).Q(arrayList).V(new c40.d() { // from class: l.b270
            /* JADX INFO: renamed from: a */
            public final void m8629a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f5890a.m4591n0(str, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f2639l = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: x0 */
    public Picture.ImageUri m4600x0(Picture picture) {
        return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m4601y0(String str) {
        if (FeedModule.m1139F().userId().equals(str)) {
            mo4502D().startActivity(vs0.m15565c(mo4502D(), str, "all_comment_detail_item"));
        } else {
            vs0.m15572j(mo4502D(), this.f2633f, str, "all_comment_detail_item", false);
        }
    }

    public PhotoAlbumCommentExpandDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentExpandDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
