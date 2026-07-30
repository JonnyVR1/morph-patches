package com.p000p1.mobile.putong.core.p001ui.purchase;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.LeftSwipeLimitConfig;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.mediator.d;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.a;
import l.d30;
import l.e30;
import l.fy80;
import l.g30;
import l.jo0;
import l.kdp;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.qqi0;
import l.r5b0;
import l.sab0;
import l.swh0;
import l.ura;
import l.v9j;
import l.vwb;
import l.wek0;
import l.wx80;
import l.xma;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.c9p;
import p002l.kwo;
import p002l.n3b0;
import p002l.o6n;
import p002l.p2b0;
import p002l.w6p;
import p002l.x2b0;
import p002l.y2n;
import rx.c;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0012\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J{\u0010\u001a\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ{\u0010\u001c\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u009d\u0001\u0010&\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010'J\u0089\u0001\u0010.\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\b0*j\b\u0012\u0004\u0012\u00020\b`+2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u009d\u0001\u00102\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\b0*j\b\u0012\u0004\u0012\u00020\b`+2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010-\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b2\u00103J)\u00105\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u0018042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b5\u00106J)\u00107\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u0018042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b7\u00106J\u0019\u00108\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b8\u00109JY\u0010:\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b:\u0010;Jc\u0010<\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b<\u0010=J5\u0010@\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020!2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0010H\u0002¢\u0006\u0004\bB\u0010CJ7\u0010E\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bE\u0010FJ7\u0010G\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bG\u0010FJM\u0010K\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010H\u001a\u00020!2\u001c\b\u0002\u0010J\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010IH\u0007¢\u0006\u0004\bK\u0010LJO\u0010O\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bO\u0010PJO\u0010Q\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bQ\u0010PJO\u0010R\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bR\u0010SJ+\u0010T\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bT\u0010UJ5\u0010V\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bV\u0010FJg\u0010X\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bX\u0010YJK\u0010Z\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bZ\u0010[Jg\u0010\\\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\\\u0010YJg\u0010]\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b]\u0010YJg\u0010^\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b^\u0010YJg\u0010_\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b_\u0010YJ[\u0010`\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b`\u0010aJ5\u0010b\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bb\u0010F¨\u0006c"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/c;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "from", "Lcom/p1/mobile/putong/core/data/Privilege;", "first", "Ll/d30;", "onDismiss", "tag", "", "D1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Ll/d30;Ljava/lang/Object;)V", "", "renew", "E0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/d30;Lcom/p1/mobile/putong/core/data/Privilege;ZLjava/lang/Object;)V", "onCancel", "Lcom/p1/mobile/putong/data/User;", "user", "Ll/e30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onSuccess", "N1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Ll/d30;Ll/d30;ZLcom/p1/mobile/putong/data/User;Ljava/lang/Object;Ll/e30;)V", "O0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/d30;Ll/d30;Lcom/p1/mobile/putong/core/data/Privilege;ZLcom/p1/mobile/putong/data/User;Ljava/lang/Object;Ll/e30;)V", "firstPrivilege", "firstPurchaseType", "afterPaySuccess", "", "selectedIdxP", "pushUser", "showPurchasePage", "forcePromoFullscreen", "C0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ll/e30;ILl/d30;Ll/d30;Ljava/lang/String;Ljava/lang/Object;ZZ)V", "", "purchaseTypeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "primaryPrivileges", "selectedIdx", "y1", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Ljava/lang/String;I)V", "forceStandardPage", "defaultSkuDuration", "k1", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;IZZLjava/lang/String;)V", "", "a1", "(Ljava/util/List;Ljava/lang/String;)Z", "Z0", "W0", "(Ljava/lang/String;)Z", "a0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Lcom/p1/mobile/putong/core/data/Privilege;)V", "M0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;)V", "membershipType", "contractIntervalDays", "X0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;ILjava/lang/String;)V", "V0", "()Z", "picksMembershipPaySuccess", "s1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;)V", "u1", "sendNum", "Ll/g30;", "onPaymentSuccess", "G1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;ILl/g30;)V", "purchaseType", LiveMessage.LiveMessageType.OTHER, "p1", "(Lcom/p1/mobile/android/app/Act;Ll/e30;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ljava/lang/String;)V", "g0", "w1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;)V", "n1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;)V", "d1", "onClose", "o0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Ll/e30;Ll/d30;Ll/d30;Ll/d30;)V", "b1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/d30;Ll/d30;Ll/e30;)V", "W", "R0", "s0", "d0", "H0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Ll/d30;)V", "h1", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class C0189c {

    @NotNull
    public static final C0189c INSTANCE = new C0189c();

    /* JADX INFO: renamed from: A */
    public static void m3940A(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: A0 */
    public static final void m3941A0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable e30<PurchaseType> e30Var, int i, @Nullable d30 d30Var, @Nullable d30 d30Var2) {
        m3950D0(act, str, privilege, purchaseType, e30Var, i, d30Var, d30Var2, null, null, false, false, 3840, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: A1 */
    public static final void m3942A1(@Nullable Act act, @NotNull String str) {
        str.getClass();
        m3954E1(act, str, null, null, null, 28, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: B0 */
    public static final void m3944B0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable e30<PurchaseType> e30Var, int i, @Nullable d30 d30Var, @Nullable d30 d30Var2, @Nullable String str2, @Nullable Object obj, boolean z) {
        m3950D0(act, str, privilege, purchaseType, e30Var, i, d30Var, d30Var2, str2, obj, z, false, 2048, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: B1 */
    public static final void m3945B1(@Nullable Act act, @NotNull String str, @NotNull Privilege privilege) {
        str.getClass();
        privilege.getClass();
        m3954E1(act, str, privilege, null, null, 24, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: C0 */
    public static final void m3947C0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable PurchaseType firstPurchaseType, @Nullable final e30<PurchaseType> afterPaySuccess, int selectedIdxP, @Nullable d30 onDismiss, @Nullable final d30 onCancel, @Nullable String pushUser, @Nullable Object tag, boolean showPurchasePage, boolean forcePromoFullscreen) {
        Privilege privilege = firstPrivilege;
        int iM18497h = selectedIdxP == -1 ? n3b0.INSTANCE.m18497h(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) : selectedIdxP;
        if (firstPurchaseType == null) {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            ArrayList privilegeDataForGP = purchaseType.getPrivilegeDataForGP((Gender) null);
            privilegeDataForGP.getClass();
            List<wx80> listQ = fy80.q(privilegeDataForGP, privilege, purchaseType);
            if (x2b0.m25671a(act, from, privilege, firstPurchaseType, afterPaySuccess, selectedIdxP, onDismiss, onCancel, tag)) {
                return;
            }
            if (act == null) {
                new C0186b.d(act).m3897m(purchaseType, privilege).m3895k(listQ).m3892h(new g30() { // from class: l.c5b0
                    /* JADX INFO: renamed from: a */
                    public final void m10745a(Object obj, Object obj2, Object obj3) {
                        C0189c.m4069x(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m3894j(pushUser).m3888d(from).m3899o(tag).m3890f(onDismiss).m3891g(onCancel).m3889e(onCancel).m3893i(onCancel).m3900p();
                return;
            }
            C0189c c0189c = INSTANCE;
            ArrayList arrayListF0 = vwb.f0(new PurchaseType[]{purchaseType});
            arrayListF0.getClass();
            if (privilege == null) {
                privilege = Privilege.svip_badge;
            }
            m4036l1(c0189c, act, arrayListF0, CollectionsKt.arrayListOf(new Privilege[]{privilege}), from, afterPaySuccess, onDismiss, onCancel, 0, showPurchasePage, forcePromoFullscreen, null, 1152, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(firstPurchaseType);
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(privilege);
        arrayList2.add(privilege);
        int iB = a.b(iM18497h, 0);
        if (iB <= 0 || !x2b0.m25671a(act, from, privilege, firstPurchaseType, afterPaySuccess, selectedIdxP, onDismiss, onCancel, tag)) {
            if (iB == 0 && x2b0.m25672b(act, from, firstPrivilege, firstPurchaseType, afterPaySuccess, selectedIdxP, onDismiss, onCancel, tag)) {
                return;
            }
            if (act == null) {
                new C0192f.d(act).m4274h(arrayList).m4267a(arrayList2).m4275i(iB).m4270d(onDismiss).m4271e(new e30() { // from class: l.e5b0
                    public final void call(Object obj) {
                        C0189c.m4072y(onCancel, (PurchaseType) obj);
                    }
                }).m4273g(new e30() { // from class: l.f5b0
                    public final void call(Object obj) {
                        C0189c.m3958G(onCancel, (PurchaseType) obj);
                    }
                }).m4269c(new e30() { // from class: l.g5b0
                    public final void call(Object obj) {
                        C0189c.m4034l(onCancel, (PurchaseType) obj);
                    }
                }).m4272f(new g30() { // from class: l.p3b0
                    /* JADX INFO: renamed from: a */
                    public final void m20018a(Object obj, Object obj2, Object obj3) {
                        C0189c.m4074z(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m4268b(from).m4276j();
                return;
            }
            final ArrayList arrayList3 = new ArrayList();
            vwb.z(arrayList2, new e30() { // from class: l.d5b0
                public final void call(Object obj) {
                    C0189c.m4004a(arrayList3, (Privilege) obj);
                }
            });
            m4036l1(INSTANCE, act, arrayList, arrayList3, from, afterPaySuccess, onDismiss, onCancel, iB, false, false, null, 1792, null);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: C1 */
    public static final void m3948C1(@Nullable Act act, @NotNull String str, @NotNull Privilege privilege, @Nullable d30 d30Var) {
        str.getClass();
        privilege.getClass();
        m3954E1(act, str, privilege, d30Var, null, 16, null);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m3950D0(Act act, String str, Privilege privilege, PurchaseType purchaseType, e30 e30Var, int i, d30 d30Var, d30 d30Var2, String str2, Object obj, boolean z, boolean z2, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            privilege = null;
        }
        if ((i2 & 8) != 0) {
            purchaseType = null;
        }
        if ((i2 & 16) != 0) {
            e30Var = null;
        }
        if ((i2 & 32) != 0) {
            i = -1;
        }
        if ((i2 & 64) != 0) {
            d30Var = null;
        }
        if ((i2 & 128) != 0) {
            d30Var2 = null;
        }
        if ((i2 & 256) != 0) {
            str2 = null;
        }
        if ((i2 & 512) != 0) {
            obj = null;
        }
        if ((i2 & 1024) != 0) {
            z = false;
        }
        m3947C0(act, str, privilege, purchaseType, e30Var, i, d30Var, d30Var2, str2, obj, z, (i2 & 2048) != 0 ? false : z2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: D1 */
    public static final void m3951D1(@Nullable Act act, @NotNull String from, @NotNull Privilege first, @Nullable final d30 onDismiss, @Nullable Object tag) {
        from.getClass();
        first.getClass();
        if (CoreModule.P().a().h5()) {
            m3950D0(act, from, first, null, null, 0, new d30() { // from class: l.q3b0
                public final void call() {
                    C0189c.m4032k(onDismiss);
                }
            }, null, null, null, false, false, 4024, null);
        } else {
            m3953E0(act, from, onDismiss, first, false, tag);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m3952E(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: E0 */
    public static final void m3953E0(Act act, String from, d30 onDismiss, Privilege first, boolean renew, Object tag) {
        new C0186b.d(act).m3898n(PurchaseType.TYPE_GET_LIKERS, first, renew).m3888d(from).m3890f(onDismiss).m3899o(tag).m3900p();
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m3954E1(Act act, String str, Privilege privilege, d30 d30Var, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = Privilege.see_who_likes_me;
        }
        if ((i & 8) != 0) {
            d30Var = null;
        }
        if ((i & 16) != 0) {
            obj = null;
        }
        m3951D1(act, str, privilege, d30Var, obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m3955F(Throwable th) {
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: F0 */
    public static final void m3956F0(@Nullable Act act, @Nullable String str) {
        m3965I0(act, str, null, null, null, null, 60, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: F1 */
    public static final void m3957F1(@Nullable Act act, @Nullable String str) {
        m3963H1(act, str, 0, null, 12, null);
    }

    /* JADX INFO: renamed from: G */
    public static void m3958G(d30 d30Var, PurchaseType purchaseType) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: G0 */
    public static final void m3959G0(@Nullable Act act, @Nullable String str, @Nullable e30<PurchaseType> e30Var, @Nullable d30 d30Var) {
        m3965I0(act, str, e30Var, d30Var, null, null, 48, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: G1 */
    public static final void m3960G1(@Nullable final Act act, @Nullable final String from, int sendNum, @Nullable final g30<PurchaseType, Act, String> onPaymentSuccess) {
        c cVarDuringCreated;
        if (sendNum > 1) {
            CoreModule.P().a().pg(act, onPaymentSuccess, sendNum, from);
            return;
        }
        if (!ura.e().d().Qi()) {
            swh0.x1(act, from, onPaymentSuccess);
            return;
        }
        ProductCategory productCategory = ProductCategory.get("tttSuperLike");
        if (act == null || (cVarDuringCreated = act.duringCreated(CoreModule.c.j0.z5(productCategory, false).take(1).observeOn(jo0.a()))) == null) {
            return;
        }
        cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.r3b0
            public final void call(Object obj) {
                C0189c.m4026i(act, from, onPaymentSuccess, (List) obj);
            }
        }, new e30() { // from class: l.s3b0
            public final void call(Object obj) {
                C0189c.m3979N(act, from, onPaymentSuccess, (Throwable) obj);
            }
        }));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: H0 */
    public static final void m3962H0(@Nullable Act act, @Nullable String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        if (act != null) {
            new d.a(act, from).d(new g30() { // from class: l.n4b0
                /* JADX INFO: renamed from: a */
                public final void m18507a(Object obj, Object obj2, Object obj3) {
                    C0189c.m3968J0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).b(onDismiss).c(onCancel).a(onClose).e();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m3963H1(Act act, String str, int i, g30 g30Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            g30Var = null;
        }
        m3960G1(act, str, i, g30Var);
    }

    /* JADX INFO: renamed from: I */
    public static Unit m3964I(Act act, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, String str2) {
        kwo.m16857u(act, arrayList, str, e30Var, d30Var, d30Var2, str2, false, 128, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m3965I0(Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            e30Var = null;
        }
        if ((i & 8) != 0) {
            d30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var2 = null;
        }
        m3962H0(act, str, e30Var, d30Var, d30Var2, (i & 32) != 0 ? null : d30Var3);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: I1 */
    public static final void m3966I1(@Nullable Act act, @NotNull String str) {
        str.getClass();
        m3984O1(act, str, null, null, null, false, null, null, null, 508, null);
    }

    /* JADX INFO: renamed from: J */
    public static Unit m3967J(Act act, List list, ArrayList arrayList, String str, int i, d30 d30Var, d30 d30Var2, String str2, final e30 e30Var) {
        w6p.C0875a c0875aM24418e = new w6p.C0875a(act).m24422i(list, arrayList).m24417d(str).m24421h(new g30() { // from class: l.u3b0
            /* JADX INFO: renamed from: a */
            public final void m23275a(Object obj, Object obj2, Object obj3) {
                C0189c.m4039m1(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m24423j(i).m24419f(d30Var).m24420g(d30Var2).m24418e(d30Var2);
        if (str2 != null && str2.length() != 0) {
            c0875aM24418e.m24416c(str2);
        }
        c0875aM24418e.m24424k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m3968J0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: J1 */
    public static final void m3969J1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege) {
        str.getClass();
        m3984O1(act, str, privilege, null, null, false, null, null, null, 504, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: K0 */
    public static final void m3971K0(@NotNull Act act, @Nullable String str, @Nullable e30<PurchaseType> e30Var, @Nullable d30 d30Var, @Nullable d30 d30Var2) {
        act.getClass();
        m3980N0(act, str, e30Var, d30Var, d30Var2, null, null, 96, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: K1 */
    public static final void m3972K1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege, @Nullable d30 d30Var, @Nullable d30 d30Var2) {
        str.getClass();
        m3984O1(act, str, privilege, d30Var, d30Var2, false, null, null, null, 480, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: L0 */
    public static final void m3974L0(@NotNull Act act, @Nullable String str, @Nullable e30<PurchaseType> e30Var, @Nullable d30 d30Var, @Nullable d30 d30Var2, @Nullable Privilege privilege) {
        act.getClass();
        m3980N0(act, str, e30Var, d30Var, d30Var2, privilege, null, 64, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: L1 */
    public static final void m3975L1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege, @Nullable d30 d30Var, @Nullable d30 d30Var2, boolean z) {
        str.getClass();
        m3984O1(act, str, privilege, d30Var, d30Var2, z, null, null, null, 448, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: M0 */
    public static final void m3977M0(@NotNull Act act, @Nullable String from, @Nullable e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable Privilege firstPrivilege, @Nullable String defaultSkuDuration) {
        act.getClass();
        C0189c c0189c = INSTANCE;
        ArrayList arrayListF0 = vwb.f0(new PurchaseType[]{PurchaseType.TYPE_ULTRA_PREMIUM});
        arrayListF0.getClass();
        m4036l1(c0189c, act, arrayListF0, CollectionsKt.arrayListOf(new Privilege[]{firstPrivilege == null ? Privilege.ultra_premium_badge : firstPrivilege}), from, afterPaySuccess, onDismiss, onCancel, 0, false, false, defaultSkuDuration, 896, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: M1 */
    public static final void m3978M1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege, @Nullable d30 d30Var, @Nullable d30 d30Var2, boolean z, @Nullable User user) {
        str.getClass();
        m3984O1(act, str, privilege, d30Var, d30Var2, z, user, null, null, 384, null);
    }

    /* JADX INFO: renamed from: N */
    public static void m3979N(Act act, String str, g30 g30Var, Throwable th) {
        swh0.x1(act, str, g30Var);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m3980N0(Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, Privilege privilege, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            e30Var = null;
        }
        if ((i & 8) != 0) {
            d30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var2 = null;
        }
        if ((i & 32) != 0) {
            privilege = Privilege.ultra_premium_badge;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        m3977M0(act, str, e30Var, d30Var, d30Var2, privilege, str2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: N1 */
    public static final void m3981N1(@Nullable Act act, @NotNull String from, @Nullable Privilege first, @Nullable d30 onDismiss, @Nullable d30 onCancel, boolean renew, @Nullable User user, @Nullable Object tag, @Nullable e30<PurchaseType> onSuccess) {
        from.getClass();
        m3983O0(act, from, onDismiss, onCancel, first, renew, user, tag, onSuccess);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: O0 */
    public static final void m3983O0(Act act, String from, d30 onDismiss, d30 onCancel, Privilege first, boolean renew, User user, Object tag, e30<PurchaseType> onSuccess) {
        int i;
        LeftSwipeLimitConfig leftSwipeLimitConfig;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_VIP;
        boolean zM18496b = n3b0.INSTANCE.m18496b(from);
        if (!renew && CoreModule.P().a().h5()) {
            int i2 = (zM18496b && TEnum.equals(p2b0.m19990h().m19996g("vip"), "svip")) ? 1 : 0;
            if (first == Privilege.vip_unlimited_likes && CoreModule.P().a().Kj()) {
                PurchaseDialogConfigs purchaseDialogConfigsI4 = CoreModule.c.j0.I4();
                PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = PurchaseDialogConfigTriggerShowType.get("unknown_");
                if (purchaseDialogConfigsI4 != null && (leftSwipeLimitConfig = purchaseDialogConfigsI4.sceneTriggerDialog) != null) {
                    purchaseDialogConfigTriggerShowType = leftSwipeLimitConfig.swipeLimit.showType;
                }
                if (TEnum.equals(purchaseDialogConfigTriggerShowType, "vip-svip")) {
                    i = 1;
                } else {
                    i = i2;
                }
            } else {
                i = i2;
            }
            m3950D0(act, from, first, purchaseType, onSuccess, i, onDismiss, onCancel, null, null, false, false, 3840, null);
            return;
        }
        if (CoreModule.P().a().Xi() && !TextUtils.equals(from, "p_privileges_view,e_buy_privilege_button,click") && !TextUtils.equals(from, "p_privileges_view,e_ttc_renew_membership_click,click") && !TextUtils.equals(from, "p_privileges_view,e_ttc_subcription_privilege_description,click") && !TextUtils.equals(from, wek0.a) && !TextUtils.equals(from, "p_navigation_view,e_intl_me_subscription_card,click")) {
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowTypeM19997i = p2b0.m19990h().m19997i("vip", from);
            if (TEnum.equals(purchaseDialogConfigTriggerShowTypeM19997i, "vip-svip")) {
                m3950D0(act, from, first, purchaseType, onSuccess, TEnum.equals(p2b0.m19990h().m19996g("vip"), "svip") ? 1 : 0, onDismiss, onCancel, null, null, false, false, 3840, null);
                return;
            } else if (TEnum.equals(purchaseDialogConfigTriggerShowTypeM19997i, "svip")) {
                m3950D0(act, from, first, null, onSuccess, -1, onDismiss, onCancel, null, null, false, false, 3840, null);
                return;
            }
        }
        if (act != null) {
            C0189c c0189c = INSTANCE;
            ArrayList arrayListF0 = vwb.f0(new PurchaseType[]{purchaseType});
            arrayListF0.getClass();
            m4036l1(c0189c, act, arrayListF0, CollectionsKt.arrayListOf(new Privilege[]{first == null ? Privilege.vip_badge : first}), from, onSuccess, onDismiss, onCancel, 0, false, false, null, 1920, null);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m3984O1(Act act, String str, Privilege privilege, d30 d30Var, d30 d30Var2, boolean z, User user, Object obj, e30 e30Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            d30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var2 = null;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            user = null;
        }
        if ((i & 128) != 0) {
            obj = null;
        }
        m3981N1(act, str, privilege, d30Var, d30Var2, z, user, obj, (i & 256) != 0 ? null : e30Var);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: P0 */
    public static final void m3986P0(@Nullable Act act, @Nullable String str) {
        m3992S0(act, str, null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m3987Q(Act act, final e30 e30Var, final PurchaseType purchaseType, Act act2, String str) {
        c cVarDuringCreated;
        c cVarDelaySubscription;
        purchaseType.getClass();
        lsi0.w(R.string.d7);
        if (act == null || (cVarDuringCreated = act.duringCreated(new v9j() { // from class: l.o4b0
            public final Object call() {
                return C0189c.m4033k0();
            }
        })) == null || (cVarDelaySubscription = cVarDuringCreated.delaySubscription(1L, TimeUnit.SECONDS)) == null) {
            return;
        }
        cVarDelaySubscription.subscribe(mkd0.H(new e30() { // from class: l.p4b0
            public final void call(Object obj) {
                C0189c.m4035l0(e30Var, purchaseType, (List) obj);
            }
        }, new e30() { // from class: l.q4b0
            public final void call(Object obj) {
                C0189c.m4038m0((Throwable) obj);
            }
        }));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: Q0 */
    public static final void m3988Q0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege) {
        m3992S0(act, str, privilege, null, null, null, null, 120, null);
    }

    /* JADX INFO: renamed from: R */
    public static void m3989R() {
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: R0 */
    public static final void m3990R0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        List listP = fy80.p(purchaseType, purchaseType.getPrivilegeData(CoreModule.c.e0.p9().gender), firstPrivilege);
        if (act != null) {
            C0189c c0189c = INSTANCE;
            if (!c0189c.m4077V0()) {
                new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(act, purchaseType, from).g(listP).e(new g30() { // from class: l.x3b0
                    /* JADX INFO: renamed from: a */
                    public final void m25676a(Object obj, Object obj2, Object obj3) {
                        C0189c.m3996U0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).c(onDismiss).d(onCancel).f(onCancel).b(onClose).h();
                return;
            }
            ArrayList arrayListF0 = vwb.f0(new PurchaseType[]{purchaseType});
            arrayListF0.getClass();
            if (firstPrivilege == null) {
                firstPrivilege = Privilege.youth_roaming;
            }
            m4076z1(c0189c, act, arrayListF0, CollectionsKt.arrayListOf(new Privilege[]{firstPrivilege}), from, new e30() { // from class: l.w3b0
                public final void call(Object obj) {
                    C0189c.m3994T0(afterPaySuccess, (PurchaseType) obj);
                }
            }, onDismiss, onCancel, null, 0, 384, null);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m3992S0(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            e30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var = null;
        }
        if ((i & 32) != 0) {
            d30Var2 = null;
        }
        m3990R0(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: T */
    public static final void m3993T(@Nullable Act act) {
        m3999X(act, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: T0 */
    public static final void m3994T0(e30 e30Var, PurchaseType purchaseType) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
        lsi0.y("购买成功，立刻体验专属权益吧");
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: U */
    public static final void m3995U(@Nullable Act act, @Nullable String str) {
        m3999X(act, str, null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m3996U0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        lsi0.y("购买成功，立刻体验专属权益吧");
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: V */
    public static final void m3997V(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege) {
        m3999X(act, str, privilege, null, null, null, null, 120, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: W */
    public static final void m3998W(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_FEMALE_VIP;
        List listP = fy80.p(purchaseType, purchaseType.getPrivilegeData(CoreModule.c.e0.p9().gender), firstPrivilege);
        if (act != null) {
            C0189c c0189c = INSTANCE;
            if (!c0189c.m4077V0() || TextUtils.equals(from, "p_home,femalevip_icon")) {
                new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(act, purchaseType, from).g(listP).e(new g30() { // from class: l.b4b0
                    /* JADX INFO: renamed from: a */
                    public final void m10163a(Object obj, Object obj2, Object obj3) {
                        C0189c.m4001Y(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).c(onDismiss).d(onCancel).f(onCancel).b(onClose).h();
                return;
            }
            ArrayList arrayListF0 = vwb.f0(new PurchaseType[]{purchaseType});
            arrayListF0.getClass();
            if (firstPrivilege == null) {
                firstPrivilege = Privilege.pick_tantan_credits_users;
            }
            m4076z1(c0189c, act, arrayListF0, CollectionsKt.arrayListOf(new Privilege[]{firstPrivilege}), from, afterPaySuccess, onDismiss, onCancel, null, 0, 384, null);
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m3999X(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            e30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var = null;
        }
        if ((i & 32) != 0) {
            d30Var2 = null;
        }
        m3998W(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: X0 */
    public static final void m4000X0(@Nullable Act act, @NotNull String membershipType, int contractIntervalDays, @NotNull String from) {
        membershipType.getClass();
        from.getClass();
        if (act == null) {
            return;
        }
        String strM10909a = c9p.m10909a(contractIntervalDays);
        switch (membershipType.hashCode()) {
            case -318452137:
                if (membershipType.equals("premium")) {
                    kwo.m16851o(act, CollectionsKt.mutableListOf(new PurchaseType[]{PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE}), kwo.m16853q(), from, null, null, null, 0, strM10909a, false, false, 1536, null);
                    break;
                }
                break;
            case 113747:
                if (membershipType.equals("see")) {
                    m3954E1(act, "p_navigation_view,e_intl_renew_guiding_banner,click", null, null, null, 28, null);
                    break;
                }
                break;
            case 116765:
                if (membershipType.equals("vip")) {
                    C0189c c0189c = INSTANCE;
                    ArrayList arrayListF0 = vwb.f0(new PurchaseType[]{PurchaseType.TYPE_GET_VIP});
                    arrayListF0.getClass();
                    m4036l1(c0189c, act, arrayListF0, CollectionsKt.arrayListOf(new Privilege[]{Privilege.vip_badge}), from, null, null, null, 0, false, false, strM10909a, 1008, null);
                    break;
                }
                break;
            case 111384492:
                if (membershipType.equals("ultra")) {
                    C0189c c0189c2 = INSTANCE;
                    ArrayList arrayListF1 = vwb.f0(new PurchaseType[]{PurchaseType.TYPE_ULTRA_PREMIUM});
                    arrayListF1.getClass();
                    m4036l1(c0189c2, act, arrayListF1, CollectionsKt.arrayListOf(new Privilege[]{Privilege.ultra_premium_badge}), from, null, null, null, 0, false, false, strM10909a, 1008, null);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m4001Y(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m4002Y0(Act act, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = "p_navigation_view,e_intl_renew_guiding_banner,click";
        }
        m4000X0(act, str, i, str2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: Z */
    public static final void m4003Z(@Nullable Act act, @Nullable String str) {
        m4007b0(act, str, null, null, null, null, 60, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m4004a(ArrayList arrayList, Privilege privilege) {
        if (privilege != null) {
            arrayList.add(privilege);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: a0 */
    public static final void m4005a0(@Nullable Act act, @Nullable String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable Privilege firstPrivilege) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
        ArrayList privilegeData = purchaseType.getPrivilegeData((Gender) null);
        privilegeData.getClass();
        new C0186b.d(act).m3897m(purchaseType, firstPrivilege).m3895k(fy80.i(privilegeData, firstPrivilege)).m3892h(new g30() { // from class: l.y3b0
            /* JADX INFO: renamed from: a */
            public final void m26342a(Object obj, Object obj2, Object obj3) {
                C0189c.m3940A(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m3888d(from).m3890f(onDismiss).m3891g(onCancel).m3893i(onCancel).m3900p();
    }

    /* JADX INFO: renamed from: b */
    public static void m4006b(e30 e30Var) {
        CoreModule.c.k1.H3();
        if (e30Var != null) {
            e30Var.call(PurchaseType.TYPE_PICKS);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m4007b0(Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, Privilege privilege, int i, Object obj) {
        if ((i & 4) != 0) {
            e30Var = null;
        }
        if ((i & 8) != 0) {
            d30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var2 = null;
        }
        if ((i & 32) != 0) {
            privilege = Privilege.oDiamondSvipSkin;
        }
        m4005a0(act, str, e30Var, d30Var, d30Var2, privilege);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: b1 */
    public static final void m4008b1(@NotNull Act act, @NotNull String from, @Nullable final d30 onDismiss, @Nullable d30 onClose, @Nullable final e30<PurchaseType> afterPaySuccess) {
        act.getClass();
        from.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(act, PurchaseType.TYPE_GET_ACCELERATE_PAIRING, from).g(vwb.f0(new wx80[]{new wx80()})).e(new g30() { // from class: l.h4b0
            /* JADX INFO: renamed from: a */
            public final void m14166a(Object obj, Object obj2, Object obj3) {
                C0189c.m4055s(afterPaySuccess, objectRef, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).b(onClose).c(new d30() { // from class: l.i4b0
            public final void call() {
                C0189c.m4009c(onDismiss, objectRef);
            }
        }).d(new d30() { // from class: l.j4b0
            public final void call() {
                C0189c.m3989R();
            }
        }).f(new d30() { // from class: l.l4b0
            public final void call() {
                C0189c.m4061u();
            }
        }).h();
    }

    /* JADX INFO: renamed from: c */
    public static void m4009c(d30 d30Var, Ref.ObjectRef objectRef) {
        if (d30Var != null) {
            d30Var.call();
        }
        objectRef.element = null;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c0 */
    public static final void m4010c0(@Nullable Act act, @Nullable String str) {
        m4016e0(act, str, null, null, null, null, null, 124, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c1 */
    public static final void m4011c1(@Nullable Act act, @Nullable String str) {
        m4017e1(act, str, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d0 */
    public static final void m4013d0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM;
        List listP = fy80.p(purchaseType, purchaseType.getPrivilegeData(CoreModule.c.e0.p9().gender), firstPrivilege);
        if (act != null) {
            new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(act, purchaseType, from).g(listP).e(new g30() { // from class: l.v3b0
                /* JADX INFO: renamed from: a */
                public final void m23716a(Object obj, Object obj2, Object obj3) {
                    C0189c.m4019f0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).c(onDismiss).d(onCancel).f(onCancel).b(onClose).h();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d1 */
    public static final void m4014d1(@Nullable final Act act, @Nullable final String from, @Nullable final e30<PurchaseType> afterPaySuccess) {
        c cVarDuringCreated;
        if (CoreModule.P().a().h5() && swh0.v() && !xma.L3()) {
            m3950D0(act, from, Privilege.boost, null, afterPaySuccess, 0, null, null, null, null, false, false, 4072, null);
            return;
        }
        ProductCategory productCategory = ProductCategory.get("tttBoost");
        if (act == null || (cVarDuringCreated = act.duringCreated(CoreModule.c.j0.z5(productCategory, false).take(1).observeOn(jo0.a()))) == null) {
            return;
        }
        cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.u4b0
            public final void call(Object obj) {
                C0189c.m4049q(act, from, afterPaySuccess, (List) obj);
            }
        }, new e30() { // from class: l.w4b0
            public final void call(Object obj) {
                C0189c.m4021g(act, from, afterPaySuccess, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static void m4015e(final e30 e30Var, Act act, String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        g30<PurchaseType, Act, String> g30Var = e30Var != null ? new g30() { // from class: l.a5b0
            /* JADX INFO: renamed from: a */
            public final void m9395a(Object obj, Object obj2, Object obj3) {
                C0189c.m4031j1(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        } : null;
        o6n.Companion c0714b = o6n.INSTANCE;
        act.getClass();
        if (str == null) {
            str = "";
        }
        c0714b.m19254a(act, str, g30Var, null);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m4016e0(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            e30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var = null;
        }
        if ((i & 32) != 0) {
            d30Var2 = null;
        }
        m4013d0(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m4017e1(Act act, String str, e30 e30Var, int i, Object obj) {
        if ((i & 4) != 0) {
            e30Var = null;
        }
        m4014d1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m4019f0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public static final void m4020f1(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        e30Var.call(purchaseType);
    }

    /* JADX INFO: renamed from: g */
    public static void m4021g(Act act, String str, e30 e30Var, Throwable th) {
        swh0.m1(act, str, e30Var);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: g1 */
    public static final void m4022g1(@Nullable Act act, @Nullable String str) {
        m4028i1(act, str, null, 4, null);
    }

    /* JADX INFO: renamed from: h0 */
    public static final c m4024h0() {
        return CoreModule.c.C0.u4();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: h1 */
    public static final void m4025h1(@Nullable final Act act, @Nullable final String from, @Nullable final e30<PurchaseType> afterPaySuccess) {
        c cVarDuringCreated;
        ProductCategory productCategory = ProductCategory.get("tttCompliment");
        if (act == null || (cVarDuringCreated = act.duringCreated(CoreModule.c.j0.z5(productCategory, false).take(1).observeOn(jo0.a()))) == null) {
            return;
        }
        cVarDuringCreated.subscribe(mkd0.H(new e30() { // from class: l.x4b0
            public final void call(Object obj) {
                C0189c.m4015e(afterPaySuccess, act, from, (List) obj);
            }
        }, new e30() { // from class: l.y4b0
            public final void call(Object obj) {
                C0189c.m3955F((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public static void m4026i(Act act, String str, g30 g30Var, List list) {
        if (list.isEmpty()) {
            swh0.x1(act, str, g30Var);
            return;
        }
        kdp.b bVar = kdp.Companion;
        act.getClass();
        if (str == null) {
            str = "";
        }
        bVar.a(act, str, g30Var, (d30) null);
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m4027i0(e30 e30Var, PurchaseType purchaseType, List list) {
        if (CoreModule.P().a().b3() <= 0 || e30Var == null) {
            return;
        }
        e30Var.call(purchaseType);
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m4028i1(Act act, String str, e30 e30Var, int i, Object obj) {
        if ((i & 4) != 0) {
            e30Var = null;
        }
        m4025h1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m4030j0(Throwable th) {
    }

    /* JADX INFO: renamed from: j1 */
    public static final void m4031j1(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        e30Var.call(purchaseType);
    }

    /* JADX INFO: renamed from: k */
    public static void m4032k(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final c m4033k0() {
        return CoreModule.c.C0.u4();
    }

    /* JADX INFO: renamed from: l */
    public static void m4034l(d30 d30Var, PurchaseType purchaseType) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m4035l0(e30 e30Var, PurchaseType purchaseType, List list) {
        if (CoreModule.P().a().b3() <= 0 || e30Var == null) {
            return;
        }
        e30Var.call(purchaseType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m4036l1(C0189c c0189c, Act act, List list, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, int i, boolean z, boolean z2, String str2, int i2, Object obj) {
        c0189c.m4082k1(act, list, arrayList, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? null : e30Var, (i2 & 32) != 0 ? null : d30Var, (i2 & 64) != 0 ? null : d30Var2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m4038m0(Throwable th) {
    }

    /* JADX INFO: renamed from: m1 */
    public static final void m4039m1(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n0 */
    public static final void m4041n0(@Nullable Act act, @Nullable String str) {
        m4047p0(act, str, null, null, null, null, null, 124, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n1 */
    public static final void m4042n1(@Nullable Act act, @NotNull String from, @Nullable Privilege first) {
        from.getClass();
        m3984O1(act, from, first, null, null, false, null, null, null, 504, null);
    }

    /* JADX INFO: renamed from: o */
    public static void m4043o(Act act, final e30 e30Var, final PurchaseType purchaseType, Act act2, String str) {
        c cVarDuringCreated;
        c cVarDelaySubscription;
        purchaseType.getClass();
        if (act == null || (cVarDuringCreated = act.duringCreated(new v9j() { // from class: l.r4b0
            public final Object call() {
                return C0189c.m4024h0();
            }
        })) == null || (cVarDelaySubscription = cVarDuringCreated.delaySubscription(1L, TimeUnit.SECONDS)) == null) {
            return;
        }
        cVarDelaySubscription.subscribe(mkd0.H(new e30() { // from class: l.s4b0
            public final void call(Object obj) {
                C0189c.m4027i0(e30Var, purchaseType, (List) obj);
            }
        }, new e30() { // from class: l.t4b0
            public final void call(Object obj) {
                C0189c.m4030j0((Throwable) obj);
            }
        }));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: o0 */
    public static final void m4044o0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_PLATINUM;
        List listK = fy80.k(purchaseType.getPrivilegeData((Gender) null), firstPrivilege);
        if (act != null) {
            new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(act, purchaseType, from).g(listK).e(new g30() { // from class: l.e4b0
                /* JADX INFO: renamed from: a */
                public final void m12179a(Object obj, Object obj2, Object obj3) {
                    C0189c.m4050q0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).c(onDismiss).d(onCancel).f(onCancel).b(onClose).h();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: o1 */
    public static final void m4045o1(@Nullable Act act, @Nullable e30<PurchaseType> e30Var, @Nullable PurchaseType purchaseType, @Nullable String str) {
        m4051q1(act, e30Var, purchaseType, str, null, 16, null);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m4047p0(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            e30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var = null;
        }
        if ((i & 32) != 0) {
            d30Var2 = null;
        }
        m4044o0(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: p1 */
    public static final void m4048p1(@Nullable Act act, @Nullable e30<PurchaseType> afterPaySuccess, @Nullable PurchaseType purchaseType, @Nullable String from, @Nullable String other) {
        if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS && CoreModule.P().a().h5()) {
            m3950D0(act, from, (Privilege) purchaseType.getPrivilegeData(CoreModule.c.e0.p9().gender).get(0), null, afterPaySuccess, 0, null, null, other, null, false, false, 3816, null);
        } else {
            INSTANCE.m4081g0(act, afterPaySuccess, purchaseType, from, other);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m4049q(Act act, String str, final e30 e30Var, List list) {
        if (list.isEmpty()) {
            swh0.m1(act, str, e30Var);
            return;
        }
        g30<PurchaseType, Act, String> g30Var = e30Var != null ? new g30() { // from class: l.z4b0
            /* JADX INFO: renamed from: a */
            public final void m27065a(Object obj, Object obj2, Object obj3) {
                C0189c.m4020f1(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        } : null;
        y2n.Companion c0907b = y2n.INSTANCE;
        act.getClass();
        if (str == null) {
            str = "";
        }
        c0907b.m26336a(act, str, g30Var, null);
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m4050q0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m4051q1(Act act, e30 e30Var, PurchaseType purchaseType, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            e30Var = null;
        }
        if ((i & 4) != 0) {
            purchaseType = null;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        if ((i & 16) != 0) {
            str2 = "";
        }
        m4048p1(act, e30Var, purchaseType, str, str2);
    }

    /* JADX INFO: renamed from: r */
    public static Unit m4052r(boolean z, Function0 function0, boolean z2, List list, String str, Function0 function1) {
        if (z && CoreModule.c.x0.N3()) {
            function0.invoke();
        } else if (!z2 && INSTANCE.m4080a1(list, str)) {
            function0.invoke();
        } else if (z2 || !INSTANCE.m4079Z0(list, str)) {
            function1.invoke();
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r0 */
    public static final void m4053r0(@Nullable Act act, @Nullable String str) {
        m4059t0(act, str, null, null, null, null, null, 124, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r1 */
    public static final void m4054r1(@Nullable Act act, @Nullable String str) {
        m4060t1(act, str, null, 4, null);
    }

    /* JADX INFO: renamed from: s */
    public static void m4055s(e30 e30Var, Ref.ObjectRef objectRef, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        CoreModule.c.C0.x4();
        lsi0.y("购买成功");
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
        com.p1.mobile.putong.core.ui.purchase.mediator.c cVar = (com.p1.mobile.putong.core.ui.purchase.mediator.c) objectRef.element;
        if (cVar != null) {
            cVar.q();
        }
        objectRef.element = null;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s0 */
    public static final void m4056s0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_PRIVATE_CUSTOM;
        List listP = fy80.p(purchaseType, purchaseType.getPrivilegeData(CoreModule.c.e0.p9().gender), firstPrivilege);
        if (act != null) {
            new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(act, purchaseType, from).g(listP).e(new g30() { // from class: l.a4b0
                /* JADX INFO: renamed from: a */
                public final void m9318a(Object obj, Object obj2, Object obj3) {
                    C0189c.m4062u0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).c(onDismiss).d(onCancel).f(onCancel).b(onClose).h();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s1 */
    public static final void m4057s1(@Nullable Act act, @Nullable String from, @Nullable final e30<PurchaseType> picksMembershipPaySuccess) {
        if (xma.G3() && CoreModule.P().a().k()) {
            if (CoreModule.c.k1.V) {
                return;
            }
            CoreBusinessService coreBusinessServiceA = CoreModule.P().a();
            act.getClass();
            coreBusinessServiceA.op(act, new d30() { // from class: l.c4b0
                public final void call() {
                    C0189c.m4006b(picksMembershipPaySuccess);
                }
            });
            return;
        }
        if (xma.G3()) {
            if (xma.e4()) {
                m3950D0(act, from, null, null, null, 0, null, null, null, null, false, false, 4092, null);
            }
        } else if (xma.L3() || Intrinsics.d("p_picks_view_membership,e_card,like_swipe", from) || Intrinsics.d("p_picks_view_membership,unlock,click", from)) {
            m4007b0(act, from, picksMembershipPaySuccess, null, null, Privilege.picksMembership, 24, null);
        } else {
            m4071x1(INSTANCE, act, from, picksMembershipPaySuccess, null, null, 24, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m4058t(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m4059t0(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            e30Var = null;
        }
        if ((i & 16) != 0) {
            d30Var = null;
        }
        if ((i & 32) != 0) {
            d30Var2 = null;
        }
        m4056s0(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ void m4060t1(Act act, String str, e30 e30Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            e30Var = null;
        }
        m4057s1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: u */
    public static void m4061u() {
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m4062u0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: u1 */
    public static final void m4063u1(@Nullable Act act, @Nullable String from, @Nullable final e30<PurchaseType> picksMembershipPaySuccess) {
        PurchaseType purchaseType = xma.e4() ? PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP : PurchaseType.TYPE_PICKS_MEMBERSHIP;
        ArrayList privilegeData = purchaseType.getPrivilegeData((Gender) null);
        privilegeData.getClass();
        List<wx80> listJ = fy80.j(privilegeData, Privilege.picksMembership);
        for (wx80 wx80Var : listJ) {
            wx80Var.a0("每天定制推荐优质婚恋用户，助你早日脱单");
            wx80Var.G("每天定制推荐优质婚恋用户，助你早日脱单");
        }
        if (act != null) {
            new com.p1.mobile.putong.core.ui.purchase.mediator.c.a(act, purchaseType, from).a(Privilege.picksMembership).g(listJ).e(new g30() { // from class: l.t3b0
                /* JADX INFO: renamed from: a */
                public final void m22788a(Object obj, Object obj2, Object obj3) {
                    C0189c.m4066v1(picksMembershipPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).h();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m4064v(Function0 function0, Throwable th) {
        function0.invoke();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: v0 */
    public static final void m4065v0(@Nullable Act act) {
        m3950D0(act, null, null, null, null, 0, null, null, null, null, false, false, 4094, null);
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m4066v1(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m4067w(Function0 function0, List list) {
        function0.invoke();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: w0 */
    public static final void m4068w0(@Nullable Act act, @Nullable String str) {
        m3950D0(act, str, null, null, null, 0, null, null, null, null, false, false, 4092, null);
    }

    /* JADX INFO: renamed from: x */
    public static void m4069x(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: x0 */
    public static final void m4070x0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege) {
        m3950D0(act, str, privilege, null, null, 0, null, null, null, null, false, false, 4088, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ void m4071x1(C0189c c0189c, Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c0189c.m4083w1(act, str, (i & 4) != 0 ? null : e30Var, (i & 8) != 0 ? null : d30Var, (i & 16) != 0 ? null : d30Var2);
    }

    /* JADX INFO: renamed from: y */
    public static void m4072y(d30 d30Var, PurchaseType purchaseType) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: y0 */
    public static final void m4073y0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable e30<PurchaseType> e30Var) {
        m3950D0(act, str, privilege, purchaseType, e30Var, 0, null, null, null, null, false, false, 4064, null);
    }

    /* JADX INFO: renamed from: z */
    public static void m4074z(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: z0 */
    public static final void m4075z0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable e30<PurchaseType> e30Var, int i) {
        m3950D0(act, str, privilege, purchaseType, e30Var, i, null, null, null, null, false, false, 4032, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m4076z1(C0189c c0189c, Act act, List list, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, String str2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        if ((i2 & 16) != 0) {
            e30Var = null;
        }
        if ((i2 & 32) != 0) {
            d30Var = null;
        }
        if ((i2 & 64) != 0) {
            d30Var2 = null;
        }
        if ((i2 & 128) != 0) {
            str2 = "";
        }
        if ((i2 & 256) != 0) {
            i = 0;
        }
        c0189c.m4084y1(act, list, arrayList, str, e30Var, d30Var, d30Var2, str2, i);
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m4077V0() {
        User userP9 = CoreModule.c.e0.p9();
        return userP9 != null && qqi0.h(mqi0.o(), (long) userP9.createdTime, 1);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m4078W0(String from) {
        if (from == null || from.length() == 0) {
            return false;
        }
        return TextUtils.equals(from, "p_privileges_view,e_buy_privilege_button,click") || TextUtils.equals(from, "p_privileges_view,e_ttc_subcription_privilege_description,click") || TextUtils.equals(from, "p_privileges_view,e_whisper_unlock_btn_click,click");
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m4079Z0(List<? extends PurchaseType> purchaseTypeList, String from) {
        if (CoreModule.c.x0.P3() && !CoreModule.c.x0.c4() && purchaseTypeList.contains(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE)) {
            return m4078W0(from);
        }
        return false;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m4080a1(List<? extends PurchaseType> purchaseTypeList, String from) {
        return CoreModule.c.x0.P3() && CoreModule.c.x0.c4() && purchaseTypeList.contains(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) && !TextUtils.equals(from, "p_navigation_view,e_intl_me_subscription_card,click") && !TextUtils.equals(from, "p_suggest_users_home_view,e_premium_promo_50off_card,click");
    }

    /* JADX INFO: renamed from: g0 */
    public final void m4081g0(final Act act, final e30<PurchaseType> afterPaySuccess, PurchaseType purchaseType, String from, String other) {
        g30 g30Var = new g30() { // from class: l.f4b0
            /* JADX INFO: renamed from: a */
            public final void m12945a(Object obj, Object obj2, Object obj3) {
                C0189c.m4043o(act, afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        };
        if (sab0.l(purchaseType)) {
            swh0.u1(act, from, g30Var, (d30) null);
        } else {
            new C0186b.d(act).m3896l(purchaseType).m3888d(from).m3894j(other).m3892h(new g30() { // from class: l.g4b0
                /* JADX INFO: renamed from: a */
                public final void m13624a(Object obj, Object obj2, Object obj3) {
                    C0189c.m3987Q(act, afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m3900p();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m4082k1(final Act act, final List<PurchaseType> purchaseTypeList, final ArrayList<Privilege> primaryPrivileges, final String from, final e30<PurchaseType> afterPaySuccess, final d30 onDismiss, final d30 onCancel, final int selectedIdx, final boolean forceStandardPage, final boolean forcePromoFullscreen, final String defaultSkuDuration) {
        final Function0 function0 = new Function0() { // from class: l.o3b0
            public final Object invoke() {
                return C0189c.m3967J(act, purchaseTypeList, primaryPrivileges, from, selectedIdx, onDismiss, onCancel, defaultSkuDuration, afterPaySuccess);
            }
        };
        final Function0 function1 = new Function0() { // from class: l.z3b0
            public final Object invoke() {
                return C0189c.m3964I(act, primaryPrivileges, from, afterPaySuccess, onDismiss, onCancel, defaultSkuDuration);
            }
        };
        final Function0 function2 = new Function0() { // from class: l.k4b0
            public final Object invoke() {
                return C0189c.m4052r(forcePromoFullscreen, function1, forceStandardPage, purchaseTypeList, from, function0);
            }
        };
        if (purchaseTypeList.size() != 1 || purchaseTypeList.get(0) != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            function2.invoke();
        } else if (CoreModule.c.x0.N3()) {
            function2.invoke();
        } else {
            act.duringCreated(CoreModule.c.x0.w4()).subscribe(mkd0.H(new e30() { // from class: l.v4b0
                public final void call(Object obj) {
                    C0189c.m4067w(function2, (List) obj);
                }
            }, new e30() { // from class: l.b5b0
                public final void call(Object obj) {
                    C0189c.m4064v(function2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m4083w1(Act act, String from, final e30<PurchaseType> afterPaySuccess, d30 onDismiss, d30 onCancel) {
        PurchaseType purchaseType = xma.e4() ? PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP : PurchaseType.TYPE_PICKS_MEMBERSHIP;
        ArrayList privilegeData = purchaseType.getPrivilegeData((Gender) null);
        privilegeData.getClass();
        Privilege privilege = Privilege.picksMembership;
        new C0186b.d(act).m3897m(purchaseType, privilege).m3895k(fy80.j(privilegeData, privilege)).m3892h(new g30() { // from class: l.m4b0
            /* JADX INFO: renamed from: a */
            public final void m17703a(Object obj, Object obj2, Object obj3) {
                C0189c.m3952E(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m3888d(from).m3890f(onDismiss).m3891g(onCancel).m3893i(onCancel).m3900p();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m4084y1(Act act, List<PurchaseType> purchaseTypeList, ArrayList<Privilege> primaryPrivileges, String from, final e30<PurchaseType> afterPaySuccess, d30 onDismiss, d30 onCancel, String pushUser, int selectedIdx) {
        new r5b0.a(act).h(purchaseTypeList, primaryPrivileges).b(from).g(pushUser).f(new g30() { // from class: l.d4b0
            /* JADX INFO: renamed from: a */
            public final void m11602a(Object obj, Object obj2, Object obj3) {
                C0189c.m4058t(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).i(selectedIdx).d(onDismiss).e(onCancel).c(onCancel).j();
    }
}
