package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.KnowMyselfShareMessageAdditional;
import com.p046p1.mobile.putong.core.data.KnowMyselfShareParams;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import java.util.HashMap;
import java.util.List;
import p147v.VImage;
import p149l.a1c0;
import p149l.knb0;
import p149l.mhq;
import p149l.ura;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemUnderstandShare extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemUnderstandShare f31526a;

    /* JADX INFO: renamed from: b */
    public VImage f31527b;

    /* JADX INFO: renamed from: c */
    public VImage f31528c;

    /* JADX INFO: renamed from: d */
    public VImage f31529d;

    /* JADX INFO: renamed from: e */
    public TextView f31530e;

    /* JADX INFO: renamed from: f */
    public TextView f31531f;

    /* JADX INFO: renamed from: g */
    public TextView f31532g;

    public ItemUnderstandShare(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private Act m48749d() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m48750f(View view) {
        return ItemMessageBase.m48311R(this).onLongClick(view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        final KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (knowMyselfShareMessageAdditional = messageAdditionalData.understandShare) == null) {
            return;
        }
        this.f31530e.setText(knowMyselfShareMessageAdditional.title);
        this.f31531f.setText(message.value);
        this.f31532g.setText(knowMyselfShareMessageAdditional.buttonText);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.khq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123196a.m48752e(knowMyselfShareMessageAdditional, message, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.lhq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f128125a.m48750f(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m48751c(View view) {
        mhq.m154631a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48752e(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, Message message, View view) {
        if (TextUtils.isEmpty(knowMyselfShareMessageAdditional.target)) {
            return;
        }
        KnowMyselfShareParams knowMyselfShareParamsNew_ = KnowMyselfShareParams.new_();
        knowMyselfShareParamsNew_.link = knowMyselfShareMessageAdditional.target;
        String strTryParseTPID = knowMyselfShareParamsNew_.tryParseTPID();
        HashMap map = new HashMap();
        map.put("other_user_id", message.owner);
        map.put("test_id", strTryParseTPID);
        map.put("test_page", knowMyselfShareMessageAdditional.pageType);
        if (User.ID_TEAM_ACCOUNT.equals(message.owner)) {
            map.put("test_link_type", "assistant");
        }
        zvf0.m220397s("e_knowmyself_share_friends_im", OMSDialogPositon.p_chat_view, map);
        CoreModule.m29935P().m94658i().mo158334Y(m48749d(), Uri.parse(knowMyselfShareMessageAdditional.target));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48751c(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31531f.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31532g.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemUnderstandShare(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemUnderstandShare(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
