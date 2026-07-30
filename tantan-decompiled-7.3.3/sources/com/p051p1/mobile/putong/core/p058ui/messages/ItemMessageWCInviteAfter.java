package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.PictureTxtDeeplinkMsgData;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageWCInviteAfter;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.nae0;
import p153l.o1j0;
import p153l.ovb0;
import p153l.uqb0;
import p153l.ybq;
import p153l.z20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageWCInviteAfter extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemMessageWCInviteAfter f32114a;

    /* JADX INFO: renamed from: b */
    public RelativeLayout f32115b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32116c;

    /* JADX INFO: renamed from: d */
    public VText f32117d;

    /* JADX INFO: renamed from: e */
    public VText f32118e;

    /* JADX INFO: renamed from: f */
    public VText f32119f;

    /* JADX INFO: renamed from: g */
    public boolean f32120g;

    public ItemMessageWCInviteAfter(Context context) {
        super(context);
        this.f32120g = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49679a(PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, String str, String str2) {
        if ("scheme_message_no_handler_found".equals(str2)) {
            o1j0.m165636j(pictureTxtDeeplinkMsgData.failRemind);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData = PictureTxtDeeplinkMsgData.JSON_ADAPTER.parse(message.msgData);
            if (pictureTxtDeeplinkMsgData == null) {
                return;
            }
            if (!this.f32120g) {
                this.f32120g = true;
                i4g0.m138526x("e_chat_game_done", "p_worldcup_chat");
            }
            bnl0.m105509E0(this.f32117d, new View.OnClickListener() { // from class: l.wbq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f188264a.m49682d(pictureTxtDeeplinkMsgData, view);
                }
            });
            if (NullChecker.m82486a(pictureTxtDeeplinkMsgData.view)) {
                String str = pictureTxtDeeplinkMsgData.view.title;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                VText vText = this.f32118e;
                if (zIsEmpty) {
                    bnl0.m105524M(vText, false);
                } else {
                    bnl0.m105524M(vText, true);
                    this.f32118e.setText(str);
                }
                String str2 = pictureTxtDeeplinkMsgData.view.subTitle;
                boolean zIsEmpty2 = TextUtils.isEmpty(str2);
                VText vText2 = this.f32119f;
                if (zIsEmpty2) {
                    bnl0.m105524M(vText2, false);
                } else {
                    bnl0.m105524M(vText2, true);
                    this.f32119f.setText(str2);
                }
                String str3 = pictureTxtDeeplinkMsgData.view.button;
                boolean zIsEmpty3 = TextUtils.isEmpty(str3);
                VText vText3 = this.f32117d;
                if (zIsEmpty3) {
                    bnl0.m105524M(vText3, false);
                } else {
                    bnl0.m105524M(vText3, true);
                    this.f32117d.setText(str3);
                }
                if (TextUtils.isEmpty(pictureTxtDeeplinkMsgData.view.image)) {
                    return;
                }
                uqb0.f180374G.m127115L0(this.f32116c, pictureTxtDeeplinkMsgData.view.image);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m49681c(View view) {
        ybq.m215108a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49682d(final PictureTxtDeeplinkMsgData pictureTxtDeeplinkMsgData, View view) {
        i4g0.m138520r("e_chat_game_done", "p_worldcup_chat");
        nae0.m162084n(bnl0.m105508E(this.f32117d), Uri.parse(pictureTxtDeeplinkMsgData.schema), new z20() { // from class: l.xbq
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                ItemMessageWCInviteAfter.m49679a(pictureTxtDeeplinkMsgData, (String) obj, (String) obj2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49681c(this);
        this.f32118e.setTypeface(Typeface.defaultFromStyle(1));
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32118e.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32119f.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32117d.setBackgroundResource(ibc0.f114138t);
        }
    }

    public ItemMessageWCInviteAfter(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32120g = false;
    }

    public ItemMessageWCInviteAfter(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32120g = false;
    }
}
