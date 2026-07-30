package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.ChristmasMatchMsgData;
import com.p046p1.mobile.putong.core.data.ChristmasMatchMsgDataHighlightText;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemChristmasMatch;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p149l.e30;
import p149l.qib0;
import p149l.vwb;
import p149l.x4q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemChristmasMatch extends VFrame implements x4q {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30885a;

    /* JADX INFO: renamed from: b */
    public VText f30886b;

    /* JADX INFO: renamed from: c */
    public Message f30887c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemChristmasMatch$a */
    public static class C8486a {
        /* JADX INFO: renamed from: b */
        public static void m48097b(ItemChristmasMatch itemChristmasMatch, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            itemChristmasMatch.f30885a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            itemChristmasMatch.f30886b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public ItemChristmasMatch(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m48091p(int i, SpannableStringBuilder spannableStringBuilder, ChristmasMatchMsgDataHighlightText christmasMatchMsgDataHighlightText) {
        int i2 = christmasMatchMsgDataHighlightText.index;
        if (i2 < 0 || i2 >= i || i2 + christmasMatchMsgDataHighlightText.length > i) {
            return;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-98787);
        int i3 = christmasMatchMsgDataHighlightText.index;
        spannableStringBuilder.setSpan(foregroundColorSpan, i3, christmasMatchMsgDataHighlightText.length + i3, 33);
    }

    /* JADX INFO: renamed from: A */
    public void m48094A(Message message) {
        this.f30887c = message;
        try {
            ChristmasMatchMsgData christmasMatchMsgData = ChristmasMatchMsgData.JSON_ADAPTER.parse(message.msgData);
            if (NullChecker.m81303a(christmasMatchMsgData)) {
                if (vwb.m200296J(christmasMatchMsgData.media) || TextUtils.isEmpty(christmasMatchMsgData.media.get(0).url)) {
                    qib0.f154691G.m184725o(this.f30885a);
                } else {
                    qib0.f154691G.m102337O0(this.f30885a, christmasMatchMsgData.media.get(0).cover().url, true, false, null, null);
                }
                final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(christmasMatchMsgData.text.value);
                final int length = TextUtils.isEmpty(christmasMatchMsgData.text.value) ? 0 : christmasMatchMsgData.text.value.length();
                vwb.m200354z(christmasMatchMsgData.text.highlight, new e30() { // from class: l.d2q
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ItemChristmasMatch.m48091p(length, spannableStringBuilder, (ChristmasMatchMsgDataHighlightText) obj);
                    }
                });
                this.f30886b.setText(spannableStringBuilder);
            }
        } catch (IOException unused) {
        }
    }

    @Override // p149l.x4q
    public Message message() {
        return this.f30887c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48095v(this);
    }

    /* JADX INFO: renamed from: v */
    public final void m48095v(View view) {
        C8486a.m48097b(this, view);
    }

    public ItemChristmasMatch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ItemChristmasMatch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
