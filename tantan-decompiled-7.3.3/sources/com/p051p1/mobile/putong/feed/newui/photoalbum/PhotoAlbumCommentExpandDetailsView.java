package com.p051p1.mobile.putong.feed.newui.photoalbum;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.CommentStatus;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.immersionvideo.ImmersionVideoMomentDetailAct;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VListCell;
import p151v.VRelative;
import p151v.VText;
import p153l.at0;
import p153l.bnl0;
import p153l.cai;
import p153l.d4h;
import p153l.di5;
import p153l.er60;
import p153l.ezq;
import p153l.h9i;
import p153l.i4g0;
import p153l.i4h;
import p153l.jyb;
import p153l.k3h;
import p153l.k9c0;
import p153l.l4g0;
import p153l.l51;
import p153l.lbc0;
import p153l.n570;
import p153l.otg;
import p153l.owi;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.qtg;
import p153l.r1j0;
import p153l.rzi;
import p153l.tfj0;
import p153l.ucj;
import p153l.uqb0;
import p153l.uxj0;
import p153l.w1e;
import p153l.w30;
import p153l.wh00;
import p153l.x20;
import p153l.y20;
import p153l.y3i;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PhotoAlbumCommentExpandDetailsView extends RelativeLayout {

    /* JADX INFO: renamed from: m */
    public static String f42014m;

    /* JADX INFO: renamed from: a */
    public MomentMessage f42015a;

    /* JADX INFO: renamed from: b */
    public di5 f42016b;

    /* JADX INFO: renamed from: c */
    public n570 f42017c;

    /* JADX INFO: renamed from: d */
    public String f42018d;

    /* JADX INFO: renamed from: e */
    public String f42019e;

    /* JADX INFO: renamed from: f */
    public Moment f42020f;

    /* JADX INFO: renamed from: g */
    public String f42021g;

    /* JADX INFO: renamed from: h */
    public String f42022h;

    /* JADX INFO: renamed from: i */
    public boolean f42023i;

    /* JADX INFO: renamed from: j */
    public String f42024j;

    /* JADX INFO: renamed from: k */
    public w30 f42025k;

    /* JADX INFO: renamed from: l */
    public w30 f42026l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView$a */
    public class C11430a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f42027a;

        public C11430a(int i) {
            this.f42027a = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PhotoAlbumCommentExpandDetailsView photoAlbumCommentExpandDetailsView = PhotoAlbumCommentExpandDetailsView.this;
            photoAlbumCommentExpandDetailsView.m64767y0(photoAlbumCommentExpandDetailsView.f42015a.owner);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f42027a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView$b */
    public class C11431b extends ClickableSpan {
        public C11431b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PhotoAlbumCommentExpandDetailsView photoAlbumCommentExpandDetailsView = PhotoAlbumCommentExpandDetailsView.this;
            photoAlbumCommentExpandDetailsView.m64767y0(photoAlbumCommentExpandDetailsView.f42015a.owner);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(FeedModule.f39700a.getResources().getColor(k9c0.f124470B));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView$c */
    public class C11432c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f42030a;

        public C11432c(int i) {
            this.f42030a = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PhotoAlbumCommentExpandDetailsView photoAlbumCommentExpandDetailsView = PhotoAlbumCommentExpandDetailsView.this;
            photoAlbumCommentExpandDetailsView.m64767y0(photoAlbumCommentExpandDetailsView.f42015a.api_only_otherUser);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f42030a);
        }
    }

    public PhotoAlbumCommentExpandDetailsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m64695B(MomentMessage momentMessage, y20 y20Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            l51.m152911q(momentMessage.value);
        } else if (NullChecker.m82487b(y20Var)) {
            y20Var.call(momentMessage);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m64715r0(boolean z, int i, ImageView imageView, TextView textView) {
        if (z) {
            imageView.setImageResource(lbc0.f130992a1);
            textView.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124521n));
        } else {
            imageView.setImageResource(lbc0.f130984Z0);
            textView.setTextColor(FeedModule.f39700a.getResources().getColor(k9c0.f124479K));
        }
        bnl0.m105524M(textView, i > 0);
        textView.setText(q8g0.m175802h0(i));
    }

    /* JADX INFO: renamed from: D */
    public abstract Act mo64668D();

    /* JADX INFO: renamed from: E */
    public final int m64724E(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append("     ");
        spannableStringBuilder.setSpan(new otg(getContext(), BitmapFactory.decodeResource(getResources(), lbc0.f130815C0)), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 33);
        return 3;
    }

    /* JADX INFO: renamed from: F */
    public final void m64725F() {
        k3h.m148107w0(mo64668D(), mo64668D().getString(R$string.f40006u4), new x20() { // from class: l.ka70
            @Override // p153l.x20
            public final void call() {
                this.f124629a.m64738U();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m64726G(w30 w30Var) {
        if (NullChecker.m82486a(w30Var) && w30Var.m204616d()) {
            w30Var.m204614b();
        }
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m64727H(String str, String str2, String str3, String str4, boolean z, int i, int i2) {
        List<String> listM134065f = h9i.m134065f(getCommentName().getPaint(), mo64670N(str, str2, z), str, str2, str3, str4, z, new ucj() { // from class: l.v970
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return this.f182961a.m64730K((String) obj, (String) obj2, (String) obj3, (String) obj4, ((Boolean) obj5).booleanValue());
            }
        });
        return m64729J(str, str2, listM134065f.get(0), listM134065f.get(1), z, i, i2);
    }

    /* JADX INFO: renamed from: I */
    public final CommentStatus m64728I(boolean z) {
        MomentMessage momentMessage = this.f42015a;
        return z ? momentMessage.status : momentMessage.commentInfo.status;
    }

    /* JADX INFO: renamed from: J */
    public CharSequence m64729J(String str, String str2, String str3, String str4, boolean z, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = str3.length();
        int length2 = str4.length();
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new C11430a(i), 0, length, 17);
        m64732O(str, spannableStringBuilder, length);
        if (z) {
            spannableStringBuilder.setSpan(new C11431b(), spannableStringBuilder.length() - m64724E(spannableStringBuilder), spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) str4);
            spannableStringBuilder.setSpan(new C11432c(i2), spannableStringBuilder.length() - length2, spannableStringBuilder.length(), 17);
            m64732O(str2, spannableStringBuilder, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K */
    public String m64730K(String str, String str2, String str3, String str4, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append(m64733P(str) ? "作者" : "");
        if (z) {
            spannableStringBuilder.append((CharSequence) (MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + getResources().getString(R$string.f39869a3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
            spannableStringBuilder.append((CharSequence) str4);
            spannableStringBuilder.append((CharSequence) (m64733P(str2) ? "作者" : ""));
        }
        return spannableStringBuilder.toString();
    }

    /* JADX INFO: renamed from: L */
    public abstract String mo64669L(boolean z);

    /* JADX INFO: renamed from: M */
    public final String m64731M(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (owi.m169566b() && TEnum.equals(m64728I(z), "selfOnly")) {
            sb.append(mo64668D().getString(R$string.f39941k5));
            if (f42014m == null) {
                f42014m = cai.m108499g(getTime(), qa00.m175859d(5.0f));
            }
            sb.append(f42014m);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: N */
    public abstract float mo64670N(String str, String str2, boolean z);

    /* JADX INFO: renamed from: O */
    public final void m64732O(String str, SpannableStringBuilder spannableStringBuilder, int i) {
        if (m64733P(str)) {
            TextView textView = new TextView(getContext());
            textView.setText("作者");
            textView.setTextSize(9.0f);
            textView.setTextColor(getResources().getColor(k9c0.f124519m));
            textView.setPadding(qa00.m175859d(4.0f), qa00.m175859d(2.0f), qa00.m175859d(4.0f), qa00.m175859d(2.0f));
            textView.setGravity(17);
            textView.getPaint().setFakeBoldText(true);
            textView.setBackgroundResource(lbc0.f130807B0);
            textView.setDrawingCacheEnabled(true);
            textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
            Bitmap drawingCache = textView.getDrawingCache();
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(new otg(getContext(), drawingCache), i + 1, i + 2, 33);
        }
    }

    /* JADX INFO: renamed from: P */
    public boolean m64733P(String str) {
        String str2;
        return (TextUtils.isEmpty(str) || (str2 = this.f42018d) == null || !str2.equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m64734Q() {
        return FeedModule.m61405F().userId().equals(this.f42015a.owner);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m64735R() {
        return FeedModule.m61405F().userId().equals(this.f42018d);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m64736S(uxj0 uxj0Var) {
        mo64668D().progressDismiss();
        ((wh00) this.f42017c).mo139298a();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m64737T(Throwable th) {
        i4h.m138538g(th);
        mo64668D().progressDismiss();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m64738U() {
        mo64668D().progress(R$string.f39832U2, true);
        this.f42017c.m161686l(this.f42018d, this.f42019e, this.f42015a).subscribe(psd0.m173597H(new y20() { // from class: l.la70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130661a.m64736S((uxj0) obj);
            }
        }, new y20() { // from class: l.ma70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135487a.m64737T((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m64739V(String str, View view) {
        if (m64734Q()) {
            ArrayList<CharSequence> arrayListM147507f0 = jyb.m147507f0(mo64668D().getString(R$string.f39869a3));
            if (!TextUtils.isEmpty(getCommentText().getText().toString())) {
                arrayListM147507f0.add(mo64668D().getString(R$string.f39746G0));
            }
            arrayListM147507f0.add(mo64668D().getString(R$string.f39900f));
            m64764v0(arrayListM147507f0, str);
            return true;
        }
        if (!m64735R()) {
            ArrayList<CharSequence> arrayListM147507f1 = jyb.m147507f0(mo64668D().getString(R$string.f39869a3));
            if (!TextUtils.isEmpty(getCommentText().getText().toString())) {
                arrayListM147507f1.add(mo64668D().getString(R$string.f39746G0));
            }
            arrayListM147507f1.add(mo64668D().getString(R$string.f39821S3));
            m64765w0(arrayListM147507f1, str);
            return true;
        }
        ArrayList<CharSequence> arrayListM147507f2 = jyb.m147507f0(mo64668D().getString(R$string.f39869a3));
        if (!TextUtils.isEmpty(getCommentText().getText().toString())) {
            arrayListM147507f2.add(mo64668D().getString(R$string.f39746G0));
        }
        arrayListM147507f2.add(mo64668D().getString(R$string.f39900f));
        arrayListM147507f2.add(mo64668D().getString(R$string.f39821S3));
        if (!TEnum.equals(this.f42015a.status(), "normal")) {
            arrayListM147507f2.remove(1);
        }
        m64764v0(arrayListM147507f2, str);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m64740W(final String str, View view) {
        if (NullChecker.m82487b(view)) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.w970
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f187980a.m64739V(str, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m64741X(View view) {
        if (NullChecker.m82486a(this.f42015a)) {
            if (this.f42023i) {
                er60.m122104w().m122116e(this.f42020f, this.f42015a);
            } else {
                er60.m122104w().m122121j(this.f42020f, this.f42015a);
            }
            m64767y0(this.f42015a.owner);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m64742Y() {
        if (NullChecker.m82486a(this.f42026l) && this.f42026l.m204616d()) {
            this.f42026l.m204614b();
        }
        if (NullChecker.m82486a(this.f42025k) && this.f42025k.m204616d()) {
            this.f42025k.m204614b();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m64743Z(ImageView imageView, TextView textView, uxj0 uxj0Var) {
        MomentMessage momentMessage = this.f42015a;
        boolean z = momentMessage.liked;
        boolean z2 = !z;
        momentMessage.liked = z2;
        if (z) {
            momentMessage.likes--;
        } else {
            momentMessage.likes++;
        }
        m64715r0(z2, momentMessage.likes, imageView, textView);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m64744a0(ImageView imageView, TextView textView, uxj0 uxj0Var) {
        Object obj = this.f42017c;
        if (obj instanceof wh00) {
            ((wh00) obj).mo139299c();
        }
        MomentMessage momentMessage = this.f42015a;
        CommentInfo commentInfo = momentMessage.commentInfo;
        boolean z = commentInfo.liked;
        commentInfo.liked = !z;
        if (z) {
            commentInfo.likes--;
        } else {
            commentInfo.likes++;
        }
        FeedModule.f39703d.f121300H0.put(momentMessage.f56856id, momentMessage);
        CommentInfo commentInfo2 = this.f42015a.commentInfo;
        m64715r0(commentInfo2.liked, commentInfo2.likes, imageView, textView);
        FeedModule.f39703d.f121324R0.m137019l(this.f42015a.f56856id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m64745b0(n570 n570Var, MomentMessage momentMessage, View view) {
        ((wh00) n570Var).mo139300d(momentMessage, mo64669L(false));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m64746c0(boolean z, View view) {
        m64759p0(getLikeIndicator(), getLikeCount(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m64747d0(n570 n570Var, MomentMessage momentMessage, View view) {
        ((wh00) n570Var).mo139300d(momentMessage, mo64669L(true));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ boolean m64748e0(final MomentMessage momentMessage, final y20 y20Var, View view) {
        if (!FeedModule.m61405F().userId().equals(momentMessage.owner)) {
            w1e.m204398b(mo64668D(), momentMessage.value);
            return true;
        }
        ArrayList arrayListM147507f0 = jyb.m147507f0(mo64668D().getString(R$string.f39893e), mo64668D().getString(R$string.f39797O3));
        if (!TEnum.equals(momentMessage.status(), "normal")) {
            arrayListM147507f0.remove(1);
        }
        mo64668D().dialog().m21534e0(arrayListM147507f0).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.ua70
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                PhotoAlbumCommentExpandDetailsView.m64695B(momentMessage, y20Var, dialog, view2, i, charSequence);
            }
        }).m21567z0();
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m64749f0(final MomentMessage momentMessage, final y20 y20Var, View view) {
        if (NullChecker.m82487b(view)) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.sa70
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f167011a.m64748e0(momentMessage, y20Var, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m64750g0(Media media, StickerInfo stickerInfo, View view) {
        mo64668D().startActivityWithCustomTransition(FeedCommentPhotoPreviewAct.m65249X1(mo64668D(), jyb.m147507f0(media), stickerInfo, this.f42019e), new d4h());
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
    public final /* synthetic */ void m64751h0(boolean z, View view) {
        y3i.m214147a(this.f42020f, this.f42024j);
        ((wh00) this.f42017c).mo139300d(this.f42015a, mo64669L(z));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m64752i0(String str, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (TextUtils.equals(c22660a.f210081a, mo64668D().getString(R$string.f39869a3))) {
            m64726G(this.f42025k);
            l51.m152888H(mo64668D(), new Runnable() { // from class: l.ja70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f118953a.m64754k0();
                }
            }, 200L);
        } else if (TextUtils.equals(c22660a.f210081a, mo64668D().getString(R$string.f39900f))) {
            m64725F();
        } else if (TextUtils.equals(c22660a.f210081a, mo64668D().getString(R$string.f39821S3))) {
            Act actMo64668D = mo64668D();
            MomentMessage momentMessage = this.f42015a;
            rzi.m183775V(actMo64668D, "dynamicReview", momentMessage.owner, str, momentMessage.f56856id);
        } else {
            i4g0.m138523u("e_copy_comment", "p_comment_interaction_pop", jyb.m147494Y("moment_id", str), jyb.m147494Y("comment_id", NullChecker.m82486a(this.f42015a) ? this.f42015a.f56856id : ""));
            l51.m152911q(this.f42015a.value);
            r1j0.m179420g(mo64668D().getString(R$string.f39740F0));
        }
        m64726G(this.f42025k);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m64753j0(View view) {
        this.f42025k.m204614b();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m64754k0() {
        getCommentText().performClick();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m64755l0(View view) {
        this.f42026l.m204614b();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m64756m0() {
        getCommentText().performClick();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m64757n0(String str, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (i == 0) {
            m64726G(this.f42026l);
            l51.m152888H(mo64668D(), new Runnable() { // from class: l.ia70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113562a.m64756m0();
                }
            }, 200L);
        } else if (i == 1) {
            i4g0.m138523u("e_copy_comment", "p_comment_interaction_pop", jyb.m147494Y("moment_id", str), jyb.m147494Y("comment_id", NullChecker.m82486a(this.f42015a) ? this.f42015a.f56856id : ""));
            l51.m152911q(this.f42015a.value);
            r1j0.m179420g(mo64668D().getString(R$string.f39740F0));
        } else {
            Act actMo64668D = mo64668D();
            MomentMessage momentMessage = this.f42015a;
            rzi.m183775V(actMo64668D, "dynamicReview", momentMessage.owner, str, momentMessage.f56856id);
        }
        m64726G(this.f42026l);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m64758o0(final String str) {
        jyb.m147537z(jyb.m147507f0(this, getCommentName(), getCommentText(), getCommentSticker()), new y20() { // from class: l.u970
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178102a.m64740W(str, (View) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        getPic().setOnClickListener(new View.OnClickListener() { // from class: l.na70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140989a.m64741X(view);
            }
        });
        mo64668D().creates(null, new x20() { // from class: l.oa70
            @Override // p153l.x20
            public final void call() {
                this.f145668a.m64742Y();
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m64759p0(final ImageView imageView, final TextView textView, boolean z) {
        if (this.f42015a.f56856id.startsWith("fake_id_")) {
            return;
        }
        MomentMessage momentMessage = this.f42015a;
        if (!z ? !momentMessage.commentInfo.liked : !momentMessage.liked) {
            tfj0.m190939b("e_comment_like", this.f42023i ? "p_immersion_comment_page" : "p_user_moment_interactions_details_view", tfj0.C20302a.m190949g("moment_id", this.f42019e), tfj0.C20302a.m190949g("owner_id", this.f42018d));
        }
        n570 n570Var = this.f42017c;
        if (z) {
            String str = this.f42022h;
            String str2 = this.f42021g;
            MomentMessage momentMessage2 = this.f42015a;
            n570Var.m161692v(str, str2, momentMessage2.f56856id, !momentMessage2.liked).subscribe(psd0.m173597H(new y20() { // from class: l.x970
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192919a.m64743Z(imageView, textView, (uxj0) obj);
                }
            }, new y20() { // from class: l.y970
                @Override // p153l.y20
                public final void call(Object obj) {
                    i4h.m138538g((Throwable) obj);
                }
            }));
            return;
        }
        String str3 = this.f42018d;
        String str4 = this.f42019e;
        MomentMessage momentMessage3 = this.f42015a;
        n570Var.m161691u(str3, str4, momentMessage3.f56856id, !momentMessage3.commentInfo.liked).subscribe(psd0.m173597H(new y20() { // from class: l.z970
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203447a.m64744a0(imageView, textView, (uxj0) obj);
            }
        }, new y20() { // from class: l.aa70
            @Override // p153l.y20
            public final void call(Object obj) {
                i4h.m138538g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public void m64760q0(di5 di5Var, final n570 n570Var, final MomentMessage momentMessage, String str, Moment moment, String str2) {
        this.f42016b = di5Var;
        this.f42015a = momentMessage;
        this.f42017c = n570Var;
        this.f42018d = str;
        this.f42019e = moment.f56859id;
        this.f42020f = moment;
        this.f42024j = str2;
        m64763u0(false);
        getCommentText().setOnClickListener(new View.OnClickListener() { // from class: l.ta70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172702a.m64745b0(n570Var, momentMessage, view);
            }
        });
        m64758o0(this.f42019e);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m64761s0(final boolean z) {
        MomentMessage momentMessage = this.f42015a;
        boolean z2 = z ? momentMessage.liked : momentMessage.commentInfo.liked;
        MomentMessage momentMessage2 = this.f42015a;
        m64715r0(z2, z ? momentMessage2.likes : momentMessage2.commentInfo.likes, getLikeIndicator(), getLikeCount());
        getLikeCountContainer().setOnClickListener(new View.OnClickListener() { // from class: l.t970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172611a.m64746c0(z, view);
            }
        });
    }

    public void setIsFromImmersionVideo(boolean z) {
        this.f42023i = z;
    }

    /* JADX INFO: renamed from: t0 */
    public void m64762t0(di5 di5Var, final n570 n570Var, final MomentMessage momentMessage, final y20<MomentMessage> y20Var, String str, String str2, String str3) {
        this.f42016b = di5Var;
        this.f42015a = momentMessage;
        this.f42017c = n570Var;
        this.f42021g = str;
        this.f42022h = str2;
        this.f42019e = str3;
        m64763u0(true);
        getCommentText().setOnClickListener(new View.OnClickListener() { // from class: l.s970
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166910a.m64747d0(n570Var, momentMessage, view);
            }
        });
        jyb.m147537z(jyb.m147507f0(this, getCommentName(), getCommentText()), new y20() { // from class: l.da70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85848a.m64749f0(momentMessage, y20Var, (View) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0199  */
    /* JADX INFO: renamed from: u0 */
    public final void m64763u0(final boolean z) {
        String str;
        final StickerInfo stickerInfo;
        User userMo137270m = this.f42017c.mo137270m(this.f42015a.owner);
        if (userMo137270m == null) {
            return;
        }
        if (mo64668D() instanceof ImmersionVideoMomentDetailAct) {
            uqb0.f180374G.m127125Q0(getPic(), userMo137270m.m61308fp().profileSmall());
            getPicFrame().m80878G0(false);
        } else {
            at0.m100011e(this.f42020f, getPic(), userMo137270m);
            if (!at0.m100010d(this.f42020f)) {
                getPicFrame().m80885n0(userMo137270m);
            }
        }
        String str2 = userMo137270m.name;
        uqb0.f180396b0.f170325b.showUserVerificationLogo(mo64668D(), userMo137270m, getPicVerification());
        getResources().getString(R$string.f39869a3);
        final Media media = null;
        User userMo137270m2 = (TextUtils.isEmpty(this.f42015a.api_only_otherUser) || this.f42015a.api_only_otherUser.equals("-10010")) ? null : this.f42017c.mo137270m(this.f42015a.api_only_otherUser);
        if (NullChecker.m82486a(userMo137270m2) && this.f42015a.isChildComment()) {
            getCommentName().setText(m64727H(userMo137270m.f56859id, userMo137270m2.f56859id, at0.m100007a(this.f42020f, str2), at0.m100007a(this.f42020f, userMo137270m2.name), true, cai.m108493a(userMo137270m), cai.m108493a(userMo137270m2)));
        } else if (!NullChecker.m82486a(userMo137270m2) || ((str = this.f42018d) != null && str.equals(this.f42015a.api_only_otherUser))) {
            getCommentName().setText(m64727H(userMo137270m.f56859id, "", at0.m100007a(this.f42020f, str2), "", false, cai.m108493a(userMo137270m), cai.m108493a(userMo137270m2)));
        } else {
            getCommentName().setText(m64727H(userMo137270m.f56859id, userMo137270m2.f56859id, at0.m100007a(this.f42020f, str2), at0.m100007a(this.f42020f, userMo137270m2.name), true, cai.m108493a(userMo137270m), cai.m108493a(userMo137270m2)));
        }
        getCommentName().setMovementMethod(LinkMovementMethod.getInstance());
        getCommentText().setText(this.f42015a.value);
        bnl0.m105524M(getCommentText(), !TextUtils.isEmpty(this.f42015a.value));
        boolean zEquals = TEnum.equals(this.f42015a.messageType, "sticker");
        MomentMessage momentMessage = this.f42015a;
        if (zEquals) {
            final String str3 = momentMessage.accessory.f40061id;
            if (TextUtils.isEmpty(str3) || jyb.m147479J(this.f42016b.f88579d)) {
                stickerInfo = null;
            } else {
                stickerInfo = (StickerInfo) jyb.m147529r(this.f42016b.f88579d, new qcj() { // from class: l.pa70
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((StickerInfo) obj).f56859id, str3));
                    }
                });
            }
        } else if (TEnum.equals(momentMessage.messageType, "picture")) {
            List<Media> list = this.f42015a.media;
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
            getCommentSticker().getHierarchy().m207045H(RoundingParams.m8303c(qa00.m175859d(10.0f)).m8323w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            ezq.m123397b(getCommentSticker(), 10.0f);
            Picture picture = NullChecker.m82486a(media) ? (Picture) media : stickerInfo.pictures.get(0);
            getCommentSticker().setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
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
                bnl0.m105505C0(getCommentStickerContent(), iM175859d);
                bnl0.m105505C0(getCommentSticker(), iM175859d - qa00.m175859d(2.0f));
                if (NullChecker.m82486a(media)) {
                    uqb0.f180374G.m127109I0(getCommentSticker(), media.url, qa00.m175859d(120.0f), iM175859d - qa00.m175859d(2.0f));
                } else if (TEnum.equals(stickerInfo.source, "shanmeng")) {
                    uqb0.f180374G.m127109I0(getCommentSticker(), stickerInfo.pictures.get(0).url, qa00.m175859d(120.0f), iM175859d - qa00.m175859d(2.0f));
                } else {
                    uqb0.f180374G.m127096B0(getCommentSticker(), m64766x0(stickerInfo.pictures.get(0)));
                }
            }
            bnl0.m105524M(getCommentStickerContent(), true);
            bnl0.m105509E0(getCommentSticker(), new View.OnClickListener() { // from class: l.qa70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156349a.m64750g0(media, stickerInfo, view);
                }
            });
        } else {
            bnl0.m105524M(getCommentStickerContent(), false);
        }
        getTime().setText(m64731M(z) + pzi0.m174442G(this.f42015a.createdTime));
        m64761s0(z);
        getReply().setOnClickListener(new View.OnClickListener() { // from class: l.ra70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161900a.m64751h0(z, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m64764v0(ArrayList<CharSequence> arrayList, final String str) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_comment_interaction_pop", android.app.Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("moment_id", str), jyb.m147494Y("comment_id", NullChecker.m82486a(this.f42015a) ? this.f42015a.f56856id : ""));
        w1e.m204402f(l4g0VarM204399c);
        w30.C21001b c21001b = new w30.C21001b(mo64668D());
        c21001b.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.ba70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75649a.m64753j0(view);
            }
        }).m204665Q(arrayList).m204668T(new DialogInterface.OnDismissListener() { // from class: l.ca70
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m204666R(new int[]{arrayList.indexOf(mo64668D().getString(R$string.f39821S3))}, new int[]{k9c0.f124523o}).m204670V(new w30.InterfaceC21003d() { // from class: l.ea70
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f92744a.m64752i0(str, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f42025k = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: w0 */
    public void m64765w0(ArrayList<CharSequence> arrayList, final String str) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_comment_interaction_pop", android.app.Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("moment_id", str), jyb.m147494Y("comment_id", NullChecker.m82486a(this.f42015a) ? this.f42015a.f56856id : ""));
        w1e.m204402f(l4g0VarM204399c);
        w30.C21001b c21001b = new w30.C21001b(mo64668D());
        c21001b.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.fa70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97949a.m64755l0(view);
            }
        }).m204668T(new DialogInterface.OnDismissListener() { // from class: l.ga70
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m204666R(new int[]{arrayList.indexOf(mo64668D().getString(R$string.f39821S3))}, new int[]{k9c0.f124523o}).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.ha70
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f108474a.m64757n0(str, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f42026l = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: x0 */
    public Picture.ImageUri m64766x0(Picture picture) {
        return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m64767y0(String str) {
        if (FeedModule.m61405F().userId().equals(str)) {
            mo64668D().startActivity(at0.m100009c(mo64668D(), str, "all_comment_detail_item"));
        } else {
            at0.m100016j(mo64668D(), this.f42020f, str, "all_comment_detail_item", false);
        }
    }

    public PhotoAlbumCommentExpandDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentExpandDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
