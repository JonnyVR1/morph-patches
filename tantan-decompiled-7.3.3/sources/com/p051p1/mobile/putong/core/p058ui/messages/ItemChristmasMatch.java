package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.ChristmasMatchMsgData;
import com.p051p1.mobile.putong.core.data.ChristmasMatchMsgDataHighlightText;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemChristmasMatch;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p153l.jyb;
import p153l.uqb0;
import p153l.x6q;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChristmasMatch extends VFrame implements x6q {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31733a;

    /* JADX INFO: renamed from: b */
    public VText f31734b;

    /* JADX INFO: renamed from: c */
    public Message f31735c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChristmasMatch$a */
    public static class C8649a {
        /* JADX INFO: renamed from: b */
        public static void m49280b(ItemChristmasMatch itemChristmasMatch, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            itemChristmasMatch.f31733a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            itemChristmasMatch.f31734b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public ItemChristmasMatch(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m49274p(int i, SpannableStringBuilder spannableStringBuilder, ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText) {
        int i2 = christmasMatchMsgDataHighlightText.index;
        if (i2 < 0 || i2 >= i || i2 + christmasMatchMsgDataHighlightText.length > i) {
            return;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-98787);
        int i3 = christmasMatchMsgDataHighlightText.index;
        spannableStringBuilder.setSpan(foregroundColorSpan, i3, christmasMatchMsgDataHighlightText.length + i3, 33);
    }

    /* JADX INFO: renamed from: A */
    public void m49277A(Message message) {
        this.f31735c = message;
        try {
            ChristmasMatchMsgData christmasMatchMsgData = ChristmasMatchMsgData.JSON_ADAPTER.parse(message.msgData);
            if (NullChecker.m82486a(christmasMatchMsgData)) {
                if (jyb.m147479J(christmasMatchMsgData.media) || TextUtils.isEmpty(christmasMatchMsgData.media.get(0).url)) {
                    uqb0.f180374G.m98798o(this.f31733a);
                } else {
                    uqb0.f180374G.m127121O0(this.f31733a, christmasMatchMsgData.media.get(0).cover().url, true, false, null, null);
                }
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(christmasMatchMsgData.text.value);
                final int length = TextUtils.isEmpty(christmasMatchMsgData.text.value) ? 0 : christmasMatchMsgData.text.value.length();
                jyb.m147537z(christmasMatchMsgData.text.highlight, new y20() { // from class: l.d4q
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ItemChristmasMatch.m49274p(length, spannableStringBuilder, (ChristmasMatchMsgDataHighlightText) obj);
                    }
                });
                this.f31734b.setText(spannableStringBuilder);
            }
        } catch (IOException unused) {
        }
    }

    @Override // p153l.x6q
    public Message message() {
        return this.f31735c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49278v(this);
    }

    /* JADX INFO: renamed from: v */
    public final void m49278v(View view) {
        C8649a.m49280b(this, view);
    }

    public ItemChristmasMatch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemChristmasMatch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
