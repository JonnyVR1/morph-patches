package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VText;
import p153l.bnl0;
import p153l.i4h;
import p153l.jyb;
import p153l.k9c0;
import p153l.l51;
import p153l.o8j;
import p153l.orb0;
import p153l.psd0;
import p153l.qa00;
import p153l.sor;
import p153l.uxj0;
import p153l.w1e;
import p153l.wd70;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumFeedCommentView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f42084a;

    /* JADX INFO: renamed from: b */
    public View f42085b;

    /* JADX INFO: renamed from: c */
    public MomentMessage f42086c;

    /* JADX INFO: renamed from: d */
    public MomentItem f42087d;

    public PhotoAlbumFeedCommentView(Context context) {
        super(context);
        this.f42086c = null;
    }

    /* JADX INFO: renamed from: z */
    public static SpannableStringBuilder m64839z(String str, ArrayList<String> arrayList, ArrayList<o8j> arrayList2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i = 0; i < arrayList.size(); i++) {
            String str2 = arrayList.get(i);
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf != -1) {
                spannableStringBuilder.setSpan(arrayList2.get(i), iIndexOf, str2.length() + iIndexOf, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: j */
    public final void m64840j(View view) {
        wd70.m205847a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public Act m64841k() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m64852v(PhotoAlbumBaseFrag photoAlbumBaseFrag, String str) {
        Intent intentM66018b = MomentDetailAct.C11469a.m66017a(getContext()).m66022f(str).m66029m(this.f42087d.f42199d.f56859id).m66030n(this.f42087d.f42199d.owner).m66036t(true).m66031o(this.f42087d.f42199d.momentValue).m66018b();
        if (intentM66018b == null) {
            return;
        }
        m64841k().startActivity(intentM66018b);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m64851u(User user) {
        m64841k().startActivity(PhotoAlbumFeedAct.m65538X1(m64841k(), user.f56859id, "comment_list", -1, 2));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m64844n(uxj0 uxj0Var) {
        m64841k().progressDismiss();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m64845o(Throwable th) {
        i4h.m138538g(th);
        m64841k().progressDismiss();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64840j(this);
        this.f42084a.setMovementMethod(sor.m187274a());
        this.f42084a.setPadding(qa00.m175859d(44.0f), 0, 0, 0);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m64846p(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (i == 0) {
            l51.m152911q(this.f42086c.value);
        } else {
            m64841k().progress(R$string.f39832U2, true);
            FeedModule.f39703d.m145554L6(this.f42086c).subscribe(psd0.m173597H(new y20() { // from class: l.ud70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178509a.m64844n((uxj0) obj);
                }
            }, new y20() { // from class: l.vd70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183546a.m64845o((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m64847q(View view) {
        if (this.f42086c.isOtherUser()) {
            w1e.m204398b(m64841k(), this.f42086c.value);
        } else if (TEnum.equals(this.f42086c.status(), "failed")) {
            orb0.m168904u(m64841k(), this.f42086c);
        } else {
            ArrayList arrayListM147507f0 = jyb.m147507f0(m64841k().getString(R$string.f39893e), m64841k().getString(R$string.f39797O3));
            if (!TEnum.equals(this.f42086c.status(), "normal")) {
                arrayListM147507f0.remove(1);
            }
            m64841k().dialog().m21534e0(arrayListM147507f0).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.od70
                @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
                /* JADX INFO: renamed from: a */
                public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                    this.f146854a.m64846p(dialog, view2, i, charSequence);
                }
            }).m21567z0();
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public void m64853w(PhotoAlbumBaseFrag photoAlbumBaseFrag, MomentItem momentItem, String str) {
        this.f42087d = momentItem;
        if (NullChecker.m82486a(this.f42086c) && NullChecker.m82487b(momentItem) && this.f42086c.equals(momentItem) && TEnum.equals(this.f42086c.status(), momentItem.f42198c.status())) {
            return;
        }
        this.f42086c = momentItem.f42198c;
        this.f42084a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.nd70
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f141458a.m64847q(view);
            }
        });
        User userM145688e8 = FeedModule.f39703d.m145688e8(this.f42086c.owner);
        if (NullChecker.m82486a(userM145688e8)) {
            m64854x(photoAlbumBaseFrag, userM145688e8, this.f42086c, str);
            return;
        }
        CrashHelper.m82479c(new Exception("PhotoAlbumFeedCommendView render user = null:" + this.f42086c.owner));
    }

    /* JADX INFO: renamed from: x */
    public final void m64854x(final PhotoAlbumBaseFrag photoAlbumBaseFrag, final User user, MomentMessage momentMessage, final String str) {
        String str2 = user.name;
        String string = getResources().getString(R$string.f39869a3);
        final User userM145688e8 = !TextUtils.isEmpty(momentMessage.api_only_otherUser) ? FeedModule.f39703d.m145688e8(momentMessage.api_only_otherUser) : null;
        ArrayList arrayList = new ArrayList();
        int iColor = m64841k().color(k9c0.f124504e0);
        int iColor2 = m64841k().color(k9c0.f124500c0);
        StringBuilder sb = new StringBuilder();
        if (!this.f42086c.owner.equals(this.f42087d.f42199d.owner) || this.f42087d.f42199d.owner.equals(this.f42086c.api_only_otherUser) || !NullChecker.m82486a(userM145688e8)) {
            sb.append(str2);
            sb.append("：");
            sb.append(momentMessage.value);
            arrayList.add(new o8j(iColor, new x20() { // from class: l.sd70
                @Override // p153l.x20
                public final void call() {
                    this.f167380a.m64851u(user);
                }
            }));
            arrayList.add(new o8j(iColor2, new x20() { // from class: l.td70
                @Override // p153l.x20
                public final void call() {
                    this.f173313a.m64852v(photoAlbumBaseFrag, str);
                }
            }));
            this.f42084a.setText(m64839z(sb.toString(), jyb.m147507f0(str2, momentMessage.value), arrayList));
            return;
        }
        String str3 = userM145688e8.name;
        sb.append(str2);
        sb.append(string);
        sb.append(str3);
        sb.append("：");
        sb.append(momentMessage.value);
        arrayList.add(new o8j(iColor, new x20() { // from class: l.pd70
            @Override // p153l.x20
            public final void call() {
                this.f151720a.m64848r(user);
            }
        }));
        arrayList.add(new o8j(iColor2, null));
        arrayList.add(new o8j(iColor, new x20() { // from class: l.qd70
            @Override // p153l.x20
            public final void call() {
                this.f156663a.m64849s(userM145688e8);
            }
        }));
        arrayList.add(new o8j(iColor2, new x20() { // from class: l.rd70
            @Override // p153l.x20
            public final void call() {
                this.f162289a.m64850t(photoAlbumBaseFrag, str);
            }
        }));
        this.f42084a.setText(m64839z(sb.toString(), jyb.m147507f0(str2, string, str3, momentMessage.value), arrayList));
    }

    /* JADX INFO: renamed from: y */
    public void m64855y(boolean z) {
        if (z) {
            this.f42085b.setPadding(0, 0, 0, 0);
        }
        bnl0.m105524M(this.f42085b, z);
    }

    public PhotoAlbumFeedCommentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42086c = null;
    }

    public PhotoAlbumFeedCommentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42086c = null;
    }
}
