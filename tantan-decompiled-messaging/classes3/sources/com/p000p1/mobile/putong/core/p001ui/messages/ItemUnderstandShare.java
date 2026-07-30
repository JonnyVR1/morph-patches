package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.KnowMyselfShareMessageAdditional;
import com.p1.mobile.putong.core.data.KnowMyselfShareParams;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import java.util.HashMap;
import java.util.List;
import l.a1c0;
import l.knb0;
import l.mhq;
import l.ura;
import l.xdl0;
import l.zvf0;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemUnderstandShare extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemUnderstandShare f1417a;

    /* JADX INFO: renamed from: b */
    public VImage f1418b;

    /* JADX INFO: renamed from: c */
    public VImage f1419c;

    /* JADX INFO: renamed from: d */
    public VImage f1420d;

    /* JADX INFO: renamed from: e */
    public TextView f1421e;

    /* JADX INFO: renamed from: f */
    public TextView f1422f;

    /* JADX INFO: renamed from: g */
    public TextView f1423g;

    public ItemUnderstandShare(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private Act m1833d() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean m1834f(View view) {
        return ItemMessageBase.m1395R(this).onLongClick(view);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        final KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional;
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || (knowMyselfShareMessageAdditional = messageAdditionalData.understandShare) == null) {
            return;
        }
        this.f1421e.setText(knowMyselfShareMessageAdditional.title);
        this.f1422f.setText(message.value);
        this.f1423g.setText(knowMyselfShareMessageAdditional.buttonText);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.khq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4930a.m1836e(knowMyselfShareMessageAdditional, message, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.lhq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f5306a.m1834f(view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m1835c(View view) {
        mhq.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1836e(KnowMyselfShareMessageAdditional knowMyselfShareMessageAdditional, Message message, View view) {
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
        if ("-1".equals(message.owner)) {
            map.put("test_link_type", "assistant");
        }
        zvf0.s("e_knowmyself_share_friends_im", "p_chat_view", map);
        CoreModule.P().i().Y(m1833d(), Uri.parse(knowMyselfShareMessageAdditional.target));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1835c(this);
        if (ura.e().d().I4()) {
            this.f1422f.setTextColor(getResources().getColor(a1c0.g));
            this.f1423g.setTextColor(getResources().getColor(a1c0.j));
        }
    }

    public ItemUnderstandShare(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemUnderstandShare(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
