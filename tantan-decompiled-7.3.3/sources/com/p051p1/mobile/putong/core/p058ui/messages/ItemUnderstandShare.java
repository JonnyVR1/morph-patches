package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.KnowMyselfShareMessageAdditional;
import com.p051p1.mobile.putong.core.data.KnowMyselfShareParams;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import java.util.HashMap;
import java.util.List;
import p151v.VImage;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.mjq;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemUnderstandShare extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemUnderstandShare f32374a;

    /* JADX INFO: renamed from: b */
    public VImage f32375b;

    /* JADX INFO: renamed from: c */
    public VImage f32376c;

    /* JADX INFO: renamed from: d */
    public VImage f32377d;

    /* JADX INFO: renamed from: e */
    public TextView f32378e;

    /* JADX INFO: renamed from: f */
    public TextView f32379f;

    /* JADX INFO: renamed from: g */
    public TextView f32380g;

    public ItemUnderstandShare(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private Act m49932d() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m49933f(View view) {
        return ItemMessageBase.m49494R(this).onLongClick(view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        final KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (knowMyselfShareMessageAdditional = messageAdditionalData.understandShare) == null) {
            return;
        }
        this.f32378e.setText(knowMyselfShareMessageAdditional.title);
        this.f32379f.setText(message.value);
        this.f32380g.setText(knowMyselfShareMessageAdditional.buttonText);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.kjq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127127a.m49935e(knowMyselfShareMessageAdditional, message, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ljq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f132384a.m49933f(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m49934c(View view) {
        mjq.m158596a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49935e(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, Message message, View view) {
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
        i4g0.m138521s("e_knowmyself_share_friends_im", OMSDialogPositon.p_chat_view, map);
        CoreModule.m30933P().m143412i().mo180426Y(m49932d(), Uri.parse(knowMyselfShareMessageAdditional.target));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49934c(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32379f.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32380g.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemUnderstandShare(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemUnderstandShare(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
