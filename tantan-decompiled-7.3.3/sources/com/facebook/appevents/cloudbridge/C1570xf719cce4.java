package com.facebook.appevents.cloudbridge;

import com.facebook.internal.C1680e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m88121d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "responseCode", "", "invoke", "(Ljava/lang/String;Ljava/lang/Integer;)V"}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class C1570xf719cce4 extends Lambda implements Function2<String, Integer, Unit> {
    final /* synthetic */ List<Map<String, Object>> $processedEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1570xf719cce4(List<? extends Map<String, ? extends Object>> list) {
        super(2);
        this.$processedEvents = list;
    }

    /* JADX INFO: renamed from: a */
    public static void m7755a(Integer num, List list) {
        list.getClass();
        if (CollectionsKt.contains(AppEventsConversionsAPITransformerWebRequests.ACCEPTABLE_HTTP_RESPONSE, num)) {
            return;
        }
        AppEventsConversionsAPITransformerWebRequests.INSTANCE.m7747g(num, list, 5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable String str, @Nullable final Integer num) {
        final List<Map<String, Object>> list = this.$processedEvents;
        C1680e.m8860A0(new Runnable() { // from class: com.facebook.appevents.cloudbridge.a
            @Override // java.lang.Runnable
            public final void run() {
                C1570xf719cce4.m7755a(num, list);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num) {
        invoke2(str, num);
        return Unit.INSTANCE;
    }
}
