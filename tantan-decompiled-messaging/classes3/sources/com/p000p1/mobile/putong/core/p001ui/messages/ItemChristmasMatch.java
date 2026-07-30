package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemChristmasMatch;
import com.p1.mobile.putong.core.data.ChristmasMatchMsgData;
import com.p1.mobile.putong.core.data.ChristmasMatchMsgDataHighlightText;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import l.nvc0;
import l.qib0;
import l.vwb;
import l.ym2;
import p003l.e30;
import p003l.x4q;
import p028v.VDraweeView;
import p028v.VFrame;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemChristmasMatch extends VFrame implements x4q {

    /* JADX INFO: renamed from: a */
    public VDraweeView f776a;

    /* JADX INFO: renamed from: b */
    public VText f777b;

    /* JADX INFO: renamed from: c */
    public Message f778c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChristmasMatch$a */
    public static class C0069a {
        /* JADX INFO: renamed from: b */
        public static void m1177b(ItemChristmasMatch itemChristmasMatch, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            itemChristmasMatch.f776a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            itemChristmasMatch.f777b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public ItemChristmasMatch(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m1171p(int i, SpannableStringBuilder spannableStringBuilder, ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText) {
        int i2 = christmasMatchMsgDataHighlightText.index;
        if (i2 < 0 || i2 >= i || i2 + christmasMatchMsgDataHighlightText.length > i) {
            return;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-98787);
        int i3 = christmasMatchMsgDataHighlightText.index;
        spannableStringBuilder.setSpan(foregroundColorSpan, i3, christmasMatchMsgDataHighlightText.length + i3, 33);
    }

    /* JADX INFO: renamed from: A */
    public void m1174A(Message message) {
        this.f778c = message;
        try {
            ChristmasMatchMsgData christmasMatchMsgData = (ChristmasMatchMsgData) ChristmasMatchMsgData.JSON_ADAPTER.parse(message.msgData);
            if (NullChecker.a(christmasMatchMsgData)) {
                if (vwb.J(christmasMatchMsgData.media) || TextUtils.isEmpty(((Media) christmasMatchMsgData.media.get(0)).url)) {
                    qib0.G.o(this.f776a);
                } else {
                    qib0.G.O0(this.f776a, ((Media) ((Media) christmasMatchMsgData.media.get(0)).cover()).url, true, false, (nvc0) null, (ym2) null);
                }
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(christmasMatchMsgData.text.value);
                final int length = TextUtils.isEmpty(christmasMatchMsgData.text.value) ? 0 : christmasMatchMsgData.text.value.length();
                vwb.z(christmasMatchMsgData.text.highlight, new e30() { // from class: l.d2q
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        ItemChristmasMatch.m1171p(length, spannableStringBuilder, (ChristmasMatchMsgDataHighlightText) obj);
                    }
                });
                this.f777b.setText(spannableStringBuilder);
            }
        } catch (IOException unused) {
        }
    }

    @Override // p003l.x4q
    public Message message() {
        return this.f778c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1175v(this);
    }

    /* JADX INFO: renamed from: v */
    public final void m1175v(View view) {
        C0069a.m1177b(this, view);
    }

    public ItemChristmasMatch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemChristmasMatch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
