package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVoiceTopicChatInputBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p147v.VText;
import p149l.cxq;
import p149l.e30;
import p149l.k25;
import p149l.lsi0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/LiveVoiceTopicInputView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVoiceTopicChatInputBindings;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/e30;", "", BLiveVoiceSingTogehterState.confirm, "", Constants.INAPP_DATA_TAG, "(Ll/e30;)V", "e", "()V", "c", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class LiveVoiceTopicInputView extends LiveVoiceTopicChatInputBindings {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.topic.LiveVoiceTopicInputView$a */
    @Metadata(m87231d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/topic/LiveVoiceTopicInputView$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12975a implements TextWatcher {
        public C12975a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            String strM144261b = k25.m144261b(s.toString());
            strM144261b.getClass();
            boolean z = strM144261b.length() > 0;
            LiveVoiceTopicInputView.this.f48388c.setSelected(z);
            LiveVoiceTopicInputView.this.f48388c.setEnabled(z);
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
    public static Unit m77347b(LiveVoiceTopicInputView liveVoiceTopicInputView, e30 e30Var, View view) {
        view.getClass();
        Editable text = liveVoiceTopicInputView.f48387b.getText();
        text.getClass();
        if (StringsKt.m93438e0(text)) {
            lsi0.m151595y("还未输入标签");
            return Unit.INSTANCE;
        }
        e30Var.call(C15386d.m93479F(liveVoiceTopicInputView.f48387b.getText().toString(), SignParameters.NEW_LINE, "", false, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m77348c() {
        this.f48387b.clearFocus();
    }

    /* JADX INFO: renamed from: d */
    public final void m77349d(@NotNull final e30<String> confirm) {
        confirm.getClass();
        this.f48387b.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        VText vText = this.f48388c;
        vText.getClass();
        cxq.m109105c(vText, new Function1() { // from class: l.dbv
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiveVoiceTopicInputView.m77347b(this.f85340a, confirm, (View) obj);
            }
        });
        this.f48387b.addTextChangedListener(new C12975a());
    }

    /* JADX INFO: renamed from: e */
    public final void m77350e() {
        this.f48387b.requestFocus();
    }
}
