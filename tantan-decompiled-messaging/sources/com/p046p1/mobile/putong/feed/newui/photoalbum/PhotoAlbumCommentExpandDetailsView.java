package com.p046p1.mobile.putong.feed.newui.photoalbum;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.CommentStatus;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.immersionvideo.ImmersionVideoMomentDetailAct;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VListCell;
import p147v.VRelative;
import p147v.VText;
import p149l.aaj;
import p149l.bsg;
import p149l.c40;
import p149l.cwf0;
import p149l.d30;
import p149l.dh5;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.exq;
import p149l.f3c0;
import p149l.hx60;
import p149l.i0e;
import p149l.i0g0;
import p149l.j2i;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n8i;
import p149l.n900;
import p149l.o2h;
import p149l.osi0;
import p149l.p6j0;
import p149l.qib0;
import p149l.roj0;
import p149l.s7i;
import p149l.sti;
import p149l.t100;
import p149l.t2h;
import p149l.v1h;
import p149l.vs0;
import p149l.vwb;
import p149l.vwi;
import p149l.w9j;
import p149l.xdl0;
import p149l.zi60;
import p149l.zrg;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PhotoAlbumCommentExpandDetailsView extends RelativeLayout {

    /* JADX INFO: renamed from: m */
    public static String f41166m;

    /* JADX INFO: renamed from: a */
    public MomentMessage f41167a;

    /* JADX INFO: renamed from: b */
    public dh5 f41168b;

    /* JADX INFO: renamed from: c */
    public hx60 f41169c;

    /* JADX INFO: renamed from: d */
    public String f41170d;

    /* JADX INFO: renamed from: e */
    public String f41171e;

    /* JADX INFO: renamed from: f */
    public Moment f41172f;

    /* JADX INFO: renamed from: g */
    public String f41173g;

    /* JADX INFO: renamed from: h */
    public String f41174h;

    /* JADX INFO: renamed from: i */
    public boolean f41175i;

    /* JADX INFO: renamed from: j */
    public String f41176j;

    /* JADX INFO: renamed from: k */
    public c40 f41177k;

    /* JADX INFO: renamed from: l */
    public c40 f41178l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView$a */
    public class C11267a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f41179a;

        public C11267a(int i) {
            this.f41179a = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PhotoAlbumCommentExpandDetailsView photoAlbumCommentExpandDetailsView = PhotoAlbumCommentExpandDetailsView.this;
            photoAlbumCommentExpandDetailsView.m63584y0(photoAlbumCommentExpandDetailsView.f41167a.owner);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f41179a);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView$b */
    public class C11268b extends ClickableSpan {
        public C11268b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PhotoAlbumCommentExpandDetailsView photoAlbumCommentExpandDetailsView = PhotoAlbumCommentExpandDetailsView.this;
            photoAlbumCommentExpandDetailsView.m63584y0(photoAlbumCommentExpandDetailsView.f41167a.owner);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(FeedModule.f38852a.getResources().getColor(e1c0.f88747B));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView$c */
    public class C11269c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f41182a;

        public C11269c(int i) {
            this.f41182a = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            PhotoAlbumCommentExpandDetailsView photoAlbumCommentExpandDetailsView = PhotoAlbumCommentExpandDetailsView.this;
            photoAlbumCommentExpandDetailsView.m63584y0(photoAlbumCommentExpandDetailsView.f41167a.api_only_otherUser);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f41182a);
        }
    }

    public PhotoAlbumCommentExpandDetailsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m63512B(MomentMessage momentMessage, e30 e30Var, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            e51.m114766q(momentMessage.value);
        } else if (NullChecker.m81304b(e30Var)) {
            e30Var.call(momentMessage);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static void m63532r0(boolean z, int i, ImageView imageView, TextView textView) {
        if (z) {
            imageView.setImageResource(f3c0.f94474a1);
            textView.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88798n));
        } else {
            imageView.setImageResource(f3c0.f94466Z0);
            textView.setTextColor(FeedModule.f38852a.getResources().getColor(e1c0.f88756K));
        }
        xdl0.m208344M(textView, i > 0);
        textView.setText(i0g0.m133867h0(i));
    }

    /* JADX INFO: renamed from: D */
    public abstract Act mo63485D();

    /* JADX INFO: renamed from: E */
    public final int m63541E(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append("     ");
        spannableStringBuilder.setSpan(new zrg(getContext(), BitmapFactory.decodeResource(getResources(), f3c0.f94297C0)), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 33);
        return 3;
    }

    /* JADX INFO: renamed from: F */
    public final void m63542F() {
        v1h.m196630w0(mo63485D(), mo63485D().getString(R$string.f39158u4), new d30() { // from class: l.e270
            @Override // p149l.d30
            public final void call() {
                this.f88894a.m63555U();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final void m63543G(c40 c40Var) {
        if (NullChecker.m81303a(c40Var) && c40Var.m105115d()) {
            c40Var.m105113b();
        }
    }

    /* JADX INFO: renamed from: H */
    public final CharSequence m63544H(String str, String str2, String str3, String str4, boolean z, int i, int i2) {
        List<String> listM182492f = s7i.m182492f(getCommentName().getPaint(), mo63487N(str, str2, z), str, str2, str3, str4, z, new aaj() { // from class: l.p170
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return this.f146656a.m63547K((String) obj, (String) obj2, (String) obj3, (String) obj4, ((Boolean) obj5).booleanValue());
            }
        });
        return m63546J(str, str2, listM182492f.get(0), listM182492f.get(1), z, i, i2);
    }

    /* JADX INFO: renamed from: I */
    public final CommentStatus m63545I(boolean z) {
        MomentMessage momentMessage = this.f41167a;
        return z ? momentMessage.status : momentMessage.commentInfo.status;
    }

    /* JADX INFO: renamed from: J */
    public CharSequence m63546J(String str, String str2, String str3, String str4, boolean z, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = str3.length();
        int length2 = str4.length();
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.setSpan(new C11267a(i), 0, length, 17);
        m63549O(str, spannableStringBuilder, length);
        if (z) {
            spannableStringBuilder.setSpan(new C11268b(), spannableStringBuilder.length() - m63541E(spannableStringBuilder), spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) str4);
            spannableStringBuilder.setSpan(new C11269c(i2), spannableStringBuilder.length() - length2, spannableStringBuilder.length(), 17);
            m63549O(str2, spannableStringBuilder, spannableStringBuilder.length());
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: K */
    public String m63547K(String str, String str2, String str3, String str4, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str3);
        spannableStringBuilder.append(m63550P(str) ? "作者" : "");
        if (z) {
            spannableStringBuilder.append((CharSequence) (MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + getResources().getString(R$string.f39021a3) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
            spannableStringBuilder.append((CharSequence) str4);
            spannableStringBuilder.append((CharSequence) (m63550P(str2) ? "作者" : ""));
        }
        return spannableStringBuilder.toString();
    }

    /* JADX INFO: renamed from: L */
    public abstract String mo63486L(boolean z);

    /* JADX INFO: renamed from: M */
    public final String m63548M(boolean z) {
        StringBuilder sb = new StringBuilder();
        if (sti.m185956b() && TEnum.equals(m63545I(z), "selfOnly")) {
            sb.append(mo63485D().getString(R$string.f39093k5));
            if (f41166m == null) {
                f41166m = n8i.m158500g(getTime(), t100.m186890d(5.0f));
            }
            sb.append(f41166m);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: N */
    public abstract float mo63487N(String str, String str2, boolean z);

    /* JADX INFO: renamed from: O */
    public final void m63549O(String str, SpannableStringBuilder spannableStringBuilder, int i) {
        if (m63550P(str)) {
            TextView textView = new TextView(getContext());
            textView.setText("作者");
            textView.setTextSize(9.0f);
            textView.setTextColor(getResources().getColor(e1c0.f88796m));
            textView.setPadding(t100.m186890d(4.0f), t100.m186890d(2.0f), t100.m186890d(4.0f), t100.m186890d(2.0f));
            textView.setGravity(17);
            textView.getPaint().setFakeBoldText(true);
            textView.setBackgroundResource(f3c0.f94289B0);
            textView.setDrawingCacheEnabled(true);
            textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
            Bitmap drawingCache = textView.getDrawingCache();
            spannableStringBuilder.append("  ");
            spannableStringBuilder.setSpan(new zrg(getContext(), drawingCache), i + 1, i + 2, 33);
        }
    }

    /* JADX INFO: renamed from: P */
    public boolean m63550P(String str) {
        String str2;
        return (TextUtils.isEmpty(str) || (str2 = this.f41170d) == null || !str2.equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m63551Q() {
        return FeedModule.m60221F().userId().equals(this.f41167a.owner);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m63552R() {
        return FeedModule.m60221F().userId().equals(this.f41170d);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m63553S(roj0 roj0Var) {
        mo63485D().progressDismiss();
        ((n900) this.f41169c).mo104987a();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m63554T(Throwable th) {
        t2h.m186976g(th);
        mo63485D().progressDismiss();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m63555U() {
        mo63485D().progress(R$string.f38984U2, true);
        this.f41169c.m133305l(this.f41170d, this.f41171e, this.f41167a).subscribe(mkd0.m154956H(new e30() { // from class: l.f270
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94157a.m63553S((roj0) obj);
            }
        }, new e30() { // from class: l.g270
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100242a.m63554T((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ boolean m63556V(String str, View view) {
        if (m63551Q()) {
            ArrayList<CharSequence> arrayListM200324f0 = vwb.m200324f0(mo63485D().getString(R$string.f39021a3));
            if (!TextUtils.isEmpty(getCommentText().getText().toString())) {
                arrayListM200324f0.add(mo63485D().getString(R$string.f38898G0));
            }
            arrayListM200324f0.add(mo63485D().getString(R$string.f39052f));
            m63581v0(arrayListM200324f0, str);
            return true;
        }
        if (!m63552R()) {
            ArrayList<CharSequence> arrayListM200324f1 = vwb.m200324f0(mo63485D().getString(R$string.f39021a3));
            if (!TextUtils.isEmpty(getCommentText().getText().toString())) {
                arrayListM200324f1.add(mo63485D().getString(R$string.f38898G0));
            }
            arrayListM200324f1.add(mo63485D().getString(R$string.f38973S3));
            m63582w0(arrayListM200324f1, str);
            return true;
        }
        ArrayList<CharSequence> arrayListM200324f2 = vwb.m200324f0(mo63485D().getString(R$string.f39021a3));
        if (!TextUtils.isEmpty(getCommentText().getText().toString())) {
            arrayListM200324f2.add(mo63485D().getString(R$string.f38898G0));
        }
        arrayListM200324f2.add(mo63485D().getString(R$string.f39052f));
        arrayListM200324f2.add(mo63485D().getString(R$string.f38973S3));
        if (!TEnum.equals(this.f41167a.status(), "normal")) {
            arrayListM200324f2.remove(1);
        }
        m63581v0(arrayListM200324f2, str);
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m63557W(final String str, View view) {
        if (NullChecker.m81304b(view)) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.q170
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f152109a.m63556V(str, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m63558X(View view) {
        if (NullChecker.m81303a(this.f41167a)) {
            if (this.f41175i) {
                zi60.m218961w().m218973e(this.f41172f, this.f41167a);
            } else {
                zi60.m218961w().m218978j(this.f41172f, this.f41167a);
            }
            m63584y0(this.f41167a.owner);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m63559Y() {
        if (NullChecker.m81303a(this.f41178l) && this.f41178l.m105115d()) {
            this.f41178l.m105113b();
        }
        if (NullChecker.m81303a(this.f41177k) && this.f41177k.m105115d()) {
            this.f41177k.m105113b();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m63560Z(ImageView imageView, TextView textView, roj0 roj0Var) {
        MomentMessage momentMessage = this.f41167a;
        boolean z = momentMessage.liked;
        boolean z2 = !z;
        momentMessage.liked = z2;
        if (z) {
            momentMessage.likes--;
        } else {
            momentMessage.likes++;
        }
        m63532r0(z2, momentMessage.likes, imageView, textView);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m63561a0(ImageView imageView, TextView textView, roj0 roj0Var) {
        Object obj = this.f41169c;
        if (obj instanceof n900) {
            ((n900) obj).mo104988c();
        }
        MomentMessage momentMessage = this.f41167a;
        CommentInfo commentInfo = momentMessage.commentInfo;
        boolean z = commentInfo.liked;
        commentInfo.liked = !z;
        if (z) {
            commentInfo.likes--;
        } else {
            commentInfo.likes++;
        }
        FeedModule.f38855d.f192990H0.put(momentMessage.f56008id, momentMessage);
        CommentInfo commentInfo2 = this.f41167a.commentInfo;
        m63532r0(commentInfo2.liked, commentInfo2.likes, imageView, textView);
        FeedModule.f38855d.f193014R0.m132487l(this.f41167a.f56008id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m63562b0(hx60 hx60Var, MomentMessage momentMessage, View view) {
        ((n900) hx60Var).mo104989d(momentMessage, mo63486L(false));
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m63563c0(boolean z, View view) {
        m63576p0(getLikeIndicator(), getLikeCount(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m63564d0(hx60 hx60Var, MomentMessage momentMessage, View view) {
        ((n900) hx60Var).mo104989d(momentMessage, mo63486L(true));
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ boolean m63565e0(final MomentMessage momentMessage, final e30 e30Var, View view) {
        if (!FeedModule.m60221F().userId().equals(momentMessage.owner)) {
            i0e.m133793b(mo63485D(), momentMessage.value);
            return true;
        }
        ArrayList arrayListM200324f0 = vwb.m200324f0(mo63485D().getString(R$string.f39045e), mo63485D().getString(R$string.f38949O3));
        if (!TEnum.equals(momentMessage.status(), "normal")) {
            arrayListM200324f0.remove(1);
        }
        mo63485D().dialog().m20535e0(arrayListM200324f0).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.o270
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                PhotoAlbumCommentExpandDetailsView.m63512B(momentMessage, e30Var, dialog, view2, i, charSequence);
            }
        }).m20568z0();
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m63566f0(final MomentMessage momentMessage, final e30 e30Var, View view) {
        if (NullChecker.m81304b(view)) {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.m270
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.f130891a.m63565e0(momentMessage, e30Var, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m63567g0(Media media, StickerInfo stickerInfo, View view) {
        mo63485D().startActivityWithCustomTransition(FeedCommentPhotoPreviewAct.m64066V1(mo63485D(), vwb.m200324f0(media), stickerInfo, this.f41171e), new o2h());
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
    public final /* synthetic */ void m63568h0(boolean z, View view) {
        j2i.m139462a(this.f41172f, this.f41176j);
        ((n900) this.f41169c).mo104989d(this.f41167a, mo63486L(z));
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m63569i0(String str, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (TextUtils.equals(c22545a.f209159a, mo63485D().getString(R$string.f39021a3))) {
            m63543G(this.f41177k);
            e51.m114743H(mo63485D(), new Runnable() { // from class: l.d270
                @Override // java.lang.Runnable
                public final void run() {
                    this.f83332a.m63571k0();
                }
            }, 200L);
        } else if (TextUtils.equals(c22545a.f209159a, mo63485D().getString(R$string.f39052f))) {
            m63542F();
        } else if (TextUtils.equals(c22545a.f209159a, mo63485D().getString(R$string.f38973S3))) {
            Act actMo63485D = mo63485D();
            MomentMessage momentMessage = this.f41167a;
            vwi.m200391V(actMo63485D, "dynamicReview", momentMessage.owner, str, momentMessage.f56008id);
        } else {
            zvf0.m220399u("e_copy_comment", "p_comment_interaction_pop", vwb.m200311Y("moment_id", str), vwb.m200311Y("comment_id", NullChecker.m81303a(this.f41167a) ? this.f41167a.f56008id : ""));
            e51.m114766q(this.f41167a.value);
            osi0.m165783g(mo63485D().getString(R$string.f38892F0));
        }
        m63543G(this.f41177k);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m63570j0(View view) {
        this.f41177k.m105113b();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m63571k0() {
        getCommentText().performClick();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m63572l0(View view) {
        this.f41178l.m105113b();
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m63573m0() {
        getCommentText().performClick();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m63574n0(String str, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (i == 0) {
            m63543G(this.f41178l);
            e51.m114743H(mo63485D(), new Runnable() { // from class: l.c270
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78335a.m63573m0();
                }
            }, 200L);
        } else if (i == 1) {
            zvf0.m220399u("e_copy_comment", "p_comment_interaction_pop", vwb.m200311Y("moment_id", str), vwb.m200311Y("comment_id", NullChecker.m81303a(this.f41167a) ? this.f41167a.f56008id : ""));
            e51.m114766q(this.f41167a.value);
            osi0.m165783g(mo63485D().getString(R$string.f38892F0));
        } else {
            Act actMo63485D = mo63485D();
            MomentMessage momentMessage = this.f41167a;
            vwi.m200391V(actMo63485D, "dynamicReview", momentMessage.owner, str, momentMessage.f56008id);
        }
        m63543G(this.f41178l);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m63575o0(final String str) {
        vwb.m200354z(vwb.m200324f0(this, getCommentName(), getCommentText(), getCommentSticker()), new e30() { // from class: l.o170
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141410a.m63557W(str, (View) obj);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        getPic().setOnClickListener(new View.OnClickListener() { // from class: l.h270
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105498a.m63558X(view);
            }
        });
        mo63485D().creates(null, new d30() { // from class: l.i270
            @Override // p149l.d30
            public final void call() {
                this.f110541a.m63559Y();
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m63576p0(final ImageView imageView, final TextView textView, boolean z) {
        if (this.f41167a.f56008id.startsWith("fake_id_")) {
            return;
        }
        MomentMessage momentMessage = this.f41167a;
        if (!z ? !momentMessage.commentInfo.liked : !momentMessage.liked) {
            p6j0.m167668b("e_comment_like", this.f41175i ? "p_immersion_comment_page" : "p_user_moment_interactions_details_view", p6j0.C19147a.m167678g("moment_id", this.f41171e), p6j0.C19147a.m167678g("owner_id", this.f41170d));
        }
        hx60 hx60Var = this.f41169c;
        if (z) {
            String str = this.f41174h;
            String str2 = this.f41173g;
            MomentMessage momentMessage2 = this.f41167a;
            hx60Var.m133314v(str, str2, momentMessage2.f56008id, !momentMessage2.liked).subscribe(mkd0.m154956H(new e30() { // from class: l.r170
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157243a.m63560Z(imageView, textView, (roj0) obj);
                }
            }, new e30() { // from class: l.s170
                @Override // p149l.e30
                public final void call(Object obj) {
                    t2h.m186976g((Throwable) obj);
                }
            }));
            return;
        }
        String str3 = this.f41170d;
        String str4 = this.f41171e;
        MomentMessage momentMessage3 = this.f41167a;
        hx60Var.m133313u(str3, str4, momentMessage3.f56008id, !momentMessage3.commentInfo.liked).subscribe(mkd0.m154956H(new e30() { // from class: l.t170
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167292a.m63561a0(imageView, textView, (roj0) obj);
            }
        }, new e30() { // from class: l.u170
            @Override // p149l.e30
            public final void call(Object obj) {
                t2h.m186976g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q0 */
    public void m63577q0(dh5 dh5Var, final hx60 hx60Var, final MomentMessage momentMessage, String str, Moment moment, String str2) {
        this.f41168b = dh5Var;
        this.f41167a = momentMessage;
        this.f41169c = hx60Var;
        this.f41170d = str;
        this.f41171e = moment.f56011id;
        this.f41172f = moment;
        this.f41176j = str2;
        m63580u0(false);
        getCommentText().setOnClickListener(new View.OnClickListener() { // from class: l.n270
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136771a.m63562b0(hx60Var, momentMessage, view);
            }
        });
        m63575o0(this.f41171e);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m63578s0(final boolean z) {
        MomentMessage momentMessage = this.f41167a;
        boolean z2 = z ? momentMessage.liked : momentMessage.commentInfo.liked;
        MomentMessage momentMessage2 = this.f41167a;
        m63532r0(z2, z ? momentMessage2.likes : momentMessage2.commentInfo.likes, getLikeIndicator(), getLikeCount());
        getLikeCountContainer().setOnClickListener(new View.OnClickListener() { // from class: l.n170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136616a.m63563c0(z, view);
            }
        });
    }

    public void setIsFromImmersionVideo(boolean z) {
        this.f41175i = z;
    }

    /* JADX INFO: renamed from: t0 */
    public void m63579t0(dh5 dh5Var, final hx60 hx60Var, final MomentMessage momentMessage, final e30<MomentMessage> e30Var, String str, String str2, String str3) {
        this.f41168b = dh5Var;
        this.f41167a = momentMessage;
        this.f41169c = hx60Var;
        this.f41173g = str;
        this.f41174h = str2;
        this.f41171e = str3;
        m63580u0(true);
        getCommentText().setOnClickListener(new View.OnClickListener() { // from class: l.m170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130810a.m63564d0(hx60Var, momentMessage, view);
            }
        });
        vwb.m200354z(vwb.m200324f0(this, getCommentName(), getCommentText()), new e30() { // from class: l.x170
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f189032a.m63566f0(momentMessage, e30Var, (View) obj);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0199  */
    /* JADX INFO: renamed from: u0 */
    public final void m63580u0(final boolean z) {
        String str;
        final StickerInfo stickerInfo;
        User userMo133306m = this.f41169c.mo133306m(this.f41167a.owner);
        if (userMo133306m == null) {
            return;
        }
        if (mo63485D() instanceof ImmersionVideoMomentDetailAct) {
            qib0.f154691G.m102341Q0(getPic(), userMo133306m.m60124fp().profileSmall());
            getPicFrame().m79695G0(false);
        } else {
            vs0.m199799e(this.f41172f, getPic(), userMo133306m);
            if (!vs0.m199798d(this.f41172f)) {
                getPicFrame().m79702n0(userMo133306m);
            }
        }
        String str2 = userMo133306m.name;
        qib0.f154713b0.f139231b.showUserVerificationLogo(mo63485D(), userMo133306m, getPicVerification());
        getResources().getString(R$string.f39021a3);
        final Media media = null;
        User userMo133306m2 = (TextUtils.isEmpty(this.f41167a.api_only_otherUser) || this.f41167a.api_only_otherUser.equals("-10010")) ? null : this.f41169c.mo133306m(this.f41167a.api_only_otherUser);
        if (NullChecker.m81303a(userMo133306m2) && this.f41167a.isChildComment()) {
            getCommentName().setText(m63544H(userMo133306m.f56011id, userMo133306m2.f56011id, vs0.m199795a(this.f41172f, str2), vs0.m199795a(this.f41172f, userMo133306m2.name), true, n8i.m158494a(userMo133306m), n8i.m158494a(userMo133306m2)));
        } else if (!NullChecker.m81303a(userMo133306m2) || ((str = this.f41170d) != null && str.equals(this.f41167a.api_only_otherUser))) {
            getCommentName().setText(m63544H(userMo133306m.f56011id, "", vs0.m199795a(this.f41172f, str2), "", false, n8i.m158494a(userMo133306m), n8i.m158494a(userMo133306m2)));
        } else {
            getCommentName().setText(m63544H(userMo133306m.f56011id, userMo133306m2.f56011id, vs0.m199795a(this.f41172f, str2), vs0.m199795a(this.f41172f, userMo133306m2.name), true, n8i.m158494a(userMo133306m), n8i.m158494a(userMo133306m2)));
        }
        getCommentName().setMovementMethod(LinkMovementMethod.getInstance());
        getCommentText().setText(this.f41167a.value);
        xdl0.m208344M(getCommentText(), !TextUtils.isEmpty(this.f41167a.value));
        boolean zEquals = TEnum.equals(this.f41167a.messageType, "sticker");
        MomentMessage momentMessage = this.f41167a;
        if (zEquals) {
            final String str3 = momentMessage.accessory.f39213id;
            if (TextUtils.isEmpty(str3) || vwb.m200296J(this.f41168b.f86235d)) {
                stickerInfo = null;
            } else {
                stickerInfo = (StickerInfo) vwb.m200346r(this.f41168b.f86235d, new w9j() { // from class: l.j270
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((StickerInfo) obj).f56011id, str3));
                    }
                });
            }
        } else if (TEnum.equals(momentMessage.messageType, "picture")) {
            List<Media> list = this.f41167a.media;
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
            getCommentSticker().getHierarchy().m112053H(RoundingParams.m8249c(t100.m186890d(10.0f)).m8269w(RoundingParams.RoundingMethod.BITMAP_ONLY));
            exq.m118693b(getCommentSticker(), 10.0f);
            Picture picture = NullChecker.m81303a(media) ? (Picture) media : stickerInfo.pictures.get(0);
            getCommentSticker().setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
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
                xdl0.m208325C0(getCommentStickerContent(), iM186890d);
                xdl0.m208325C0(getCommentSticker(), iM186890d - t100.m186890d(2.0f));
                if (NullChecker.m81303a(media)) {
                    qib0.f154691G.m102325I0(getCommentSticker(), media.url, t100.m186890d(120.0f), iM186890d - t100.m186890d(2.0f));
                } else if (TEnum.equals(stickerInfo.source, "shanmeng")) {
                    qib0.f154691G.m102325I0(getCommentSticker(), stickerInfo.pictures.get(0).url, t100.m186890d(120.0f), iM186890d - t100.m186890d(2.0f));
                } else {
                    qib0.f154691G.m102312B0(getCommentSticker(), m63583x0(stickerInfo.pictures.get(0)));
                }
            }
            xdl0.m208344M(getCommentStickerContent(), true);
            xdl0.m208329E0(getCommentSticker(), new View.OnClickListener() { // from class: l.k270
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120694a.m63567g0(media, stickerInfo, view);
                }
            });
        } else {
            xdl0.m208344M(getCommentStickerContent(), false);
        }
        getTime().setText(m63548M(z) + mqi0.m155932G(this.f41167a.createdTime));
        m63578s0(z);
        getReply().setOnClickListener(new View.OnClickListener() { // from class: l.l270
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125750a.m63568h0(z, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public void m63581v0(ArrayList<CharSequence> arrayList, final String str) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_comment_interaction_pop", android.app.Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("moment_id", str), vwb.m200311Y("comment_id", NullChecker.m81303a(this.f41167a) ? this.f41167a.f56008id : ""));
        i0e.m133797f(cwf0VarM133794c);
        c40.C16057b c16057b = new c40.C16057b(mo63485D());
        c16057b.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.v170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179203a.m63570j0(view);
            }
        }).m105164Q(arrayList).m105167T(new DialogInterface.OnDismissListener() { // from class: l.w170
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m105165R(new int[]{arrayList.indexOf(mo63485D().getString(R$string.f38973S3))}, new int[]{e1c0.f88800o}).m105169V(new c40.InterfaceC16059d() { // from class: l.y170
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f195391a.m63569i0(str, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f41177k = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: w0 */
    public void m63582w0(ArrayList<CharSequence> arrayList, final String str) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_comment_interaction_pop", android.app.Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("moment_id", str), vwb.m200311Y("comment_id", NullChecker.m81303a(this.f41167a) ? this.f41167a.f56008id : ""));
        i0e.m133797f(cwf0VarM133794c);
        c40.C16057b c16057b = new c40.C16057b(mo63485D());
        c16057b.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.z170
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201052a.m63572l0(view);
            }
        }).m105167T(new DialogInterface.OnDismissListener() { // from class: l.a270
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m105165R(new int[]{arrayList.indexOf(mo63485D().getString(R$string.f38973S3))}, new int[]{e1c0.f88800o}).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.b270
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f72657a.m63574n0(str, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f41178l = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: x0 */
    public Picture.ImageUri m63583x0(Picture picture) {
        return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
    }

    /* JADX INFO: renamed from: y0 */
    public final void m63584y0(String str) {
        if (FeedModule.m60221F().userId().equals(str)) {
            mo63485D().startActivity(vs0.m199797c(mo63485D(), str, "all_comment_detail_item"));
        } else {
            vs0.m199804j(mo63485D(), this.f41172f, str, "all_comment_detail_item", false);
        }
    }

    public PhotoAlbumCommentExpandDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentExpandDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
