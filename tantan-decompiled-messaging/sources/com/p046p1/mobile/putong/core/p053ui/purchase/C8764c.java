package com.p046p1.mobile.putong.core.p053ui.purchase;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.LeftSwipeLimitConfig;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigTriggerShowType;
import com.p046p1.mobile.putong.core.data.PurchaseDialogConfigs;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.C8778c;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.DialogC8779d;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.open.SocialConstants;
import com.tencent.wcdb.FileUtils;
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
import kotlin.ranges.C15167a;
import org.eclipse.jetty.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.c9p;
import p149l.d30;
import p149l.e30;
import p149l.fy80;
import p149l.g30;
import p149l.jo0;
import p149l.kdp;
import p149l.kwo;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.n3b0;
import p149l.o6n;
import p149l.p2b0;
import p149l.qqi0;
import p149l.r5b0;
import p149l.sab0;
import p149l.swh0;
import p149l.ura;
import p149l.v9j;
import p149l.vwb;
import p149l.w6p;
import p149l.wek0;
import p149l.wx80;
import p149l.x2b0;
import p149l.xma;
import p149l.y2n;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0012\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J{\u0010\u001a\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ{\u0010\u001c\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u009d\u0001\u0010&\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010'J\u0089\u0001\u0010.\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\b0*j\b\u0012\u0004\u0012\u00020\b`+2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010-\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J\u009d\u0001\u00102\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(2\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\b0*j\b\u0012\u0004\u0012\u00020\b`+2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010-\u001a\u00020!2\b\b\u0002\u00100\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u00102\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b2\u00103J)\u00105\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u0018042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b5\u00106J)\u00107\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u0018042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b7\u00106J\u0019\u00108\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b8\u00109JY\u0010:\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b:\u0010;Jc\u0010<\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b<\u0010=J5\u0010@\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010>\u001a\u00020\u00062\b\b\u0002\u0010?\u001a\u00020!2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0010H\u0002¢\u0006\u0004\bB\u0010CJ7\u0010E\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bE\u0010FJ7\u0010G\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bG\u0010FJM\u0010K\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010H\u001a\u00020!2\u001c\b\u0002\u0010J\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010IH\u0007¢\u0006\u0004\bK\u0010LJO\u0010O\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bO\u0010PJO\u0010Q\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bQ\u0010PJO\u0010R\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bR\u0010SJ+\u0010T\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bT\u0010UJ5\u0010V\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bV\u0010FJg\u0010X\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bX\u0010YJK\u0010Z\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bZ\u0010[Jg\u0010\\\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\\\u0010YJg\u0010]\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b]\u0010YJg\u0010^\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b^\u0010YJg\u0010_\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b_\u0010YJ[\u0010`\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b`\u0010aJ5\u0010b\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0004\bb\u0010F¨\u0006c"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/c;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "from", "Lcom/p1/mobile/putong/core/data/Privilege;", "first", "Ll/d30;", "onDismiss", "tag", "", "D1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Ll/d30;Ljava/lang/Object;)V", "", "renew", "E0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/d30;Lcom/p1/mobile/putong/core/data/Privilege;ZLjava/lang/Object;)V", "onCancel", "Lcom/p1/mobile/putong/data/User;", "user", "Ll/e30;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "onSuccess", "N1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Ll/d30;Ll/d30;ZLcom/p1/mobile/putong/data/User;Ljava/lang/Object;Ll/e30;)V", "O0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/d30;Ll/d30;Lcom/p1/mobile/putong/core/data/Privilege;ZLcom/p1/mobile/putong/data/User;Ljava/lang/Object;Ll/e30;)V", "firstPrivilege", "firstPurchaseType", "afterPaySuccess", "", "selectedIdxP", "pushUser", "showPurchasePage", "forcePromoFullscreen", "C0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;Ll/e30;ILl/d30;Ll/d30;Ljava/lang/String;Ljava/lang/Object;ZZ)V", "", "purchaseTypeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "primaryPrivileges", "selectedIdx", "y1", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Ljava/lang/String;I)V", "forceStandardPage", "defaultSkuDuration", "k1", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/util/ArrayList;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;IZZLjava/lang/String;)V", "", "a1", "(Ljava/util/List;Ljava/lang/String;)Z", "Z0", "W0", "(Ljava/lang/String;)Z", "a0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Lcom/p1/mobile/putong/core/data/Privilege;)V", "M0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Lcom/p1/mobile/putong/core/data/Privilege;Ljava/lang/String;)V", "membershipType", "contractIntervalDays", "X0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;ILjava/lang/String;)V", "V0", "()Z", "picksMembershipPaySuccess", "s1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;)V", "u1", "sendNum", "Ll/g30;", "onPaymentSuccess", "G1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;ILl/g30;)V", "purchaseType", "other", "p1", "(Lcom/p1/mobile/android/app/Act;Ll/e30;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;Ljava/lang/String;)V", "g0", "w1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;)V", "n1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;)V", "d1", "onClose", "o0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Lcom/p1/mobile/putong/core/data/Privilege;Ll/e30;Ll/d30;Ll/d30;Ll/d30;)V", "b1", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/d30;Ll/d30;Ll/e30;)V", "W", "R0", "s0", "d0", "H0", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ll/e30;Ll/d30;Ll/d30;Ll/d30;)V", "h1", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class C8764c {

    @NotNull
    public static final C8764c INSTANCE = new C8764c();

    /* JADX INFO: renamed from: A */
    public static void m53374A(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: A0 */
    public static final void m53375A0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable e30<PurchaseType> e30Var, int i, @Nullable d30 d30Var, @Nullable d30 d30Var2) {
        m53384D0(act, str, privilege, purchaseType, e30Var, i, d30Var, d30Var2, null, null, false, false, 3840, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: A1 */
    public static final void m53376A1(@Nullable Act act, @NotNull String str) {
        str.getClass();
        m53388E1(act, str, null, null, null, 28, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: B0 */
    public static final void m53378B0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable e30<PurchaseType> e30Var, int i, @Nullable d30 d30Var, @Nullable d30 d30Var2, @Nullable String str2, @Nullable Object obj, boolean z) {
        m53384D0(act, str, privilege, purchaseType, e30Var, i, d30Var, d30Var2, str2, obj, z, false, 2048, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: B1 */
    public static final void m53379B1(@Nullable Act act, @NotNull String str, @NotNull Privilege privilege) {
        str.getClass();
        privilege.getClass();
        m53388E1(act, str, privilege, null, null, 24, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: C0 */
    public static final void m53381C0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable PurchaseType firstPurchaseType, @Nullable final e30<PurchaseType> afterPaySuccess, int selectedIdxP, @Nullable d30 onDismiss, @Nullable final d30 onCancel, @Nullable String pushUser, @Nullable Object tag, boolean showPurchasePage, boolean forcePromoFullscreen) {
        Privilege privilege = firstPrivilege;
        int iM157753h = selectedIdxP == -1 ? n3b0.INSTANCE.m157753h(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) : selectedIdxP;
        if (firstPurchaseType == null) {
            PurchaseType purchaseType = PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
            ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null);
            privilegeDataForGP.getClass();
            List<wx80> listM123721q = fy80.m123721q(privilegeDataForGP, privilege, purchaseType);
            if (x2b0.m206846a(act, from, privilege, firstPurchaseType, afterPaySuccess, selectedIdxP, onDismiss, onCancel, tag)) {
                return;
            }
            if (act == null) {
                new C8761b.d(act).m53331m(purchaseType, privilege).m53329k(listM123721q).m53326h(new g30() { // from class: l.c5b0
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        C8764c.m53503x(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m53328j(pushUser).m53322d(from).m53333o(tag).m53324f(onDismiss).m53325g(onCancel).m53323e(onCancel).m53327i(onCancel).m53334p();
                return;
            }
            C8764c c8764c = INSTANCE;
            ArrayList arrayListM200324f0 = vwb.m200324f0(purchaseType);
            arrayListM200324f0.getClass();
            if (privilege == null) {
                privilege = Privilege.svip_badge;
            }
            m53470l1(c8764c, act, arrayListM200324f0, CollectionsKt.arrayListOf(privilege), from, afterPaySuccess, onDismiss, onCancel, 0, showPurchasePage, forcePromoFullscreen, null, 1152, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(firstPurchaseType);
        arrayList.add(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(privilege);
        arrayList2.add(privilege);
        int iM87596b = C15167a.m87596b(iM157753h, 0);
        if (iM87596b <= 0 || !x2b0.m206846a(act, from, privilege, firstPurchaseType, afterPaySuccess, selectedIdxP, onDismiss, onCancel, tag)) {
            if (iM87596b == 0 && x2b0.m206847b(act, from, firstPrivilege, firstPurchaseType, afterPaySuccess, selectedIdxP, onDismiss, onCancel, tag)) {
                return;
            }
            if (act == null) {
                new C8767f.d(act).m53708h(arrayList).m53701a(arrayList2).m53709i(iM87596b).m53704d(onDismiss).m53705e(new e30() { // from class: l.e5b0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8764c.m53506y(onCancel, (PurchaseType) obj);
                    }
                }).m53707g(new e30() { // from class: l.f5b0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8764c.m53392G(onCancel, (PurchaseType) obj);
                    }
                }).m53703c(new e30() { // from class: l.g5b0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        C8764c.m53468l(onCancel, (PurchaseType) obj);
                    }
                }).m53706f(new g30() { // from class: l.p3b0
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        C8764c.m53508z(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m53702b(from).m53710j();
                return;
            }
            final ArrayList arrayList3 = new ArrayList();
            vwb.m200354z(arrayList2, new e30() { // from class: l.d5b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8764c.m53438a(arrayList3, (Privilege) obj);
                }
            });
            m53470l1(INSTANCE, act, arrayList, arrayList3, from, afterPaySuccess, onDismiss, onCancel, iM87596b, false, false, null, 1792, null);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: C1 */
    public static final void m53382C1(@Nullable Act act, @NotNull String str, @NotNull Privilege privilege, @Nullable d30 d30Var) {
        str.getClass();
        privilege.getClass();
        m53388E1(act, str, privilege, d30Var, null, 16, null);
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m53384D0(Act act, String str, Privilege privilege, PurchaseType purchaseType, e30 e30Var, int i, d30 d30Var, d30 d30Var2, String str2, Object obj, boolean z, boolean z2, int i2, Object obj2) {
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
        m53381C0(act, str, privilege, purchaseType, e30Var, i, d30Var, d30Var2, str2, obj, z, (i2 & 2048) != 0 ? false : z2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: D1 */
    public static final void m53385D1(@Nullable Act act, @NotNull String from, @NotNull Privilege first, @Nullable final d30 onDismiss, @Nullable Object tag) {
        from.getClass();
        first.getClass();
        if (CoreModule.m29935P().m94651a().mo33507h5()) {
            m53384D0(act, from, first, null, null, 0, new d30() { // from class: l.q3b0
                @Override // p149l.d30
                public final void call() {
                    C8764c.m53466k(onDismiss);
                }
            }, null, null, null, false, false, 4024, null);
        } else {
            m53387E0(act, from, onDismiss, first, false, tag);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m53386E(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: E0 */
    public static final void m53387E0(Act act, String from, d30 onDismiss, Privilege first, boolean renew, Object tag) {
        new C8761b.d(act).m53332n(PurchaseType.TYPE_GET_LIKERS, first, renew).m53322d(from).m53324f(onDismiss).m53333o(tag).m53334p();
    }

    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ void m53388E1(Act act, String str, Privilege privilege, d30 d30Var, Object obj, int i, Object obj2) {
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
        m53385D1(act, str, privilege, d30Var, obj);
    }

    /* JADX INFO: renamed from: F */
    public static void m53389F(Throwable th) {
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: F0 */
    public static final void m53390F0(@Nullable Act act, @Nullable String str) {
        m53399I0(act, str, null, null, null, null, 60, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: F1 */
    public static final void m53391F1(@Nullable Act act, @Nullable String str) {
        m53397H1(act, str, 0, null, 12, null);
    }

    /* JADX INFO: renamed from: G */
    public static void m53392G(d30 d30Var, PurchaseType purchaseType) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: G0 */
    public static final void m53393G0(@Nullable Act act, @Nullable String str, @Nullable e30<PurchaseType> e30Var, @Nullable d30 d30Var) {
        m53399I0(act, str, e30Var, d30Var, null, null, 48, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: G1 */
    public static final void m53394G1(@Nullable final Act act, @Nullable final String from, int sendNum, @Nullable final g30<PurchaseType, Act, String> onPaymentSuccess) {
        C22306c c22306cDuringCreated;
        if (sendNum > 1) {
            CoreModule.m29935P().m94651a().mo33561pg(act, onPaymentSuccess, sendNum, from);
            return;
        }
        if (!ura.m195053e().m195057d().mo33742Qi()) {
            swh0.m186277x1(act, from, onPaymentSuccess);
            return;
        }
        ProductCategory productCategory = ProductCategory.get(ProductCategory.tttSuperLike);
        if (act == null || (c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19654j0.m30646z5(productCategory, false).take(1).observeOn(jo0.m142408a()))) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.r3b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53460i(act, from, onPaymentSuccess, (List) obj);
            }
        }, new e30() { // from class: l.s3b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53413N(act, from, onPaymentSuccess, (Throwable) obj);
            }
        }));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: H0 */
    public static final void m53396H0(@Nullable Act act, @Nullable String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        if (act != null) {
            new DialogC8779d.a(act, from).m54134d(new g30() { // from class: l.n4b0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    C8764c.m53402J0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m54132b(onDismiss).m54133c(onCancel).m54131a(onClose).m54135e();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public static /* synthetic */ void m53397H1(Act act, String str, int i, g30 g30Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        if ((i2 & 8) != 0) {
            g30Var = null;
        }
        m53394G1(act, str, i, g30Var);
    }

    /* JADX INFO: renamed from: I */
    public static Unit m53398I(Act act, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, String str2) {
        kwo.m147626u(act, arrayList, str, e30Var, d30Var, d30Var2, str2, false, 128, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m53399I0(Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
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
        m53396H0(act, str, e30Var, d30Var, d30Var2, (i & 32) != 0 ? null : d30Var3);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: I1 */
    public static final void m53400I1(@Nullable Act act, @NotNull String str) {
        str.getClass();
        m53418O1(act, str, null, null, null, false, null, null, null, 508, null);
    }

    /* JADX INFO: renamed from: J */
    public static Unit m53401J(Act act, List list, ArrayList arrayList, String str, int i, d30 d30Var, d30 d30Var2, String str2, final e30 e30Var) {
        w6p.C20813a c20813aM201949e = new w6p.C20813a(act).m201953i(list, arrayList).m201948d(str).m201952h(new g30() { // from class: l.u3b0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                C8764c.m53473m1(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m201954j(i).m201950f(d30Var).m201951g(d30Var2).m201949e(d30Var2);
        if (str2 != null && str2.length() != 0) {
            c20813aM201949e.m201947c(str2);
        }
        c20813aM201949e.m201955k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m53402J0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: J1 */
    public static final void m53403J1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege) {
        str.getClass();
        m53418O1(act, str, privilege, null, null, false, null, null, null, HttpStatus.GATEWAY_TIMEOUT_504, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: K0 */
    public static final void m53405K0(@NotNull Act act, @Nullable String str, @Nullable e30<PurchaseType> e30Var, @Nullable d30 d30Var, @Nullable d30 d30Var2) {
        act.getClass();
        m53414N0(act, str, e30Var, d30Var, d30Var2, null, null, 96, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: K1 */
    public static final void m53406K1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege, @Nullable d30 d30Var, @Nullable d30 d30Var2) {
        str.getClass();
        m53418O1(act, str, privilege, d30Var, d30Var2, false, null, null, null, 480, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: L0 */
    public static final void m53408L0(@NotNull Act act, @Nullable String str, @Nullable e30<PurchaseType> e30Var, @Nullable d30 d30Var, @Nullable d30 d30Var2, @Nullable Privilege privilege) {
        act.getClass();
        m53414N0(act, str, e30Var, d30Var, d30Var2, privilege, null, 64, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: L1 */
    public static final void m53409L1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege, @Nullable d30 d30Var, @Nullable d30 d30Var2, boolean z) {
        str.getClass();
        m53418O1(act, str, privilege, d30Var, d30Var2, z, null, null, null, FileUtils.S_IRWXU, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: M0 */
    public static final void m53411M0(@NotNull Act act, @Nullable String from, @Nullable e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable Privilege firstPrivilege, @Nullable String defaultSkuDuration) {
        act.getClass();
        C8764c c8764c = INSTANCE;
        ArrayList arrayListM200324f0 = vwb.m200324f0(PurchaseType.TYPE_ULTRA_PREMIUM);
        arrayListM200324f0.getClass();
        m53470l1(c8764c, act, arrayListM200324f0, CollectionsKt.arrayListOf(firstPrivilege == null ? Privilege.ultra_premium_badge : firstPrivilege), from, afterPaySuccess, onDismiss, onCancel, 0, false, false, defaultSkuDuration, 896, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: M1 */
    public static final void m53412M1(@Nullable Act act, @NotNull String str, @Nullable Privilege privilege, @Nullable d30 d30Var, @Nullable d30 d30Var2, boolean z, @Nullable User user) {
        str.getClass();
        m53418O1(act, str, privilege, d30Var, d30Var2, z, user, null, null, 384, null);
    }

    /* JADX INFO: renamed from: N */
    public static void m53413N(Act act, String str, g30 g30Var, Throwable th) {
        swh0.m186277x1(act, str, g30Var);
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m53414N0(Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, Privilege privilege, String str2, int i, Object obj) {
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
        m53411M0(act, str, e30Var, d30Var, d30Var2, privilege, str2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: N1 */
    public static final void m53415N1(@Nullable Act act, @NotNull String from, @Nullable Privilege first, @Nullable d30 onDismiss, @Nullable d30 onCancel, boolean renew, @Nullable User user, @Nullable Object tag, @Nullable e30<PurchaseType> onSuccess) {
        from.getClass();
        m53417O0(act, from, onDismiss, onCancel, first, renew, user, tag, onSuccess);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: O0 */
    public static final void m53417O0(Act act, String from, d30 onDismiss, d30 onCancel, Privilege first, boolean renew, User user, Object tag, e30<PurchaseType> onSuccess) {
        int i;
        LeftSwipeLimitConfig leftSwipeLimitConfig;
        PurchaseType purchaseType = PurchaseType.TYPE_GET_VIP;
        boolean zM157752b = n3b0.INSTANCE.m157752b(from);
        if (!renew && CoreModule.m29935P().m94651a().mo33507h5()) {
            int i2 = (zM157752b && TEnum.equals(p2b0.m167133h().m167139g("vip"), "svip")) ? 1 : 0;
            if (first == Privilege.vip_unlimited_likes && CoreModule.m29935P().m94651a().mo33353Kj()) {
                PurchaseDialogConfigs purchaseDialogConfigsM30588I4 = CoreModule.f17545c.f19654j0.m30588I4();
                PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowType = PurchaseDialogConfigTriggerShowType.get("unknown_");
                if (purchaseDialogConfigsM30588I4 != null && (leftSwipeLimitConfig = purchaseDialogConfigsM30588I4.sceneTriggerDialog) != null) {
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
            m53384D0(act, from, first, purchaseType, onSuccess, i, onDismiss, onCancel, null, null, false, false, 3840, null);
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33442Xi() && !TextUtils.equals(from, "p_privileges_view,e_buy_privilege_button,click") && !TextUtils.equals(from, "p_privileges_view,e_ttc_renew_membership_click,click") && !TextUtils.equals(from, "p_privileges_view,e_ttc_subcription_privilege_description,click") && !TextUtils.equals(from, wek0.f185947a) && !TextUtils.equals(from, "p_navigation_view,e_intl_me_subscription_card,click")) {
            PurchaseDialogConfigTriggerShowType purchaseDialogConfigTriggerShowTypeM167140i = p2b0.m167133h().m167140i("vip", from);
            if (TEnum.equals(purchaseDialogConfigTriggerShowTypeM167140i, PurchaseDialogConfigTriggerShowType.vip_svip)) {
                m53384D0(act, from, first, purchaseType, onSuccess, TEnum.equals(p2b0.m167133h().m167139g("vip"), "svip") ? 1 : 0, onDismiss, onCancel, null, null, false, false, 3840, null);
                return;
            } else if (TEnum.equals(purchaseDialogConfigTriggerShowTypeM167140i, "svip")) {
                m53384D0(act, from, first, null, onSuccess, -1, onDismiss, onCancel, null, null, false, false, 3840, null);
                return;
            }
        }
        if (act != null) {
            C8764c c8764c = INSTANCE;
            ArrayList arrayListM200324f0 = vwb.m200324f0(purchaseType);
            arrayListM200324f0.getClass();
            m53470l1(c8764c, act, arrayListM200324f0, CollectionsKt.arrayListOf(first == null ? Privilege.vip_badge : first), from, onSuccess, onDismiss, onCancel, 0, false, false, null, WBConstants.SDK_NEW_PAY_VERSION, null);
        }
    }

    /* JADX INFO: renamed from: O1 */
    public static /* synthetic */ void m53418O1(Act act, String str, Privilege privilege, d30 d30Var, d30 d30Var2, boolean z, User user, Object obj, e30 e30Var, int i, Object obj2) {
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
        m53415N1(act, str, privilege, d30Var, d30Var2, z, user, obj, (i & 256) != 0 ? null : e30Var);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: P0 */
    public static final void m53420P0(@Nullable Act act, @Nullable String str) {
        m53426S0(act, str, null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: Q */
    public static void m53421Q(Act act, final e30 e30Var, final PurchaseType purchaseType, Act act2, String str) {
        C22306c c22306cDuringCreated;
        C22306c c22306cDelaySubscription;
        purchaseType.getClass();
        lsi0.m151593w(R$string.f27420d7);
        if (act == null || (c22306cDuringCreated = act.duringCreated(new v9j() { // from class: l.o4b0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C8764c.m53467k0();
            }
        })) == null || (c22306cDelaySubscription = c22306cDuringCreated.delaySubscription(1L, TimeUnit.SECONDS)) == null) {
            return;
        }
        c22306cDelaySubscription.subscribe(mkd0.m154956H(new e30() { // from class: l.p4b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53469l0(e30Var, purchaseType, (List) obj);
            }
        }, new e30() { // from class: l.q4b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53472m0((Throwable) obj);
            }
        }));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: Q0 */
    public static final void m53422Q0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege) {
        m53426S0(act, str, privilege, null, null, null, null, 120, null);
    }

    /* JADX INFO: renamed from: R */
    public static void m53423R() {
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: R0 */
    public static final void m53424R0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_YOUTH_VIP;
        List<wx80> listM123720p = fy80.m123720p(purchaseType, purchaseType.getPrivilegeData(CoreModule.f17545c.f19639e0.m169527p9().gender), firstPrivilege);
        if (act != null) {
            C8764c c8764c = INSTANCE;
            if (!c8764c.m53511V0()) {
                new C8778c.a(act, purchaseType, from).m54094g(listM123720p).m54092e(new g30() { // from class: l.x3b0
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        C8764c.m53430U0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m54090c(onDismiss).m54091d(onCancel).m54093f(onCancel).m54089b(onClose).m54095h();
                return;
            }
            ArrayList arrayListM200324f0 = vwb.m200324f0(purchaseType);
            arrayListM200324f0.getClass();
            if (firstPrivilege == null) {
                firstPrivilege = Privilege.youth_roaming;
            }
            m53510z1(c8764c, act, arrayListM200324f0, CollectionsKt.arrayListOf(firstPrivilege), from, new e30() { // from class: l.w3b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8764c.m53428T0(afterPaySuccess, (PurchaseType) obj);
                }
            }, onDismiss, onCancel, null, 0, 384, null);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m53426S0(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
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
        m53424R0(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: T */
    public static final void m53427T(@Nullable Act act) {
        m53433X(act, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: T0 */
    public static final void m53428T0(e30 e30Var, PurchaseType purchaseType) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
        lsi0.m151595y("购买成功，立刻体验专属权益吧");
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: U */
    public static final void m53429U(@Nullable Act act, @Nullable String str) {
        m53433X(act, str, null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m53430U0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        lsi0.m151595y("购买成功，立刻体验专属权益吧");
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: V */
    public static final void m53431V(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege) {
        m53433X(act, str, privilege, null, null, null, null, 120, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: W */
    public static final void m53432W(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_FEMALE_VIP;
        List<wx80> listM123720p = fy80.m123720p(purchaseType, purchaseType.getPrivilegeData(CoreModule.f17545c.f19639e0.m169527p9().gender), firstPrivilege);
        if (act != null) {
            C8764c c8764c = INSTANCE;
            if (!c8764c.m53511V0() || TextUtils.equals(from, "p_home,femalevip_icon")) {
                new C8778c.a(act, purchaseType, from).m54094g(listM123720p).m54092e(new g30() { // from class: l.b4b0
                    @Override // p149l.g30
                    /* JADX INFO: renamed from: a */
                    public final void mo36055a(Object obj, Object obj2, Object obj3) {
                        C8764c.m53435Y(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                    }
                }).m54090c(onDismiss).m54091d(onCancel).m54093f(onCancel).m54089b(onClose).m54095h();
                return;
            }
            ArrayList arrayListM200324f0 = vwb.m200324f0(purchaseType);
            arrayListM200324f0.getClass();
            if (firstPrivilege == null) {
                firstPrivilege = Privilege.pick_tantan_credits_users;
            }
            m53510z1(c8764c, act, arrayListM200324f0, CollectionsKt.arrayListOf(firstPrivilege), from, afterPaySuccess, onDismiss, onCancel, null, 0, 384, null);
        }
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m53433X(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
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
        m53432W(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: X0 */
    public static final void m53434X0(@Nullable Act act, @NotNull String membershipType, int contractIntervalDays, @NotNull String from) {
        membershipType.getClass();
        from.getClass();
        if (act == null) {
            return;
        }
        String strM105898a = c9p.m105898a(contractIntervalDays);
        switch (membershipType.hashCode()) {
            case -318452137:
                if (membershipType.equals("premium")) {
                    kwo.m147620o(act, CollectionsKt.mutableListOf(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE), kwo.m147622q(), from, null, null, null, 0, strM105898a, false, false, 1536, null);
                    break;
                }
                break;
            case 113747:
                if (membershipType.equals("see")) {
                    m53388E1(act, "p_navigation_view,e_intl_renew_guiding_banner,click", null, null, null, 28, null);
                    break;
                }
                break;
            case 116765:
                if (membershipType.equals("vip")) {
                    C8764c c8764c = INSTANCE;
                    ArrayList arrayListM200324f0 = vwb.m200324f0(PurchaseType.TYPE_GET_VIP);
                    arrayListM200324f0.getClass();
                    m53470l1(c8764c, act, arrayListM200324f0, CollectionsKt.arrayListOf(Privilege.vip_badge), from, null, null, null, 0, false, false, strM105898a, 1008, null);
                    break;
                }
                break;
            case 111384492:
                if (membershipType.equals("ultra")) {
                    C8764c c8764c2 = INSTANCE;
                    ArrayList arrayListM200324f1 = vwb.m200324f0(PurchaseType.TYPE_ULTRA_PREMIUM);
                    arrayListM200324f1.getClass();
                    m53470l1(c8764c2, act, arrayListM200324f1, CollectionsKt.arrayListOf(Privilege.ultra_premium_badge), from, null, null, null, 0, false, false, strM105898a, 1008, null);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m53435Y(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m53436Y0(Act act, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = "p_navigation_view,e_intl_renew_guiding_banner,click";
        }
        m53434X0(act, str, i, str2);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: Z */
    public static final void m53437Z(@Nullable Act act, @Nullable String str) {
        m53441b0(act, str, null, null, null, null, 60, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m53438a(ArrayList arrayList, Privilege privilege) {
        if (privilege != null) {
            arrayList.add(privilege);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: a0 */
    public static final void m53439a0(@Nullable Act act, @Nullable String from, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable Privilege firstPrivilege) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND;
        ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
        privilegeData.getClass();
        new C8761b.d(act).m53331m(purchaseType, firstPrivilege).m53329k(fy80.m123713i(privilegeData, firstPrivilege)).m53326h(new g30() { // from class: l.y3b0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                C8764c.m53374A(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m53322d(from).m53324f(onDismiss).m53325g(onCancel).m53327i(onCancel).m53334p();
    }

    /* JADX INFO: renamed from: b */
    public static void m53440b(e30 e30Var) {
        CoreModule.f17545c.f19658k1.m184468H3();
        if (e30Var != null) {
            e30Var.call(PurchaseType.TYPE_PICKS);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m53441b0(Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, Privilege privilege, int i, Object obj) {
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
        m53439a0(act, str, e30Var, d30Var, d30Var2, privilege);
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [T, com.p1.mobile.putong.core.ui.purchase.mediator.c] */
    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: b1 */
    public static final void m53442b1(@NotNull Act act, @NotNull String from, @Nullable final d30 onDismiss, @Nullable d30 onClose, @Nullable final e30<PurchaseType> afterPaySuccess) {
        act.getClass();
        from.getClass();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new C8778c.a(act, PurchaseType.TYPE_GET_ACCELERATE_PAIRING, from).m54094g(vwb.m200324f0(new wx80())).m54092e(new g30() { // from class: l.h4b0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                C8764c.m53489s(afterPaySuccess, objectRef, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m54089b(onClose).m54090c(new d30() { // from class: l.i4b0
            @Override // p149l.d30
            public final void call() {
                C8764c.m53443c(onDismiss, objectRef);
            }
        }).m54091d(new d30() { // from class: l.j4b0
            @Override // p149l.d30
            public final void call() {
                C8764c.m53423R();
            }
        }).m54093f(new d30() { // from class: l.l4b0
            @Override // p149l.d30
            public final void call() {
                C8764c.m53495u();
            }
        }).m54095h();
    }

    /* JADX INFO: renamed from: c */
    public static void m53443c(d30 d30Var, Ref.ObjectRef objectRef) {
        if (d30Var != null) {
            d30Var.call();
        }
        objectRef.element = null;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c0 */
    public static final void m53444c0(@Nullable Act act, @Nullable String str) {
        m53450e0(act, str, null, null, null, null, null, 124, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: c1 */
    public static final void m53445c1(@Nullable Act act, @Nullable String str) {
        m53451e1(act, str, null, 4, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d0 */
    public static final void m53447d0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_DIAMOND_PRIVATE_CUSTOM;
        List<wx80> listM123720p = fy80.m123720p(purchaseType, purchaseType.getPrivilegeData(CoreModule.f17545c.f19639e0.m169527p9().gender), firstPrivilege);
        if (act != null) {
            new C8778c.a(act, purchaseType, from).m54094g(listM123720p).m54092e(new g30() { // from class: l.v3b0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    C8764c.m53453f0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m54090c(onDismiss).m54091d(onCancel).m54093f(onCancel).m54089b(onClose).m54095h();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: d1 */
    public static final void m53448d1(@Nullable final Act act, @Nullable final String from, @Nullable final e30<PurchaseType> afterPaySuccess) {
        C22306c c22306cDuringCreated;
        if (CoreModule.m29935P().m94651a().mo33507h5() && swh0.m186269v() && !xma.m210047L3()) {
            m53384D0(act, from, Privilege.boost, null, afterPaySuccess, 0, null, null, null, null, false, false, 4072, null);
            return;
        }
        ProductCategory productCategory = ProductCategory.get(ProductCategory.tttBoost);
        if (act == null || (c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19654j0.m30646z5(productCategory, false).take(1).observeOn(jo0.m142408a()))) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.u4b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53483q(act, from, afterPaySuccess, (List) obj);
            }
        }, new e30() { // from class: l.w4b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53455g(act, from, afterPaySuccess, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e */
    public static void m53449e(final e30 e30Var, Act act, String str, List list) {
        if (list.isEmpty()) {
            return;
        }
        g30<PurchaseType, Act, String> g30Var = e30Var != null ? new g30() { // from class: l.a5b0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                C8764c.m53465j1(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        } : null;
        o6n.Companion c18856b = o6n.INSTANCE;
        act.getClass();
        if (str == null) {
            str = "";
        }
        c18856b.m162916a(act, str, g30Var, null);
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m53450e0(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
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
        m53447d0(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m53451e1(Act act, String str, e30 e30Var, int i, Object obj) {
        if ((i & 4) != 0) {
            e30Var = null;
        }
        m53448d1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m53453f0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public static final void m53454f1(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        e30Var.call(purchaseType);
    }

    /* JADX INFO: renamed from: g */
    public static void m53455g(Act act, String str, e30 e30Var, Throwable th) {
        swh0.m186247m1(act, str, e30Var);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: g1 */
    public static final void m53456g1(@Nullable Act act, @Nullable String str) {
        m53462i1(act, str, null, 4, null);
    }

    /* JADX INFO: renamed from: h0 */
    public static final C22306c m53458h0() {
        return CoreModule.f17545c.f19555C0.m210112u4();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: h1 */
    public static final void m53459h1(@Nullable final Act act, @Nullable final String from, @Nullable final e30<PurchaseType> afterPaySuccess) {
        C22306c c22306cDuringCreated;
        ProductCategory productCategory = ProductCategory.get(ProductCategory.tttCompliment);
        if (act == null || (c22306cDuringCreated = act.duringCreated(CoreModule.f17545c.f19654j0.m30646z5(productCategory, false).take(1).observeOn(jo0.m142408a()))) == null) {
            return;
        }
        c22306cDuringCreated.subscribe(mkd0.m154956H(new e30() { // from class: l.x4b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53449e(afterPaySuccess, act, from, (List) obj);
            }
        }, new e30() { // from class: l.y4b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53389F((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public static void m53460i(Act act, String str, g30 g30Var, List list) {
        if (list.isEmpty()) {
            swh0.m186277x1(act, str, g30Var);
            return;
        }
        kdp.Companion c17986b = kdp.INSTANCE;
        act.getClass();
        if (str == null) {
            str = "";
        }
        c17986b.m145677a(act, str, g30Var, null);
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m53461i0(e30 e30Var, PurchaseType purchaseType, List list) {
        if (CoreModule.m29935P().m94651a().mo33468b3() <= 0 || e30Var == null) {
            return;
        }
        e30Var.call(purchaseType);
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ void m53462i1(Act act, String str, e30 e30Var, int i, Object obj) {
        if ((i & 4) != 0) {
            e30Var = null;
        }
        m53459h1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m53464j0(Throwable th) {
    }

    /* JADX INFO: renamed from: j1 */
    public static final void m53465j1(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        e30Var.call(purchaseType);
    }

    /* JADX INFO: renamed from: k */
    public static void m53466k(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final C22306c m53467k0() {
        return CoreModule.f17545c.f19555C0.m210112u4();
    }

    /* JADX INFO: renamed from: l */
    public static void m53468l(d30 d30Var, PurchaseType purchaseType) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m53469l0(e30 e30Var, PurchaseType purchaseType, List list) {
        if (CoreModule.m29935P().m94651a().mo33468b3() <= 0 || e30Var == null) {
            return;
        }
        e30Var.call(purchaseType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public static /* synthetic */ void m53470l1(C8764c c8764c, Act act, List list, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, int i, boolean z, boolean z2, String str2, int i2, Object obj) {
        c8764c.m53516k1(act, list, arrayList, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? null : e30Var, (i2 & 32) != 0 ? null : d30Var, (i2 & 64) != 0 ? null : d30Var2, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? null : str2);
    }

    /* JADX INFO: renamed from: m0 */
    public static final void m53472m0(Throwable th) {
    }

    /* JADX INFO: renamed from: m1 */
    public static final void m53473m1(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n0 */
    public static final void m53475n0(@Nullable Act act, @Nullable String str) {
        m53481p0(act, str, null, null, null, null, null, 124, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: n1 */
    public static final void m53476n1(@Nullable Act act, @NotNull String from, @Nullable Privilege first) {
        from.getClass();
        m53418O1(act, from, first, null, null, false, null, null, null, HttpStatus.GATEWAY_TIMEOUT_504, null);
    }

    /* JADX INFO: renamed from: o */
    public static void m53477o(Act act, final e30 e30Var, final PurchaseType purchaseType, Act act2, String str) {
        C22306c c22306cDuringCreated;
        C22306c c22306cDelaySubscription;
        purchaseType.getClass();
        if (act == null || (c22306cDuringCreated = act.duringCreated(new v9j() { // from class: l.r4b0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C8764c.m53458h0();
            }
        })) == null || (c22306cDelaySubscription = c22306cDuringCreated.delaySubscription(1L, TimeUnit.SECONDS)) == null) {
            return;
        }
        c22306cDelaySubscription.subscribe(mkd0.m154956H(new e30() { // from class: l.s4b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53461i0(e30Var, purchaseType, (List) obj);
            }
        }, new e30() { // from class: l.t4b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8764c.m53464j0((Throwable) obj);
            }
        }));
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: o0 */
    public static final void m53478o0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_O_PLATINUM;
        List<wx80> listM123715k = fy80.m123715k(purchaseType.getPrivilegeData(null), firstPrivilege);
        if (act != null) {
            new C8778c.a(act, purchaseType, from).m54094g(listM123715k).m54092e(new g30() { // from class: l.e4b0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    C8764c.m53484q0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m54090c(onDismiss).m54091d(onCancel).m54093f(onCancel).m54089b(onClose).m54095h();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: o1 */
    public static final void m53479o1(@Nullable Act act, @Nullable e30<PurchaseType> e30Var, @Nullable PurchaseType purchaseType, @Nullable String str) {
        m53485q1(act, e30Var, purchaseType, str, null, 16, null);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m53481p0(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
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
        m53478o0(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: p1 */
    public static final void m53482p1(@Nullable Act act, @Nullable e30<PurchaseType> afterPaySuccess, @Nullable PurchaseType purchaseType, @Nullable String from, @Nullable String other) {
        if (purchaseType == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS && CoreModule.m29935P().m94651a().mo33507h5()) {
            m53384D0(act, from, purchaseType.getPrivilegeData(CoreModule.f17545c.f19639e0.m169527p9().gender).get(0), null, afterPaySuccess, 0, null, null, other, null, false, false, 3816, null);
        } else {
            INSTANCE.m53515g0(act, afterPaySuccess, purchaseType, from, other);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m53483q(Act act, String str, final e30 e30Var, List list) {
        if (list.isEmpty()) {
            swh0.m186247m1(act, str, e30Var);
            return;
        }
        g30<PurchaseType, Act, String> g30Var = e30Var != null ? new g30() { // from class: l.z4b0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                C8764c.m53454f1(e30Var, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        } : null;
        y2n.Companion c21288b = y2n.INSTANCE;
        act.getClass();
        if (str == null) {
            str = "";
        }
        c21288b.m212424a(act, str, g30Var, null);
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m53484q0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: q1 */
    public static /* synthetic */ void m53485q1(Act act, e30 e30Var, PurchaseType purchaseType, String str, String str2, int i, Object obj) {
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
        m53482p1(act, e30Var, purchaseType, str, str2);
    }

    /* JADX INFO: renamed from: r */
    public static Unit m53486r(boolean z, Function0 function0, boolean z2, List list, String str, Function0 function1) {
        if (z && CoreModule.f17545c.f19696x0.m30186N3()) {
            function0.invoke();
        } else if (!z2 && INSTANCE.m53514a1(list, str)) {
            function0.invoke();
        } else if (z2 || !INSTANCE.m53513Z0(list, str)) {
            function1.invoke();
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r0 */
    public static final void m53487r0(@Nullable Act act, @Nullable String str) {
        m53493t0(act, str, null, null, null, null, null, 124, null);
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: r1 */
    public static final void m53488r1(@Nullable Act act, @Nullable String str) {
        m53494t1(act, str, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public static void m53489s(e30 e30Var, Ref.ObjectRef objectRef, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        CoreModule.f17545c.f19555C0.m210115x4();
        lsi0.m151595y("购买成功");
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
        C8778c c8778c = (C8778c) objectRef.element;
        if (c8778c != null) {
            c8778c.m54078q();
        }
        objectRef.element = null;
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s0 */
    public static final void m53490s0(@Nullable Act act, @Nullable String from, @Nullable Privilege firstPrivilege, @Nullable final e30<PurchaseType> afterPaySuccess, @Nullable d30 onDismiss, @Nullable d30 onCancel, @Nullable d30 onClose) {
        PurchaseType purchaseType = PurchaseType.TYPE_PRIVATE_CUSTOM;
        List<wx80> listM123720p = fy80.m123720p(purchaseType, purchaseType.getPrivilegeData(CoreModule.f17545c.f19639e0.m169527p9().gender), firstPrivilege);
        if (act != null) {
            new C8778c.a(act, purchaseType, from).m54094g(listM123720p).m54092e(new g30() { // from class: l.a4b0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    C8764c.m53496u0(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m54090c(onDismiss).m54091d(onCancel).m54093f(onCancel).m54089b(onClose).m54095h();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: s1 */
    public static final void m53491s1(@Nullable Act act, @Nullable String from, @Nullable final e30<PurchaseType> picksMembershipPaySuccess) {
        if (xma.m210044G3() && CoreModule.m29935P().m94651a().mo33529k()) {
            if (CoreModule.f17545c.f19658k1.f164821V) {
                return;
            }
            CoreBusinessService coreBusinessServiceM94651a = CoreModule.m29935P().m94651a();
            act.getClass();
            coreBusinessServiceM94651a.mo33558op(act, new d30() { // from class: l.c4b0
                @Override // p149l.d30
                public final void call() {
                    C8764c.m53440b(picksMembershipPaySuccess);
                }
            });
            return;
        }
        if (xma.m210044G3()) {
            if (xma.m210071e4()) {
                m53384D0(act, from, null, null, null, 0, null, null, null, null, false, false, 4092, null);
            }
        } else if (xma.m210047L3() || Intrinsics.m87488d("p_picks_view_membership,e_card,like_swipe", from) || Intrinsics.m87488d("p_picks_view_membership,unlock,click", from)) {
            m53441b0(act, from, picksMembershipPaySuccess, null, null, Privilege.picksMembership, 24, null);
        } else {
            m53505x1(INSTANCE, act, from, picksMembershipPaySuccess, null, null, 24, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m53492t(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m53493t0(Act act, String str, Privilege privilege, e30 e30Var, d30 d30Var, d30 d30Var2, d30 d30Var3, int i, Object obj) {
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
        m53490s0(act, str, privilege, e30Var, d30Var, d30Var2, (i & 64) != 0 ? null : d30Var3);
    }

    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ void m53494t1(Act act, String str, e30 e30Var, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            e30Var = null;
        }
        m53491s1(act, str, e30Var);
    }

    /* JADX INFO: renamed from: u */
    public static void m53495u() {
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m53496u0(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: u1 */
    public static final void m53497u1(@Nullable Act act, @Nullable String from, @Nullable final e30<PurchaseType> picksMembershipPaySuccess) {
        PurchaseType purchaseType = xma.m210071e4() ? PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP : PurchaseType.TYPE_PICKS_MEMBERSHIP;
        ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
        privilegeData.getClass();
        List<wx80> listM123714j = fy80.m123714j(privilegeData, Privilege.picksMembership);
        for (wx80 wx80Var : listM123714j) {
            wx80Var.m205943a0("每天定制推荐优质婚恋用户，助你早日脱单");
            wx80Var.m205922G("每天定制推荐优质婚恋用户，助你早日脱单");
        }
        if (act != null) {
            new C8778c.a(act, purchaseType, from).m54088a(Privilege.picksMembership).m54094g(listM123714j).m54092e(new g30() { // from class: l.t3b0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    C8764c.m53500v1(picksMembershipPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m54095h();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m53498v(Function0 function0, Throwable th) {
        function0.invoke();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: v0 */
    public static final void m53499v0(@Nullable Act act) {
        m53384D0(act, null, null, null, null, 0, null, null, null, null, false, false, 4094, null);
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m53500v1(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        purchaseType.getClass();
        act.getClass();
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m53501w(Function0 function0, List list) {
        function0.invoke();
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: w0 */
    public static final void m53502w0(@Nullable Act act, @Nullable String str) {
        m53384D0(act, str, null, null, null, 0, null, null, null, null, false, false, 4092, null);
    }

    /* JADX INFO: renamed from: x */
    public static void m53503x(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: x0 */
    public static final void m53504x0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege) {
        m53384D0(act, str, privilege, null, null, 0, null, null, null, null, false, false, 4088, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ void m53505x1(C8764c c8764c, Act act, String str, e30 e30Var, d30 d30Var, d30 d30Var2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c8764c.m53517w1(act, str, (i & 4) != 0 ? null : e30Var, (i & 8) != 0 ? null : d30Var, (i & 16) != 0 ? null : d30Var2);
    }

    /* JADX INFO: renamed from: y */
    public static void m53506y(d30 d30Var, PurchaseType purchaseType) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: y0 */
    public static final void m53507y0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable e30<PurchaseType> e30Var) {
        m53384D0(act, str, privilege, purchaseType, e30Var, 0, null, null, null, null, false, false, 4064, null);
    }

    /* JADX INFO: renamed from: z */
    public static void m53508z(e30 e30Var, PurchaseType purchaseType, Act act, String str) {
        if (e30Var != null) {
            e30Var.call(purchaseType);
        }
    }

    @JvmStatic
    @JvmOverloads
    /* JADX INFO: renamed from: z0 */
    public static final void m53509z0(@Nullable Act act, @Nullable String str, @Nullable Privilege privilege, @Nullable PurchaseType purchaseType, @Nullable e30<PurchaseType> e30Var, int i) {
        m53384D0(act, str, privilege, purchaseType, e30Var, i, null, null, null, null, false, false, 4032, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z1 */
    public static /* synthetic */ void m53510z1(C8764c c8764c, Act act, List list, ArrayList arrayList, String str, e30 e30Var, d30 d30Var, d30 d30Var2, String str2, int i, int i2, Object obj) {
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
        c8764c.m53518y1(act, list, arrayList, str, e30Var, d30Var, d30Var2, str2, i);
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m53511V0() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return userM169527p9 != null && qqi0.m175940h(mqi0.m155944o(), (long) userM169527p9.createdTime, 1);
    }

    /* JADX INFO: renamed from: W0 */
    public final boolean m53512W0(String from) {
        if (from == null || from.length() == 0) {
            return false;
        }
        return TextUtils.equals(from, "p_privileges_view,e_buy_privilege_button,click") || TextUtils.equals(from, "p_privileges_view,e_ttc_subcription_privilege_description,click") || TextUtils.equals(from, "p_privileges_view,e_whisper_unlock_btn_click,click");
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m53513Z0(List<? extends PurchaseType> purchaseTypeList, String from) {
        if (CoreModule.f17545c.f19696x0.m30188P3() && !CoreModule.f17545c.f19696x0.m30195c4() && purchaseTypeList.contains(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE)) {
            return m53512W0(from);
        }
        return false;
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m53514a1(List<? extends PurchaseType> purchaseTypeList, String from) {
        return CoreModule.f17545c.f19696x0.m30188P3() && CoreModule.f17545c.f19696x0.m30195c4() && purchaseTypeList.contains(PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) && !TextUtils.equals(from, "p_navigation_view,e_intl_me_subscription_card,click") && !TextUtils.equals(from, "p_suggest_users_home_view,e_premium_promo_50off_card,click");
    }

    /* JADX INFO: renamed from: g0 */
    public final void m53515g0(final Act act, final e30<PurchaseType> afterPaySuccess, PurchaseType purchaseType, String from, String other) {
        g30 g30Var = new g30() { // from class: l.f4b0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                C8764c.m53477o(act, afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        };
        if (sab0.m182894l(purchaseType)) {
            swh0.m186268u1(act, from, g30Var, null);
        } else {
            new C8761b.d(act).m53330l(purchaseType).m53322d(from).m53328j(other).m53326h(new g30() { // from class: l.g4b0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    C8764c.m53421Q(act, afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
                }
            }).m53334p();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m53516k1(final Act act, final List<PurchaseType> purchaseTypeList, final ArrayList<Privilege> primaryPrivileges, final String from, final e30<PurchaseType> afterPaySuccess, final d30 onDismiss, final d30 onCancel, final int selectedIdx, final boolean forceStandardPage, final boolean forcePromoFullscreen, final String defaultSkuDuration) {
        final Function0 function0 = new Function0() { // from class: l.o3b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8764c.m53401J(act, purchaseTypeList, primaryPrivileges, from, selectedIdx, onDismiss, onCancel, defaultSkuDuration, afterPaySuccess);
            }
        };
        final Function0 function1 = new Function0() { // from class: l.z3b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8764c.m53398I(act, primaryPrivileges, from, afterPaySuccess, onDismiss, onCancel, defaultSkuDuration);
            }
        };
        final Function0 function2 = new Function0() { // from class: l.k4b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C8764c.m53486r(forcePromoFullscreen, function1, forceStandardPage, purchaseTypeList, from, function0);
            }
        };
        if (purchaseTypeList.size() != 1 || purchaseTypeList.get(0) != PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            function2.invoke();
        } else if (CoreModule.f17545c.f19696x0.m30186N3()) {
            function2.invoke();
        } else {
            act.duringCreated(CoreModule.f17545c.f19696x0.m30224w4()).subscribe(mkd0.m154956H(new e30() { // from class: l.v4b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8764c.m53501w(function2, (List) obj);
                }
            }, new e30() { // from class: l.b5b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    C8764c.m53498v(function2, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m53517w1(Act act, String from, final e30<PurchaseType> afterPaySuccess, d30 onDismiss, d30 onCancel) {
        PurchaseType purchaseType = xma.m210071e4() ? PurchaseType.TYPE_SVIP_PICKS_MEMBERSHIP : PurchaseType.TYPE_PICKS_MEMBERSHIP;
        ArrayList<Privilege> privilegeData = purchaseType.getPrivilegeData(null);
        privilegeData.getClass();
        Privilege privilege = Privilege.picksMembership;
        new C8761b.d(act).m53331m(purchaseType, privilege).m53329k(fy80.m123714j(privilegeData, privilege)).m53326h(new g30() { // from class: l.m4b0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                C8764c.m53386E(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m53322d(from).m53324f(onDismiss).m53325g(onCancel).m53327i(onCancel).m53334p();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m53518y1(Act act, List<PurchaseType> purchaseTypeList, ArrayList<Privilege> primaryPrivileges, String from, final e30<PurchaseType> afterPaySuccess, d30 onDismiss, d30 onCancel, String pushUser, int selectedIdx) {
        new r5b0.C19640a(act).m177924h(purchaseTypeList, primaryPrivileges).m177918b(from).m177923g(pushUser).m177922f(new g30() { // from class: l.d4b0
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                C8764c.m53492t(afterPaySuccess, (PurchaseType) obj, (Act) obj2, (String) obj3);
            }
        }).m177925i(selectedIdx).m177920d(onDismiss).m177921e(onCancel).m177919c(onCancel).m177926j();
    }
}
