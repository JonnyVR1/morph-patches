package com.p051p1.mobile.putong.core.p058ui.purchase;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.LeftSwipeLimitConfig;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p051p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.C8941c;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.DialogC8942d;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.open.SocialConstants;
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
import kotlin.ranges.C15274a;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.a30;
import p153l.a5i0;
import p153l.a690;
import p153l.bbb0;
import p153l.cbp;
import p153l.cok0;
import p153l.fo0;
import p153l.gta;
import p153l.j690;
import p153l.joa;
import p153l.jyb;
import p153l.kfp;
import p153l.kyo;
import p153l.o1j0;
import p153l.o8n;
import p153l.pcj;
import p153l.psd0;
import p153l.pzi0;
import p153l.rbb0;
import p153l.tab0;
import p153l.tzi0;
import p153l.vdb0;
import p153l.w8p;
import p153l.wib0;
import p153l.x20;
import p153l.y20;
import p153l.y4n;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0012\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J{\u0010\u001a\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ{\u0010\u001c\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u009d\u0001\u0010&\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010'J\u0089\u0001\u0010.\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\b0*j\b\u0012\u0004\u0012\u00020\b`+2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u009d\u0001\u00102\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\b0*j\b\u0012\u0004\u0012\u00020\b`+2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010-\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b2\u00103J)\u00105\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u0018042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b5\u00106J)\u00107\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u0018042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b7\u00106J\u0019\u00108\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b8\u00109JY\u0010:\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b:\u0010;Jc\u0010<\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b<\u0010=J5\u0010@\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020!2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0010H\u0002¢\u0006\u0004\bB\u0010CJ7\u0010E\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bE\u0010FJ7\u0010G\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bG\u0010FJM\u0010K\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010H\u001a\u00020!2\u001c\b\u0002\u0010J\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010IH\u0007¢\u0006\u0004\bK\u0010LJO\u0010O\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bO\u0010PJO\u0010Q\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bQ\u0010PJO\u0010R\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bR\u0010SJ+\u0010T\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bT\u0010UJ5\u0010V\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bV\u0010FJg\u0010X\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bX\u0010YJK\u0010Z\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bZ\u0010[Jg\u0010\\\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\\\u0010YJg\u0010]\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b]\u0010YJg\u0010^\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b^\u0010YJg\u0010_\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b_\u0010YJ[\u0010`\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b`\u0010aJ5\u0010b\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bb\u0010F¨\u0006c"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/c;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "Lcom/p1/mobile/putong/core/data/Privilege;", "first", "Ll/x20;", "onDismiss", "tag", "", "D1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Ll/x20;Ljava/lang/Object;)V", "", "renew", "E0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/x20;Lcom/p1/mobile/putong/core/data/Privilege;ZLjava/lang/Object;)V", "onCancel", "Lcom/p1/mobile/putong/data/User;", "user", "Ll/y20;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onSuccess", "N1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Ll/x20;Ll/x20;ZLcom/p1/mobile/putong/data/User;Ljava/lang/Object;Ll/y20;)V", "O0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/x20;Ll/x20;Lcom/p1/mobile/putong/core/data/Privilege;ZLcom/p1/mobile/putong/data/User;Ljava/lang/Object;Ll/y20;)V", "firstPrivilege", "firstPurchaseType", "afterPaySuccess", "", "selectedIdxP", "pushUser", "showPurchasePage", "forcePromoFullscreen", "C0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ll/y20;ILl/x20;Ll/x20;Ljava/lang/String;Ljava/lang/Object;ZZ)V", "", "purchaseTypeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "primaryPrivileges", "selectedIdx", "y1", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;Ll/y20;Ll/x20;Ll/x20;Ljava/lang/String;I)V", "forceStandardPage", "defaultSkuDuration", "k1", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;Ll/y20;Ll/x20;Ll/x20;IZZLjava/lang/String;)V", "", "a1", "(Ljava/util/List;Ljava/lang/String;)Z", "Z0", "W0", "(Ljava/lang/String;)Z", "a0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/y20;Ll/x20;Ll/x20;Lcom/p1/mobile/putong/core/data/Privilege;)V", "M0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/y20;Ll/x20;Ll/x20;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;)V", "membershipType", "contractIntervalDays", "X0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;ILjava/lang/String;)V", "V0", "()Z", "picksMembershipPaySuccess", "s1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/y20;)V", "u1", "sendNum", "Ll/a30;", "onPaymentSuccess", "G1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;ILl/a30;)V", "purchaseType", "other", "p1", "(Lcom/p1/mobile/android/app/Act;Ll/y20;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ljava/lang/String;)V", "g0", "w1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/y20;Ll/x20;Ll/x20;)V", "n1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;)V", "d1", "onClose", "o0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Ll/y20;Ll/x20;Ll/x20;Ll/x20;)V", "b1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/x20;Ll/x20;Ll/y20;)V", "W", "R0", "s0", "d0", "H0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/y20;Ll/x20;Ll/x20;Ll/x20;)V", "h1", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class C8927c {

    @NotNull
    public static final C8927c INSTANCE = new C8927c();

    /* JADX INFO: renamed from: A */
    public static void m54557A(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: A0 */
    public static final void m54558A0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable y20<PurchaseType> y20Var, int i, @Nullable x20 x20Var, @Nullable x20 x20Var2) {
        m54567D0(act, str, privilege, purchaseType, y20Var, i, x20Var, x20Var2, null, null, false, false, 3840, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: A1 */
    public static final void m54559A1(@Nullable Act act, @NotNull String str) {
        str.getClass();
        m54571E1(act, str, null, null, null, 28, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: B0 */
    public static final void m54561B0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable y20<PurchaseType> y20Var, int i, @Nullable x20 x20Var, @Nullable x20 x20Var2, @Nullable String str2, @Nullable Object obj, boolean z) {
        m54567D0(act, str, privilege, purchaseType, y20Var, i, x20Var, x20Var2, str2, obj, z, false, 2048, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: B1 */
    public static final void m54562B1(@Nullable Act act, @NotNull String str, @NotNull Privilege privilege) {
        str.getClass();
        privilege.getClass();
        m54571E1(act, str, privilege, null, null, 24, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: C0 */
    public static final void m54564C0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable PurchaseType firstPurchaseType, @Nullable final y20<PurchaseType> afterPaySuccess, int selectedIdxP, @Nullable x20 onDismiss, @Nullable final x20 onCancel, @Nullable String pushUser, @Nullable Object tag, boolean showPurchasePage, boolean forcePromoFullscreen) {
        Privilege privilege = firstPrivilege;
        int iM180755h = selectedIdxP == -1 ? rbb0.INSTANCE.m180755h(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) : selectedIdxP;
        if (firstPurchaseType == null) {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null);
            privilegeDataForGP.getClass();
            List<a690> listM143625q = j690.m143625q(privilegeDataForGP, privilege, purchaseType);
            if (bbb0.m103261a(act, from, privilege, firstPurchaseType, afterPaySuccess, selectedIdxP, onDismiss, onCancel, tag)) {
                return;
            }
            if (act == null) {
                new C8924b.d(act).m54514m(purchaseType, privilege).m54512k(listM143625q).m54509h(new a30() { // from class: l.gdb0
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        C8927c.m54686x(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m54511j(pushUser).m54505d(from).m54516o(tag).m54507f(onDismiss).m54508g(onCancel).m54506e(onCancel).m54510i(onCancel).m54517p();
                return;
            }
            C8927c c8927c = INSTANCE;
            ArrayList arrayListM147507f0 = jyb.m147507f0(purchaseType);
            arrayListM147507f0.getClass();
            if (privilege == null) {
                privilege = Privilege.svip_badge;
            }
            m54653l1(c8927c, act, arrayListM147507f0, CollectionsKt.arrayListOf(privilege), from, afterPaySuccess, onDismiss, onCancel, 0, showPurchasePage, forcePromoFullscreen, null, 1152, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(firstPurchaseType);
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(privilege);
        arrayList2.add(privilege);
        int iM88486b = C15274a.m88486b(iM180755h, 0);
        if (iM88486b <= 0 || !bbb0.m103261a(act, from, privilege, firstPurchaseType, afterPaySuccess, selectedIdxP, onDismiss, onCancel, tag)) {
            if (iM88486b == 0 && bbb0.m103262b(act, from, firstPrivilege, firstPurchaseType, afterPaySuccess, selectedIdxP, onDismiss, onCancel, tag)) {
                return;
            }
            if (act == null) {
                new C8930f.d(act).m54891h(arrayList).m54884a(arrayList2).m54892i(iM88486b).m54887d(onDismiss).m54888e(new y20() { // from class: l.idb0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8927c.m54689y(onCancel, (PurchaseType) obj);
                    }
                }).m54890g(new y20() { // from class: l.jdb0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8927c.m54575G(onCancel, (PurchaseType) obj);
                    }
                }).m54886c(new y20() { // from class: l.kdb0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        C8927c.m54651l(onCancel, (PurchaseType) obj);
                    }
                }).m54889f(new a30() { // from class: l.tbb0
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        C8927c.m54691z(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m54885b(from).m54893j();
                return;
            }
            final ArrayList arrayList3 = new ArrayList();
            jyb.m147537z(arrayList2, new y20() { // from class: l.hdb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8927c.m54621a(arrayList3, (Privilege) obj);
                }
            });
            m54653l1(INSTANCE, act, arrayList, arrayList3, from, afterPaySuccess, onDismiss, onCancel, iM88486b, false, false, null, 1792, null);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: C1 */
    public static final void m54565C1(@Nullable Act act, @NotNull String str, @NotNull Privilege privilege, @Nullable x20 x20Var) {
        str.getClass();
        privilege.getClass();
        m54571E1(act, str, privilege, x20Var, null, 16, null);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m54567D0(Act act, String str, Privilege privilege, PurchaseType purchaseType, y20 y20Var, int i, x20 x20Var, x20 x20Var2, String str2, Object obj, boolean z, boolean z2, int i2, Object obj2) {
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
            y20Var = null;
        }
        if ((i2 & 32) != 0) {
            i = -1;
        }
        if ((i2 & 64) != 0) {
            x20Var = null;
        }
        if ((i2 & 128) != 0) {
            x20Var2 = null;
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
        m54564C0(act, str, privilege, purchaseType, y20Var, i, x20Var, x20Var2, str2, obj, z, (i2 & 2048) != 0 ? false : z2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: D1 */
    public static final void m54568D1(@Nullable Act act, @NotNull String from, @NotNull Privilege first, @Nullable final x20 onDismiss, @Nullable Object tag) {
        from.getClass();
        first.getClass();
        if (CoreModule.m30933P().m143405a().mo34510h5()) {
            m54567D0(act, from, first, null, null, 0, new x20() { // from class: l.ubb0
                @Override // p153l.x20
                public final void call() {
                    C8927c.m54649k(onDismiss);
                }
            }, null, null, null, false, false, 4024, null);
        } else {
            m54570E0(act, from, onDismiss, first, false, tag);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m54569E(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: E0 */
    public static final void m54570E0(Act act, String from, x20 onDismiss, Privilege first, boolean renew, Object tag) {
        new C8924b.d(act).m54515n(PurchaseType.TYPE_GET_LIKERS, first, renew).m54505d(from).m54507f(onDismiss).m54516o(tag).m54517p();
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m54571E1(Act act, String str, Privilege privilege, x20 x20Var, Object obj, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = Privilege.see_who_likes_me;
        }
        if ((i & 8) != 0) {
            x20Var = null;
        }
        if ((i & 16) != 0) {
            obj = null;
        }
        m54568D1(act, str, privilege, x20Var, obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m54572F(Throwable th) {
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: F0 */
    public static final void m54573F0(@Nullable Act act, @Nullable String str) {
        m54582I0(act, str, null, null, null, null, 60, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: F1 */
    public static final void m54574F1(@Nullable Act act, @Nullable String str) {
        m54580H1(act, str, 0, null, 12, null);
    }

    /* JADX INFO: renamed from: G */
    public static void m54575G(x20 x20Var, PurchaseType purchaseType) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: G0 */
    public static final void m54576G0(@Nullable Act act, @Nullable String str, @Nullable y20<PurchaseType> y20Var, @Nullable x20 x20Var) {
        m54582I0(act, str, y20Var, x20Var, null, null, 48, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: G1 */
    public static final void m54577G1(@Nullable final Act act, @Nullable final String from, int sendNum, @Nullable final a30<PurchaseType, Act, String> onPaymentSuccess) {
        C22421c c22421cDuringCreated;
        if (sendNum > 1) {
            CoreModule.m30933P().m143405a().mo34564pg(act, onPaymentSuccess, sendNum, from);
            return;
        }
        if (!gta.m132210e().m132214d().mo34745Qi()) {
            a5i0.m96182x1(act, from, onPaymentSuccess);
            return;
        }
        ProductCategory productCategory = ProductCategory.get(ProductCategory.tttSuperLike);
        if (act == null || (c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20396j0.m31649z5(productCategory, false).take(1).observeOn(fo0.m126432a()))) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.vbb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54643i(act, from, onPaymentSuccess, (List) obj);
            }
        }, new y20() { // from class: l.wbb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54596N(act, from, onPaymentSuccess, (Throwable) obj);
            }
        }));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: H0 */
    public static final void m54579H0(@Nullable Act act, @Nullable String from, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable x20 onDismiss, @Nullable x20 onCancel, @Nullable x20 onClose) {
        if (act != null) {
            new DialogC8942d.a(act, from).m55317d(new a30() { // from class: l.rcb0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    C8927c.m54585J0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m55315b(onDismiss).m55316c(onCancel).m55314a(onClose).m55318e();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m54580H1(Act act, String str, int i, a30 a30Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            a30Var = null;
        }
        m54577G1(act, str, i, a30Var);
    }

    /* JADX INFO: renamed from: I */
    public static Unit m54581I(Act act, ArrayList arrayList, String str, y20 y20Var, x20 x20Var, x20 x20Var2, String str2) {
        kyo.m152065u(act, arrayList, str, y20Var, x20Var, x20Var2, str2, false, 128, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m54582I0(Act act, String str, y20 y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            y20Var = null;
        }
        if ((i & 8) != 0) {
            x20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var2 = null;
        }
        m54579H0(act, str, y20Var, x20Var, x20Var2, (i & 32) != 0 ? null : x20Var3);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: I1 */
    public static final void m54583I1(@Nullable Act act, @NotNull String str) {
        str.getClass();
        m54601O1(act, str, null, null, null, false, null, null, null, 508, null);
    }

    /* JADX INFO: renamed from: J */
    public static Unit m54584J(Act act, List list, ArrayList arrayList, String str, int i, x20 x20Var, x20 x20Var2, String str2, final y20 y20Var) {
        w8p.C21047a c21047aM205516e = new w8p.C21047a(act).m205520i(list, arrayList).m205515d(str).m205519h(new a30() { // from class: l.ybb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                C8927c.m54656m1(y20Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m205521j(i).m205517f(x20Var).m205518g(x20Var2).m205516e(x20Var2);
        if (str2 != null && str2.length() != 0) {
            c21047aM205516e.m205514c(str2);
        }
        c21047aM205516e.m205522k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m54585J0(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: J1 */
    public static final void m54586J1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege) {
        str.getClass();
        m54601O1(act, str, privilege, null, null, false, null, null, null, HttpStatus.GATEWAY_TIMEOUT_504, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: K0 */
    public static final void m54588K0(@NotNull Act act, @Nullable String str, @Nullable y20<PurchaseType> y20Var, @Nullable x20 x20Var, @Nullable x20 x20Var2) {
        act.getClass();
        m54597N0(act, str, y20Var, x20Var, x20Var2, null, null, 96, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: K1 */
    public static final void m54589K1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege, @Nullable x20 x20Var, @Nullable x20 x20Var2) {
        str.getClass();
        m54601O1(act, str, privilege, x20Var, x20Var2, false, null, null, null, 480, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: L0 */
    public static final void m54591L0(@NotNull Act act, @Nullable String str, @Nullable y20<PurchaseType> y20Var, @Nullable x20 x20Var, @Nullable x20 x20Var2, @Nullable Privilege privilege) {
        act.getClass();
        m54597N0(act, str, y20Var, x20Var, x20Var2, privilege, null, 64, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: L1 */
    public static final void m54592L1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege, @Nullable x20 x20Var, @Nullable x20 x20Var2, boolean z) {
        str.getClass();
        m54601O1(act, str, privilege, x20Var, x20Var2, z, null, null, null, 448, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: M0 */
    public static final void m54594M0(@NotNull Act act, @Nullable String from, @Nullable y20<PurchaseType> afterPaySuccess, @Nullable x20 onDismiss, @Nullable x20 onCancel, @Nullable Privilege firstPrivilege, @Nullable String defaultSkuDuration) {
        act.getClass();
        C8927c c8927c = INSTANCE;
        ArrayList arrayListM147507f0 = jyb.m147507f0(PurchaseType.TYPE_ULTRA_PREMIUM);
        arrayListM147507f0.getClass();
        m54653l1(c8927c, act, arrayListM147507f0, CollectionsKt.arrayListOf(firstPrivilege == null ? Privilege.ultra_premium_badge : firstPrivilege), from, afterPaySuccess, onDismiss, onCancel, 0, false, false, defaultSkuDuration, 896, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: M1 */
    public static final void m54595M1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege, @Nullable x20 x20Var, @Nullable x20 x20Var2, boolean z, @Nullable User user) {
        str.getClass();
        m54601O1(act, str, privilege, x20Var, x20Var2, z, user, null, null, 384, null);
    }

    /* JADX INFO: renamed from: N */
    public static void m54596N(Act act, String str, a30 a30Var, Throwable th) {
        a5i0.m96182x1(act, str, a30Var);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m54597N0(Act act, String str, y20 y20Var, x20 x20Var, x20 x20Var2, Privilege privilege, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            y20Var = null;
        }
        if ((i & 8) != 0) {
            x20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var2 = null;
        }
        if ((i & 32) != 0) {
            privilege = Privilege.ultra_premium_badge;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        m54594M0(act, str, y20Var, x20Var, x20Var2, privilege, str2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: N1 */
    public static final void m54598N1(@Nullable Act act, @NotNull String from, @Nullable Privilege first, @Nullable x20 onDismiss, @Nullable x20 onCancel, boolean renew, @Nullable User user, @Nullable Object tag, @Nullable y20<PurchaseType> onSuccess) {
        from.getClass();
        m54600O0(act, from, onDismiss, onCancel, first, renew, user, tag, onSuccess);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: O0 */
    public static final void m54600O0(Act act, String from, x20 onDismiss, x20 onCancel, Privilege first, boolean renew, User user, Object tag, y20<PurchaseType> onSuccess) {
        int i;
        LeftSwipeLimitConfig leftSwipeLimitConfig;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_VIP;
        boolean zM180754b = rbb0.INSTANCE.m180754b(from);
        if (!renew && CoreModule.m30933P().m143405a().mo34510h5()) {
            int i2 = (zM180754b && TEnum.equals(tab0.m189811h().m189817g("vip"), "svip")) ? 1 : 0;
            if (first == Privilege.vip_unlimited_likes && CoreModule.m30933P().m143405a().mo34356Kj()) {
                PurchaseDialogConfigs purchaseDialogConfigsM31591I4 = CoreModule.f18264c.f20396j0.m31591I4();
                PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = PurchaseDialogConfigTriggerShowType.get("unknown_");
                if (purchaseDialogConfigsM31591I4 != null && (leftSwipeLimitConfig = purchaseDialogConfigsM31591I4.sceneTriggerDialog) != null) {
                    purchaseDialogConfigTriggerShowType = leftSwipeLimitConfig.swipeLimit.showType;
                }
                if (TEnum.equals(purchaseDialogConfigTriggerShowType, PurchaseDialogConfigTriggerShowType.vip_svip)) {
                    i = 1;
                } else {
                    i = i2;
                }
            } else {
                i = i2;
            }
            m54567D0(act, from, first, purchaseType, onSuccess, i, onDismiss, onCancel, null, null, false, false, 3840, null);
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34445Xi() && !TextUtils.equals(from, "p_privileges_view,e_buy_privilege_button,click") && !TextUtils.equals(from, "p_privileges_view,e_ttc_renew_membership_click,click") && !TextUtils.equals(from, "p_privileges_view,e_ttc_subcription_privilege_description,click") && !TextUtils.equals(from, cok0.f82895a) && !TextUtils.equals(from, "p_navigation_view,e_intl_me_subscription_card,click")) {
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowTypeM189818i = tab0.m189811h().m189818i("vip", from);
            if (TEnum.equals(purchaseDialogConfigTriggerShowTypeM189818i, PurchaseDialogConfigTriggerShowType.vip_svip)) {
                m54567D0(act, from, first, purchaseType, onSuccess, TEnum.equals(tab0.m189811h().m189817g("vip"), "svip") ? 1 : 0, onDismiss, onCancel, null, null, false, false, 3840, null);
                return;
            } else if (TEnum.equals(purchaseDialogConfigTriggerShowTypeM189818i, "svip")) {
                m54567D0(act, from, first, null, onSuccess, -1, onDismiss, onCancel, null, null, false, false, 3840, null);
                return;
            }
        }
        if (act != null) {
            C8927c c8927c = INSTANCE;
            ArrayList arrayListM147507f0 = jyb.m147507f0(purchaseType);
            arrayListM147507f0.getClass();
            m54653l1(c8927c, act, arrayListM147507f0, CollectionsKt.arrayListOf(first == null ? Privilege.vip_badge : first), from, onSuccess, onDismiss, onCancel, 0, false, false, null, WBConstants.SDK_NEW_PAY_VERSION, null);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m54601O1(Act act, String str, Privilege privilege, x20 x20Var, x20 x20Var2, boolean z, User user, Object obj, y20 y20Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            x20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var2 = null;
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
        m54598N1(act, str, privilege, x20Var, x20Var2, z, user, obj, (i & 256) != 0 ? null : y20Var);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: P0 */
    public static final void m54603P0(@Nullable Act act, @Nullable String str) {
        m54609S0(act, str, null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m54604Q(Act act, final y20 y20Var, final PurchaseType purchaseType, Act act2, String str) {
        C22421c c22421cDuringCreated;
        C22421c c22421cDelaySubscription;
        purchaseType.getClass();
        o1j0.m165649w(R$string.f28268d7);
        if (act == null || (c22421cDuringCreated = act.duringCreated(new pcj() { // from class: l.scb0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C8927c.m54650k0();
            }
        })) == null || (c22421cDelaySubscription = c22421cDuringCreated.delaySubscription(1L, TimeUnit.SECONDS)) == null) {
            return;
        }
        c22421cDelaySubscription.subscribe(psd0.m173597H(new y20() { // from class: l.tcb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54652l0(y20Var, purchaseType, (List) obj);
            }
        }, new y20() { // from class: l.ucb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54655m0((Throwable) obj);
            }
        }));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: Q0 */
    public static final void m54605Q0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege) {
        m54609S0(act, str, privilege, null, null, null, null, 120, null);
    }

    /* JADX INFO: renamed from: R */
    public static void m54606R() {
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: R0 */
    public static final void m54607R0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable x20 onDismiss, @Nullable x20 onCancel, @Nullable x20 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        List<a690> listM143624p = j690.m143624p(purchaseType, purchaseType.getPrivilegeData(CoreModule.f18264c.f20381e0.m116600p9().gender), firstPrivilege);
        if (act != null) {
            C8927c c8927c = INSTANCE;
            if (!c8927c.m54694V0()) {
                new C8941c.a(act, purchaseType, from).m55277g(listM143624p).m55275e(new a30() { // from class: l.bcb0
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        C8927c.m54613U0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m55273c(onDismiss).m55274d(onCancel).m55276f(onCancel).m55272b(onClose).m55278h();
                return;
            }
            ArrayList arrayListM147507f0 = jyb.m147507f0(purchaseType);
            arrayListM147507f0.getClass();
            if (firstPrivilege == null) {
                firstPrivilege = Privilege.youth_roaming;
            }
            m54693z1(c8927c, act, arrayListM147507f0, CollectionsKt.arrayListOf(firstPrivilege), from, new y20() { // from class: l.acb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8927c.m54611T0(afterPaySuccess, (PurchaseType) obj);
                }
            }, onDismiss, onCancel, null, 0, 384, null);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m54609S0(Act act, String str, Privilege privilege, y20 y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            y20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var = null;
        }
        if ((i & 32) != 0) {
            x20Var2 = null;
        }
        m54607R0(act, str, privilege, y20Var, x20Var, x20Var2, (i & 64) != 0 ? null : x20Var3);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: T */
    public static final void m54610T(@Nullable Act act) {
        m54616X(act, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: T0 */
    public static final void m54611T0(y20 y20Var, PurchaseType purchaseType) {
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
        o1j0.m165651y("购买成功，立刻体验专属权益吧");
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: U */
    public static final void m54612U(@Nullable Act act, @Nullable String str) {
        m54616X(act, str, null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m54613U0(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        o1j0.m165651y("购买成功，立刻体验专属权益吧");
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: V */
    public static final void m54614V(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege) {
        m54616X(act, str, privilege, null, null, null, null, 120, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: W */
    public static final void m54615W(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable x20 onDismiss, @Nullable x20 onCancel, @Nullable x20 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_FEMALE_VIP;
        List<a690> listM143624p = j690.m143624p(purchaseType, purchaseType.getPrivilegeData(CoreModule.f18264c.f20381e0.m116600p9().gender), firstPrivilege);
        if (act != null) {
            C8927c c8927c = INSTANCE;
            if (!c8927c.m54694V0() || TextUtils.equals(from, "p_home,femalevip_icon")) {
                new C8941c.a(act, purchaseType, from).m55277g(listM143624p).m55275e(new a30() { // from class: l.fcb0
                    @Override // p153l.a30
                    /* JADX INFO: renamed from: a */
                    public final void mo37058a(Object obj, Object obj2, Object obj3) {
                        C8927c.m54618Y(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m55273c(onDismiss).m55274d(onCancel).m55276f(onCancel).m55272b(onClose).m55278h();
                return;
            }
            ArrayList arrayListM147507f0 = jyb.m147507f0(purchaseType);
            arrayListM147507f0.getClass();
            if (firstPrivilege == null) {
                firstPrivilege = Privilege.pick_tantan_credits_users;
            }
            m54693z1(c8927c, act, arrayListM147507f0, CollectionsKt.arrayListOf(firstPrivilege), from, afterPaySuccess, onDismiss, onCancel, null, 0, 384, null);
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m54616X(Act act, String str, Privilege privilege, y20 y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            y20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var = null;
        }
        if ((i & 32) != 0) {
            x20Var2 = null;
        }
        m54615W(act, str, privilege, y20Var, x20Var, x20Var2, (i & 64) != 0 ? null : x20Var3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: X0 */
    public static final void m54617X0(@Nullable Act act, @NotNull String membershipType, int contractIntervalDays, @NotNull String from) {
        membershipType.getClass();
        from.getClass();
        if (act == null) {
            return;
        }
        String strM108653a = cbp.m108653a(contractIntervalDays);
        switch (membershipType.hashCode()) {
            case -318452137:
                if (membershipType.equals("premium")) {
                    kyo.m152059o(act, CollectionsKt.mutableListOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), kyo.m152061q(), from, null, null, null, 0, strM108653a, false, false, 1536, null);
                    break;
                }
                break;
            case 113747:
                if (membershipType.equals("see")) {
                    m54571E1(act, "p_navigation_view,e_intl_renew_guiding_banner,click", null, null, null, 28, null);
                    break;
                }
                break;
            case 116765:
                if (membershipType.equals("vip")) {
                    C8927c c8927c = INSTANCE;
                    ArrayList arrayListM147507f0 = jyb.m147507f0(PurchaseType.TYPE_GET_VIP);
                    arrayListM147507f0.getClass();
                    m54653l1(c8927c, act, arrayListM147507f0, CollectionsKt.arrayListOf(Privilege.vip_badge), from, null, null, null, 0, false, false, strM108653a, 1008, null);
                    break;
                }
                break;
            case 111384492:
                if (membershipType.equals("ultra")) {
                    C8927c c8927c2 = INSTANCE;
                    ArrayList arrayListM147507f1 = jyb.m147507f0(PurchaseType.TYPE_ULTRA_PREMIUM);
                    arrayListM147507f1.getClass();
                    m54653l1(c8927c2, act, arrayListM147507f1, CollectionsKt.arrayListOf(Privilege.ultra_premium_badge), from, null, null, null, 0, false, false, strM108653a, 1008, null);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m54618Y(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m54619Y0(Act act, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = "p_navigation_view,e_intl_renew_guiding_banner,click";
        }
        m54617X0(act, str, i, str2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: Z */
    public static final void m54620Z(@Nullable Act act, @Nullable String str) {
        m54624b0(act, str, null, null, null, null, 60, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m54621a(ArrayList arrayList, Privilege privilege) {
        if (privilege != null) {
            arrayList.add(privilege);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: a0 */
    public static final void m54622a0(@Nullable Act act, @Nullable String from, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable x20 onDismiss, @Nullable x20 onCancel, @Nullable Privilege firstPrivilege) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
        ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
        privilegeData.getClass();
        new C8924b.d(act).m54514m(purchaseType, firstPrivilege).m54512k(j690.m143617i(privilegeData, firstPrivilege)).m54509h(new a30() { // from class: l.ccb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                C8927c.m54557A(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m54505d(from).m54507f(onDismiss).m54508g(onCancel).m54510i(onCancel).m54517p();
    }

    /* JADX INFO: renamed from: b */
    public static void m54623b(y20 y20Var) {
        CoreModule.f18264c.f20400k1.m121129H3();
        if (y20Var != null) {
            y20Var.call(PurchaseType.TYPE_PICKS);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m54624b0(Act act, String str, y20 y20Var, x20 x20Var, x20 x20Var2, Privilege privilege, int i, Object obj) {
        if ((i & 4) != 0) {
            y20Var = null;
        }
        if ((i & 8) != 0) {
            x20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var2 = null;
        }
        if ((i & 32) != 0) {
            privilege = Privilege.oDiamondSvipSkin;
        }
        m54622a0(act, str, y20Var, x20Var, x20Var2, privilege);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T, com.p1.mobile.putong.core.ui.purchase.mediator.c] */
    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: b1 */
    public static final void m54625b1(@NotNull Act act, @NotNull String from, @Nullable final x20 onDismiss, @Nullable x20 onClose, @Nullable final y20<PurchaseType> afterPaySuccess) {
        act.getClass();
        from.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new C8941c.a(act, PurchaseType.TYPE_GET_ACCELERATE_PAIRING, from).m55277g(jyb.m147507f0(new a690())).m55275e(new a30() { // from class: l.lcb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                C8927c.m54672s(afterPaySuccess, objectRef, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m55272b(onClose).m55273c(new x20() { // from class: l.mcb0
            @Override // p153l.x20
            public final void call() {
                C8927c.m54626c(onDismiss, objectRef);
            }
        }).m55274d(new x20() { // from class: l.ncb0
            @Override // p153l.x20
            public final void call() {
                C8927c.m54606R();
            }
        }).m55276f(new x20() { // from class: l.pcb0
            @Override // p153l.x20
            public final void call() {
                C8927c.m54678u();
            }
        }).m55278h();
    }

    /* JADX INFO: renamed from: c */
    public static void m54626c(x20 x20Var, Ref.ObjectRef objectRef) {
        if (x20Var != null) {
            x20Var.call();
        }
        objectRef.element = null;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c0 */
    public static final void m54627c0(@Nullable Act act, @Nullable String str) {
        m54633e0(act, str, null, null, null, null, null, 124, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c1 */
    public static final void m54628c1(@Nullable Act act, @Nullable String str) {
        m54634e1(act, str, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d0 */
    public static final void m54630d0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable x20 onDismiss, @Nullable x20 onCancel, @Nullable x20 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM;
        List<a690> listM143624p = j690.m143624p(purchaseType, purchaseType.getPrivilegeData(CoreModule.f18264c.f20381e0.m116600p9().gender), firstPrivilege);
        if (act != null) {
            new C8941c.a(act, purchaseType, from).m55277g(listM143624p).m55275e(new a30() { // from class: l.zbb0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    C8927c.m54636f0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m55273c(onDismiss).m55274d(onCancel).m55276f(onCancel).m55272b(onClose).m55278h();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d1 */
    public static final void m54631d1(@Nullable final Act act, @Nullable final String from, @Nullable final y20<PurchaseType> afterPaySuccess) {
        C22421c c22421cDuringCreated;
        if (CoreModule.m30933P().m143405a().mo34510h5() && a5i0.m96174v() && !joa.m146361M3()) {
            m54567D0(act, from, Privilege.boost, null, afterPaySuccess, 0, null, null, null, null, false, false, 4072, null);
            return;
        }
        ProductCategory productCategory = ProductCategory.get(ProductCategory.tttBoost);
        if (act == null || (c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20396j0.m31649z5(productCategory, false).take(1).observeOn(fo0.m126432a()))) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.ycb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54666q(act, from, afterPaySuccess, (List) obj);
            }
        }, new y20() { // from class: l.adb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54638g(act, from, afterPaySuccess, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static void m54632e(final y20 y20Var, Act act, String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        a30<PurchaseType, Act, String> a30Var = y20Var != null ? new a30() { // from class: l.edb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                C8927c.m54648j1(y20Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        } : null;
        o8n.Companion c19054b = o8n.INSTANCE;
        act.getClass();
        if (str == null) {
            str = "";
        }
        c19054b.m166608a(act, str, a30Var, null);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m54633e0(Act act, String str, Privilege privilege, y20 y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            y20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var = null;
        }
        if ((i & 32) != 0) {
            x20Var2 = null;
        }
        m54630d0(act, str, privilege, y20Var, x20Var, x20Var2, (i & 64) != 0 ? null : x20Var3);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m54634e1(Act act, String str, y20 y20Var, int i, Object obj) {
        if ((i & 4) != 0) {
            y20Var = null;
        }
        m54631d1(act, str, y20Var);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m54636f0(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public static final void m54637f1(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        y20Var.call(purchaseType);
    }

    /* JADX INFO: renamed from: g */
    public static void m54638g(Act act, String str, y20 y20Var, Throwable th) {
        a5i0.m96152m1(act, str, y20Var);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: g1 */
    public static final void m54639g1(@Nullable Act act, @Nullable String str) {
        m54645i1(act, str, null, 4, null);
    }

    /* JADX INFO: renamed from: h0 */
    public static final C22421c m54641h0() {
        return CoreModule.f18264c.f20297C0.m146425v4();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: h1 */
    public static final void m54642h1(@Nullable final Act act, @Nullable final String from, @Nullable final y20<PurchaseType> afterPaySuccess) {
        C22421c c22421cDuringCreated;
        ProductCategory productCategory = ProductCategory.get(ProductCategory.tttCompliment);
        if (act == null || (c22421cDuringCreated = act.duringCreated(CoreModule.f18264c.f20396j0.m31649z5(productCategory, false).take(1).observeOn(fo0.m126432a()))) == null) {
            return;
        }
        c22421cDuringCreated.subscribe(psd0.m173597H(new y20() { // from class: l.bdb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54632e(afterPaySuccess, act, from, (List) obj);
            }
        }, new y20() { // from class: l.cdb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54572F((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public static void m54643i(Act act, String str, a30 a30Var, List list) {
        if (list.isEmpty()) {
            a5i0.m96182x1(act, str, a30Var);
            return;
        }
        kfp.Companion c18154b = kfp.INSTANCE;
        act.getClass();
        if (str == null) {
            str = "";
        }
        c18154b.m149618a(act, str, a30Var, null);
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m54644i0(y20 y20Var, PurchaseType purchaseType, List list) {
        if (CoreModule.m30933P().m143405a().mo34471b3() <= 0 || y20Var == null) {
            return;
        }
        y20Var.call(purchaseType);
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m54645i1(Act act, String str, y20 y20Var, int i, Object obj) {
        if ((i & 4) != 0) {
            y20Var = null;
        }
        m54642h1(act, str, y20Var);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m54647j0(Throwable th) {
    }

    /* JADX INFO: renamed from: j1 */
    public static final void m54648j1(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        y20Var.call(purchaseType);
    }

    /* JADX INFO: renamed from: k */
    public static void m54649k(x20 x20Var) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final C22421c m54650k0() {
        return CoreModule.f18264c.f20297C0.m146425v4();
    }

    /* JADX INFO: renamed from: l */
    public static void m54651l(x20 x20Var, PurchaseType purchaseType) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m54652l0(y20 y20Var, PurchaseType purchaseType, List list) {
        if (CoreModule.m30933P().m143405a().mo34471b3() <= 0 || y20Var == null) {
            return;
        }
        y20Var.call(purchaseType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m54653l1(C8927c c8927c, Act act, List list, ArrayList arrayList, String str, y20 y20Var, x20 x20Var, x20 x20Var2, int i, boolean z, boolean z2, String str2, int i2, Object obj) {
        c8927c.m54699k1(act, list, arrayList, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? null : y20Var, (i2 & 32) != 0 ? null : x20Var, (i2 & 64) != 0 ? null : x20Var2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m54655m0(Throwable th) {
    }

    /* JADX INFO: renamed from: m1 */
    public static final void m54656m1(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n0 */
    public static final void m54658n0(@Nullable Act act, @Nullable String str) {
        m54664p0(act, str, null, null, null, null, null, 124, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n1 */
    public static final void m54659n1(@Nullable Act act, @NotNull String from, @Nullable Privilege first) {
        from.getClass();
        m54601O1(act, from, first, null, null, false, null, null, null, HttpStatus.GATEWAY_TIMEOUT_504, null);
    }

    /* JADX INFO: renamed from: o */
    public static void m54660o(Act act, final y20 y20Var, final PurchaseType purchaseType, Act act2, String str) {
        C22421c c22421cDuringCreated;
        C22421c c22421cDelaySubscription;
        purchaseType.getClass();
        if (act == null || (c22421cDuringCreated = act.duringCreated(new pcj() { // from class: l.vcb0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C8927c.m54641h0();
            }
        })) == null || (c22421cDelaySubscription = c22421cDuringCreated.delaySubscription(1L, TimeUnit.SECONDS)) == null) {
            return;
        }
        c22421cDelaySubscription.subscribe(psd0.m173597H(new y20() { // from class: l.wcb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54644i0(y20Var, purchaseType, (List) obj);
            }
        }, new y20() { // from class: l.xcb0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8927c.m54647j0((Throwable) obj);
            }
        }));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: o0 */
    public static final void m54661o0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable x20 onDismiss, @Nullable x20 onCancel, @Nullable x20 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_PLATINUM;
        List<a690> listM143619k = j690.m143619k(purchaseType.getPrivilegeData(null), firstPrivilege);
        if (act != null) {
            new C8941c.a(act, purchaseType, from).m55277g(listM143619k).m55275e(new a30() { // from class: l.icb0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    C8927c.m54667q0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m55273c(onDismiss).m55274d(onCancel).m55276f(onCancel).m55272b(onClose).m55278h();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: o1 */
    public static final void m54662o1(@Nullable Act act, @Nullable y20<PurchaseType> y20Var, @Nullable PurchaseType purchaseType, @Nullable String str) {
        m54668q1(act, y20Var, purchaseType, str, null, 16, null);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m54664p0(Act act, String str, Privilege privilege, y20 y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            y20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var = null;
        }
        if ((i & 32) != 0) {
            x20Var2 = null;
        }
        m54661o0(act, str, privilege, y20Var, x20Var, x20Var2, (i & 64) != 0 ? null : x20Var3);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: p1 */
    public static final void m54665p1(@Nullable Act act, @Nullable y20<PurchaseType> afterPaySuccess, @Nullable PurchaseType purchaseType, @Nullable String from, @Nullable String other) {
        if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS && CoreModule.m30933P().m143405a().mo34510h5()) {
            m54567D0(act, from, purchaseType.getPrivilegeData(CoreModule.f18264c.f20381e0.m116600p9().gender).get(0), null, afterPaySuccess, 0, null, null, other, null, false, false, 3816, null);
        } else {
            INSTANCE.m54698g0(act, afterPaySuccess, purchaseType, from, other);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m54666q(Act act, String str, final y20 y20Var, List list) {
        if (list.isEmpty()) {
            a5i0.m96152m1(act, str, y20Var);
            return;
        }
        a30<PurchaseType, Act, String> a30Var = y20Var != null ? new a30() { // from class: l.ddb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                C8927c.m54637f1(y20Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        } : null;
        y4n.Companion c21519b = y4n.INSTANCE;
        act.getClass();
        if (str == null) {
            str = "";
        }
        c21519b.m214271a(act, str, a30Var, null);
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m54667q0(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m54668q1(Act act, y20 y20Var, PurchaseType purchaseType, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            y20Var = null;
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
        m54665p1(act, y20Var, purchaseType, str, str2);
    }

    /* JADX INFO: renamed from: r */
    public static Unit m54669r(boolean z, Function0 function0, boolean z2, List list, String str, Function0 function1) {
        if (z && CoreModule.f18264c.f20438x0.m31184N3()) {
            function0.invoke();
        } else if (!z2 && INSTANCE.m54697a1(list, str)) {
            function0.invoke();
        } else if (z2 || !INSTANCE.m54696Z0(list, str)) {
            function1.invoke();
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r0 */
    public static final void m54670r0(@Nullable Act act, @Nullable String str) {
        m54676t0(act, str, null, null, null, null, null, 124, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r1 */
    public static final void m54671r1(@Nullable Act act, @Nullable String str) {
        m54677t1(act, str, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m54672s(y20 y20Var, Ref.ObjectRef objectRef, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        CoreModule.f18264c.f20297C0.m146428y4();
        o1j0.m165651y("购买成功");
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
        C8941c c8941c = (C8941c) objectRef.element;
        if (c8941c != null) {
            c8941c.m55261q();
        }
        objectRef.element = null;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s0 */
    public static final void m54673s0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final y20<PurchaseType> afterPaySuccess, @Nullable x20 onDismiss, @Nullable x20 onCancel, @Nullable x20 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_PRIVATE_CUSTOM;
        List<a690> listM143624p = j690.m143624p(purchaseType, purchaseType.getPrivilegeData(CoreModule.f18264c.f20381e0.m116600p9().gender), firstPrivilege);
        if (act != null) {
            new C8941c.a(act, purchaseType, from).m55277g(listM143624p).m55275e(new a30() { // from class: l.ecb0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    C8927c.m54679u0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m55273c(onDismiss).m55274d(onCancel).m55276f(onCancel).m55272b(onClose).m55278h();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s1 */
    public static final void m54674s1(@Nullable Act act, @Nullable String from, @Nullable final y20<PurchaseType> picksMembershipPaySuccess) {
        if (joa.m146358H3() && CoreModule.m30933P().m143405a().mo34532k()) {
            if (CoreModule.f18264c.f20400k1.f94499V) {
                return;
            }
            CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
            act.getClass();
            coreBusinessServiceM143405a.mo34561op(act, new x20() { // from class: l.gcb0
                @Override // p153l.x20
                public final void call() {
                    C8927c.m54623b(picksMembershipPaySuccess);
                }
            });
            return;
        }
        if (joa.m146358H3()) {
            if (joa.m146386f4()) {
                m54567D0(act, from, null, null, null, 0, null, null, null, null, false, false, 4092, null);
            }
        } else if (joa.m146361M3() || Intrinsics.m88377d("p_picks_view_membership,e_card,like_swipe", from) || Intrinsics.m88377d("p_picks_view_membership,unlock,click", from)) {
            m54624b0(act, from, picksMembershipPaySuccess, null, null, Privilege.picksMembership, 24, null);
        } else {
            m54688x1(INSTANCE, act, from, picksMembershipPaySuccess, null, null, 24, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m54675t(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m54676t0(Act act, String str, Privilege privilege, y20 y20Var, x20 x20Var, x20 x20Var2, x20 x20Var3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            privilege = null;
        }
        if ((i & 8) != 0) {
            y20Var = null;
        }
        if ((i & 16) != 0) {
            x20Var = null;
        }
        if ((i & 32) != 0) {
            x20Var2 = null;
        }
        m54673s0(act, str, privilege, y20Var, x20Var, x20Var2, (i & 64) != 0 ? null : x20Var3);
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ void m54677t1(Act act, String str, y20 y20Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            y20Var = null;
        }
        m54674s1(act, str, y20Var);
    }

    /* JADX INFO: renamed from: u */
    public static void m54678u() {
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m54679u0(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: u1 */
    public static final void m54680u1(@Nullable Act act, @Nullable String from, @Nullable final y20<PurchaseType> picksMembershipPaySuccess) {
        PurchaseType purchaseType = joa.m146386f4() ? PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP : PurchaseType.TYPE_PICKS_MEMBERSHIP;
        ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
        privilegeData.getClass();
        List<a690> listM143618j = j690.m143618j(privilegeData, Privilege.picksMembership);
        for (a690 a690Var : listM143618j) {
            a690Var.m96289a0("每天定制推荐优质婚恋用户，助你早日脱单");
            a690Var.m96268G("每天定制推荐优质婚恋用户，助你早日脱单");
        }
        if (act != null) {
            new C8941c.a(act, purchaseType, from).m55271a(Privilege.picksMembership).m55277g(listM143618j).m55275e(new a30() { // from class: l.xbb0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    C8927c.m54683v1(picksMembershipPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m55278h();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m54681v(Function0 function0, Throwable th) {
        function0.invoke();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: v0 */
    public static final void m54682v0(@Nullable Act act) {
        m54567D0(act, null, null, null, null, 0, null, null, null, null, false, false, 4094, null);
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m54683v1(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m54684w(Function0 function0, List list) {
        function0.invoke();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: w0 */
    public static final void m54685w0(@Nullable Act act, @Nullable String str) {
        m54567D0(act, str, null, null, null, 0, null, null, null, null, false, false, 4092, null);
    }

    /* JADX INFO: renamed from: x */
    public static void m54686x(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: x0 */
    public static final void m54687x0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege) {
        m54567D0(act, str, privilege, null, null, 0, null, null, null, null, false, false, 4088, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ void m54688x1(C8927c c8927c, Act act, String str, y20 y20Var, x20 x20Var, x20 x20Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c8927c.m54700w1(act, str, (i & 4) != 0 ? null : y20Var, (i & 8) != 0 ? null : x20Var, (i & 16) != 0 ? null : x20Var2);
    }

    /* JADX INFO: renamed from: y */
    public static void m54689y(x20 x20Var, PurchaseType purchaseType) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: y0 */
    public static final void m54690y0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable y20<PurchaseType> y20Var) {
        m54567D0(act, str, privilege, purchaseType, y20Var, 0, null, null, null, null, false, false, 4064, null);
    }

    /* JADX INFO: renamed from: z */
    public static void m54691z(y20 y20Var, PurchaseType purchaseType, Act act, String str) {
        if (y20Var != null) {
            y20Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: z0 */
    public static final void m54692z0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable y20<PurchaseType> y20Var, int i) {
        m54567D0(act, str, privilege, purchaseType, y20Var, i, null, null, null, null, false, false, 4032, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m54693z1(C8927c c8927c, Act act, List list, ArrayList arrayList, String str, y20 y20Var, x20 x20Var, x20 x20Var2, String str2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        if ((i2 & 16) != 0) {
            y20Var = null;
        }
        if ((i2 & 32) != 0) {
            x20Var = null;
        }
        if ((i2 & 64) != 0) {
            x20Var2 = null;
        }
        if ((i2 & 128) != 0) {
            str2 = "";
        }
        if ((i2 & 256) != 0) {
            i = 0;
        }
        c8927c.m54701y1(act, list, arrayList, str, y20Var, x20Var, x20Var2, str2, i);
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m54694V0() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return userM116600p9 != null && tzi0.m193670h(pzi0.m174454o(), (long) userM116600p9.createdTime, 1);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m54695W0(String from) {
        if (from == null || from.length() == 0) {
            return false;
        }
        return TextUtils.equals(from, "p_privileges_view,e_buy_privilege_button,click") || TextUtils.equals(from, "p_privileges_view,e_ttc_subcription_privilege_description,click") || TextUtils.equals(from, "p_privileges_view,e_whisper_unlock_btn_click,click");
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m54696Z0(List<? extends PurchaseType> purchaseTypeList, String from) {
        if (CoreModule.f18264c.f20438x0.m31186P3() && !CoreModule.f18264c.f20438x0.m31193c4() && purchaseTypeList.contains(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE)) {
            return m54695W0(from);
        }
        return false;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m54697a1(List<? extends PurchaseType> purchaseTypeList, String from) {
        return CoreModule.f18264c.f20438x0.m31186P3() && CoreModule.f18264c.f20438x0.m31193c4() && purchaseTypeList.contains(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) && !TextUtils.equals(from, "p_navigation_view,e_intl_me_subscription_card,click") && !TextUtils.equals(from, "p_suggest_users_home_view,e_premium_promo_50off_card,click");
    }

    /* JADX INFO: renamed from: g0 */
    public final void m54698g0(final Act act, final y20<PurchaseType> afterPaySuccess, PurchaseType purchaseType, String from, String other) {
        a30 a30Var = new a30() { // from class: l.jcb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                C8927c.m54660o(act, afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        };
        if (wib0.m206568l(purchaseType)) {
            a5i0.m96173u1(act, from, a30Var, null);
        } else {
            new C8924b.d(act).m54513l(purchaseType).m54505d(from).m54511j(other).m54509h(new a30() { // from class: l.kcb0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    C8927c.m54604Q(act, afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m54517p();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m54699k1(final Act act, final List<PurchaseType> purchaseTypeList, final ArrayList<Privilege> primaryPrivileges, final String from, final y20<PurchaseType> afterPaySuccess, final x20 onDismiss, final x20 onCancel, final int selectedIdx, final boolean forceStandardPage, final boolean forcePromoFullscreen, final String defaultSkuDuration) {
        final Function0 function0 = new Function0() { // from class: l.sbb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8927c.m54584J(act, purchaseTypeList, primaryPrivileges, from, selectedIdx, onDismiss, onCancel, defaultSkuDuration, afterPaySuccess);
            }
        };
        final Function0 function1 = new Function0() { // from class: l.dcb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8927c.m54581I(act, primaryPrivileges, from, afterPaySuccess, onDismiss, onCancel, defaultSkuDuration);
            }
        };
        final Function0 function2 = new Function0() { // from class: l.ocb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8927c.m54669r(forcePromoFullscreen, function1, forceStandardPage, purchaseTypeList, from, function0);
            }
        };
        if (purchaseTypeList.size() != 1 || purchaseTypeList.get(0) != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            function2.invoke();
        } else if (CoreModule.f18264c.f20438x0.m31184N3()) {
            function2.invoke();
        } else {
            act.duringCreated(CoreModule.f18264c.f20438x0.m31222w4()).subscribe(psd0.m173597H(new y20() { // from class: l.zcb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8927c.m54684w(function2, (List) obj);
                }
            }, new y20() { // from class: l.fdb0
                @Override // p153l.y20
                public final void call(Object obj) {
                    C8927c.m54681v(function2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m54700w1(Act act, String from, final y20<PurchaseType> afterPaySuccess, x20 onDismiss, x20 onCancel) {
        PurchaseType purchaseType = joa.m146386f4() ? PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP : PurchaseType.TYPE_PICKS_MEMBERSHIP;
        ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
        privilegeData.getClass();
        Privilege privilege = Privilege.picksMembership;
        new C8924b.d(act).m54514m(purchaseType, privilege).m54512k(j690.m143618j(privilegeData, privilege)).m54509h(new a30() { // from class: l.qcb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                C8927c.m54569E(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m54505d(from).m54507f(onDismiss).m54508g(onCancel).m54510i(onCancel).m54517p();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m54701y1(Act act, List<PurchaseType> purchaseTypeList, ArrayList<Privilege> primaryPrivileges, String from, final y20<PurchaseType> afterPaySuccess, x20 onDismiss, x20 onCancel, String pushUser, int selectedIdx) {
        new vdb0.C20815a(act).m200962h(purchaseTypeList, primaryPrivileges).m200956b(from).m200961g(pushUser).m200960f(new a30() { // from class: l.hcb0
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                C8927c.m54675t(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m200963i(selectedIdx).m200958d(onDismiss).m200959e(onCancel).m200957c(onCancel).m200964j();
    }
}
