package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVoiceTopicChatInputBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.czq;
import p153l.j35;
import p153l.o1j0;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/LiveVoiceTopicInputView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceTopicChatInputBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/y20;", "", BLiveVoiceSingTogehterState.confirm, "", Constants.INAPP_DATA_TAG, "(Ll/y20;)V", "e", "()V", "c", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LiveVoiceTopicInputView extends LiveVoiceTopicChatInputBindings {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView$a */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/LiveVoiceTopicInputView$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13138a implements TextWatcher {
        public C13138a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            String strM143317b = j35.m143317b(s.toString());
            strM143317b.getClass();
            boolean z = strM143317b.length() > 0;
            LiveVoiceTopicInputView.this.f49236c.setSelected(z);
            LiveVoiceTopicInputView.this.f49236c.setEnabled(z);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            s.getClass();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            s.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVoiceTopicInputView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    /* JADX INFO: renamed from: b */
    public static Unit m78530b(LiveVoiceTopicInputView liveVoiceTopicInputView, y20 y20Var, View view) {
        view.getClass();
        Editable text = liveVoiceTopicInputView.f49235b.getText();
        text.getClass();
        if (StringsKt.m94329e0(text)) {
            o1j0.m165651y("还未输入标签");
            return Unit.INSTANCE;
        }
        y20Var.call(C15493d.m94370F(liveVoiceTopicInputView.f49235b.getText().toString(), SignParameters.NEW_LINE, "", false, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m78531c() {
        this.f49235b.clearFocus();
    }

    /* JADX INFO: renamed from: d */
    public final void m78532d(@NotNull final y20<String> confirm) {
        confirm.getClass();
        this.f49235b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        VText vText = this.f49236c;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.edv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceTopicInputView.m78530b(this.f93581a, confirm, (View) obj);
            }
        });
        this.f49235b.addTextChangedListener(new C13138a());
    }

    /* JADX INFO: renamed from: e */
    public final void m78533e() {
        this.f49235b.requestFocus();
    }
}
