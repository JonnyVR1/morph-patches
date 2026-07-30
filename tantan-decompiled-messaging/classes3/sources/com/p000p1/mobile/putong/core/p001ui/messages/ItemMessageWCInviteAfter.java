package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMessageWCInviteAfter;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.j2e0;
import l.knb0;
import l.lsi0;
import l.qib0;
import l.ura;
import l.xdl0;
import l.y9q;
import l.zvf0;
import p003l.f30;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageWCInviteAfter extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemMessageWCInviteAfter f1157a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f1158b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1159c;

    /* JADX INFO: renamed from: d */
    public VText f1160d;

    /* JADX INFO: renamed from: e */
    public VText f1161e;

    /* JADX INFO: renamed from: f */
    public VText f1162f;

    /* JADX INFO: renamed from: g */
    public boolean f1163g;

    public ItemMessageWCInviteAfter(Context context) {
        super(context);
        this.f1163g = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1580a(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            lsi0.j(pictureTxtDeeplinkMsgData.failRemind);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = (PictureTxtDeeplinkMsgData) PictureTxtDeeplinkMsgData.JSON_ADAPTER.parse(message.msgData);
            if (pictureTxtDeeplinkMsgData == null) {
                return;
            }
            if (!this.f1163g) {
                this.f1163g = true;
                zvf0.x("e_chat_game_done", "p_worldcup_chat");
            }
            xdl0.E0(this.f1160d, new View.OnClickListener() { // from class: l.w9q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8519a.m1583d(pictureTxtDeeplinkMsgData, view);
                }
            });
            if (NullChecker.a(pictureTxtDeeplinkMsgData.view)) {
                CharSequence charSequence = pictureTxtDeeplinkMsgData.view.title;
                boolean zIsEmpty = TextUtils.isEmpty(charSequence);
                AppCompatTextView appCompatTextView = this.f1161e;
                if (zIsEmpty) {
                    xdl0.M(appCompatTextView, false);
                } else {
                    xdl0.M(appCompatTextView, true);
                    this.f1161e.setText(charSequence);
                }
                CharSequence charSequence2 = pictureTxtDeeplinkMsgData.view.subTitle;
                boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
                AppCompatTextView appCompatTextView2 = this.f1162f;
                if (zIsEmpty2) {
                    xdl0.M(appCompatTextView2, false);
                } else {
                    xdl0.M(appCompatTextView2, true);
                    this.f1162f.setText(charSequence2);
                }
                CharSequence charSequence3 = pictureTxtDeeplinkMsgData.view.button;
                boolean zIsEmpty3 = TextUtils.isEmpty(charSequence3);
                AppCompatTextView appCompatTextView3 = this.f1160d;
                if (zIsEmpty3) {
                    xdl0.M(appCompatTextView3, false);
                } else {
                    xdl0.M(appCompatTextView3, true);
                    this.f1160d.setText(charSequence3);
                }
                if (TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.image)) {
                    return;
                }
                qib0.G.L0(this.f1159c, pictureTxtDeeplinkMsgData.view.image);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m1582c(View view) {
        y9q.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1583d(final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, View view) {
        zvf0.r("e_chat_game_done", "p_worldcup_chat");
        j2e0.n(xdl0.E(this.f1160d), Uri.parse(pictureTxtDeeplinkMsgData.schema), new f30() { // from class: l.x9q
            @Override // p003l.f30
            public final void call(Object obj, Object obj2) {
                ItemMessageWCInviteAfter.m1580a(pictureTxtDeeplinkMsgData, (String) obj, (String) obj2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1582c(this);
        this.f1161e.setTypeface(Typeface.defaultFromStyle(1));
        if (ura.e().d().I4()) {
            this.f1161e.setTextColor(getResources().getColor(a1c0.g));
            this.f1162f.setTextColor(getResources().getColor(a1c0.i));
            this.f1160d.setBackgroundResource(c3c0.t);
        }
    }

    public ItemMessageWCInviteAfter(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1163g = false;
    }

    public ItemMessageWCInviteAfter(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1163g = false;
    }
}
