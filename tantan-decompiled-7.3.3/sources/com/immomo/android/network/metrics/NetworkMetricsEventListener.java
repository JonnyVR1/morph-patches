package com.immomo.android.network.metrics;

import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.tencent.open.SocialConstants;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bx5;
import p153l.i5d0;
import p153l.ok20;
import p153l.ry3;
import p153l.t4f;
import p153l.txk;
import p153l.x1d0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fJ!\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J1\u0010$\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J9\u0010(\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\fJ\u001f\u00101\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\fJ\u001f\u00106\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u0010\fJ\u001f\u0010;\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\fJ\u001f\u0010>\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b>\u00107J\u0017\u0010?\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010\fJ\u001f\u0010@\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, m88121d2 = {"Lcom/immomo/android/network/metrics/NetworkMetricsEventListener;", "Ll/t4f;", "Ll/t4f$b;", "otherFactory", "", "eventListeners", "<init>", "(Ll/t4f$b;Ljava/util/List;)V", "Ll/ry3;", "call", "", "h", "(Ll/ry3;)V", "callStart", "", "domainName", "dnsStart", "(Ll/ry3;Ljava/lang/String;)V", "", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Ll/ry3;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "connectStart", "(Ll/ry3;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Ll/txk;", "handshake", "secureConnectEnd", "(Ll/ry3;Ll/txk;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Ll/ry3;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Ll/ry3;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Ll/bx5;", "connection", "connectionAcquired", "(Ll/ry3;Ll/bx5;)V", "requestHeadersStart", "Ll/x1d0;", SocialConstants.TYPE_REQUEST, "requestHeadersEnd", "(Ll/ry3;Ll/x1d0;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Ll/ry3;J)V", "responseHeadersStart", "Ll/i5d0;", "response", "responseHeadersEnd", "(Ll/ry3;Ll/i5d0;)V", "responseBodyStart", "responseBodyEnd", "callEnd", "callFailed", "(Ll/ry3;Ljava/io/IOException;)V", "a", "Ll/t4f;", "factoryEventListener", "Lcom/immomo/android/network/metrics/NetworkTrackInfo;", "b", "Lcom/immomo/android/network/metrics/NetworkTrackInfo;", "networkTrackInfo", "c", "Ll/t4f$b;", "g", "()Ll/t4f$b;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "f", "()Ljava/util/List;", "sdk_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class NetworkMetricsEventListener extends t4f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private t4f factoryEventListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final NetworkTrackInfo networkTrackInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final t4f.InterfaceC20235b otherFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<t4f> eventListeners;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkMetricsEventListener(@Nullable t4f.InterfaceC20235b interfaceC20235b, @NotNull List<? extends t4f> list) {
        list.getClass();
        this.otherFactory = interfaceC20235b;
        this.eventListeners = list;
        this.networkTrackInfo = new NetworkTrackInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m19247h(ry3 call) {
        this.networkTrackInfo.m19272H(SystemClock.elapsedRealtime());
        this.networkTrackInfo.m19289Y(call);
    }

    @Override // p153l.t4f
    public void callEnd(@NotNull final ry3 call) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.callEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().callEnd(call);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.callEnd(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19308x(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.m19247h(call);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void callFailed(@NotNull final ry3 call, @NotNull final IOException ioe) {
        call.getClass();
        ioe.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.callFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().callFailed(call, ioe);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.callFailed(call, ioe);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m19308x(SystemClock.elapsedRealtime());
                networkTrackInfo.m19288X(ioe);
                NetworkMetricsEventListener.this.m19247h(call);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void callStart(@NotNull final ry3 call) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.callStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (NetworkMetricsEventListener.this.getOtherFactory() != null) {
                    NetworkMetricsEventListener networkMetricsEventListener = NetworkMetricsEventListener.this;
                    networkMetricsEventListener.factoryEventListener = networkMetricsEventListener.getOtherFactory().create(call);
                }
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().callStart(call);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.callStart(call);
                }
                call.request().m209025j(NetworkTrackInfo.class);
                NetworkMetricsEventListener.this.networkTrackInfo.m19269E(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.networkTrackInfo.m19279O(System.currentTimeMillis());
                NetworkMetricsEventListener.this.networkTrackInfo.m19274J(call.request());
                NetworkMetricsEventListener.this.networkTrackInfo.m19309y(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void connectEnd(@NotNull final ry3 call, @NotNull final InetSocketAddress inetSocketAddress, @NotNull final Proxy proxy, @Nullable final Protocol protocol) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.connectEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().connectEnd(call, inetSocketAddress, proxy, protocol);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.connectEnd(call, inetSocketAddress, proxy, protocol);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19310z(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void connectFailed(@NotNull final ry3 call, @NotNull final InetSocketAddress inetSocketAddress, @NotNull final Proxy proxy, @Nullable final Protocol protocol, @NotNull final IOException ioe) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        ioe.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.connectFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().connectFailed(call, inetSocketAddress, proxy, protocol, ioe);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.connectFailed(call, inetSocketAddress, proxy, protocol, ioe);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19310z(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.networkTrackInfo.m19288X(ioe);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void connectStart(@NotNull final ry3 call, @NotNull final InetSocketAddress inetSocketAddress, @NotNull final Proxy proxy) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.connectStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().connectStart(call, inetSocketAddress, proxy);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.connectStart(call, inetSocketAddress, proxy);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m19266B(SystemClock.elapsedRealtime());
                networkTrackInfo.m19273I(inetSocketAddress);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void connectionAcquired(@NotNull final ry3 call, @NotNull final bx5 connection) {
        call.getClass();
        connection.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.connectionAcquired.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().connectionAcquired(call, connection);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.connectionAcquired(call, connection);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m19267C(connection);
                networkTrackInfo.m19268D(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void dnsEnd(@NotNull final ry3 call, @NotNull final String domainName, @NotNull final List<InetAddress> inetAddressList) {
        call.getClass();
        domainName.getClass();
        inetAddressList.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.dnsEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().dnsEnd(call, domainName, inetAddressList);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.dnsEnd(call, domainName, inetAddressList);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m19270F(SystemClock.elapsedRealtime());
                StringBuilder sb = new StringBuilder();
                Iterator it2 = inetAddressList.iterator();
                while (it2.hasNext()) {
                    sb.append(((InetAddress) it2.next()).getHostAddress());
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                networkTrackInfo.m19265A(sb.toString());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void dnsStart(@NotNull final ry3 call, @NotNull final String domainName) {
        call.getClass();
        domainName.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.dnsStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().dnsStart(call, domainName);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.dnsStart(call, domainName);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19271G(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final List<t4f> m19248f() {
        return this.eventListeners;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final t4f.InterfaceC20235b getOtherFactory() {
        return this.otherFactory;
    }

    @Override // p153l.t4f
    public void requestBodyEnd(@NotNull final ry3 call, final long byteCount) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.requestBodyEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().requestBodyEnd(call, byteCount);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.requestBodyEnd(call, byteCount);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19275K(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void requestBodyStart(@NotNull final ry3 call) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.requestBodyStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().requestBodyStart(call);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.requestBodyStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19276L(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void requestHeadersEnd(@NotNull final ry3 call, @NotNull final x1d0 request) {
        call.getClass();
        request.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.requestHeadersEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().requestHeadersEnd(call, request);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.requestHeadersEnd(call, request);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19277M(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.networkTrackInfo.m19274J(request);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void requestHeadersStart(@NotNull final ry3 call) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.requestHeadersStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().requestHeadersStart(call);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.requestHeadersStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19278N(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void responseBodyEnd(@NotNull final ry3 call, final long byteCount) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.responseBodyEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().responseBodyEnd(call, byteCount);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.responseBodyEnd(call, byteCount);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m19282R(SystemClock.elapsedRealtime());
                networkTrackInfo.m19281Q(byteCount);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void responseBodyStart(@NotNull final ry3 call) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.responseBodyStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().responseBodyStart(call);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.responseBodyStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19283S(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void responseHeadersEnd(@NotNull final ry3 call, @NotNull final i5d0 response) {
        call.getClass();
        response.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.responseHeadersEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().responseHeadersEnd(call, response);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.responseHeadersEnd(call, response);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19284T(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.networkTrackInfo.m19280P(response);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void responseHeadersStart(@NotNull final ry3 call) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.responseHeadersStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().responseHeadersStart(call);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.responseHeadersStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19285U(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void secureConnectEnd(@NotNull final ry3 call, @Nullable final txk handshake) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.secureConnectEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().secureConnectEnd(call, handshake);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.secureConnectEnd(call, handshake);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19286V(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p153l.t4f
    public void secureConnectStart(@NotNull final ry3 call) {
        call.getClass();
        ok20.m167975a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.secureConnectStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<t4f> it = NetworkMetricsEventListener.this.m19248f().iterator();
                while (it.hasNext()) {
                    it.next().secureConnectStart(call);
                }
                t4f t4fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (t4fVar != null) {
                    t4fVar.secureConnectStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m19287W(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }
}
