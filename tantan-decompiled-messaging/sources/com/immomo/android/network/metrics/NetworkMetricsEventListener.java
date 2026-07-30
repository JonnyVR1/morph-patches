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
import p149l.dvk;
import p149l.exc0;
import p149l.fc20;
import p149l.o3f;
import p149l.stc0;
import p149l.sx3;
import p149l.wv5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fJ!\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J1\u0010$\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J9\u0010(\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b.\u0010\fJ\u001f\u00101\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\fJ\u001f\u00106\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u0010\fJ\u001f\u0010;\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010\fJ\u001f\u0010>\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b>\u00107J\u0017\u0010?\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010\fJ\u001f\u0010@\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, m87232d2 = {"Lcom/immomo/android/network/metrics/NetworkMetricsEventListener;", "Ll/o3f;", "Ll/o3f$b;", "otherFactory", "", "eventListeners", "<init>", "(Ll/o3f$b;Ljava/util/List;)V", "Ll/sx3;", "call", "", "h", "(Ll/sx3;)V", "callStart", "", "domainName", "dnsStart", "(Ll/sx3;Ljava/lang/String;)V", "", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "(Ll/sx3;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "connectStart", "(Ll/sx3;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "secureConnectStart", "Ll/dvk;", "handshake", "secureConnectEnd", "(Ll/sx3;Ll/dvk;)V", "Lokhttp3/Protocol;", "protocol", "connectEnd", "(Ll/sx3;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V", "Ljava/io/IOException;", "ioe", "connectFailed", "(Ll/sx3;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V", "Ll/wv5;", "connection", "connectionAcquired", "(Ll/sx3;Ll/wv5;)V", "requestHeadersStart", "Ll/stc0;", SocialConstants.TYPE_REQUEST, "requestHeadersEnd", "(Ll/sx3;Ll/stc0;)V", "requestBodyStart", "", "byteCount", "requestBodyEnd", "(Ll/sx3;J)V", "responseHeadersStart", "Ll/exc0;", "response", "responseHeadersEnd", "(Ll/sx3;Ll/exc0;)V", "responseBodyStart", "responseBodyEnd", "callEnd", "callFailed", "(Ll/sx3;Ljava/io/IOException;)V", "a", "Ll/o3f;", "factoryEventListener", "Lcom/immomo/android/network/metrics/NetworkTrackInfo;", "b", "Lcom/immomo/android/network/metrics/NetworkTrackInfo;", "networkTrackInfo", "c", "Ll/o3f$b;", "g", "()Ll/o3f$b;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "f", "()Ljava/util/List;", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class NetworkMetricsEventListener extends o3f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private o3f factoryEventListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final NetworkTrackInfo networkTrackInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final o3f.InterfaceC18833b otherFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final List<o3f> eventListeners;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkMetricsEventListener(@Nullable o3f.InterfaceC18833b interfaceC18833b, @NotNull List<? extends o3f> list) {
        list.getClass();
        this.otherFactory = interfaceC18833b;
        this.eventListeners = list;
        this.networkTrackInfo = new NetworkTrackInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final void m18170h(sx3 call) {
        this.networkTrackInfo.m18195H(SystemClock.elapsedRealtime());
        this.networkTrackInfo.m18212Y(call);
    }

    @Override // p149l.o3f
    public void callEnd(@NotNull final sx3 call) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.callEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().callEnd(call);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.callEnd(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18231x(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.m18170h(call);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void callFailed(@NotNull final sx3 call, @NotNull final IOException ioe) {
        call.getClass();
        ioe.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.callFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().callFailed(call, ioe);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.callFailed(call, ioe);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m18231x(SystemClock.elapsedRealtime());
                networkTrackInfo.m18211X(ioe);
                NetworkMetricsEventListener.this.m18170h(call);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void callStart(@NotNull final sx3 call) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.callStart.1
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
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().callStart(call);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.callStart(call);
                }
                call.request().m185880j(NetworkTrackInfo.class);
                NetworkMetricsEventListener.this.networkTrackInfo.m18192E(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.networkTrackInfo.m18202O(System.currentTimeMillis());
                NetworkMetricsEventListener.this.networkTrackInfo.m18197J(call.request());
                NetworkMetricsEventListener.this.networkTrackInfo.m18232y(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void connectEnd(@NotNull final sx3 call, @NotNull final InetSocketAddress inetSocketAddress, @NotNull final Proxy proxy, @Nullable final Protocol protocol) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.connectEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().connectEnd(call, inetSocketAddress, proxy, protocol);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.connectEnd(call, inetSocketAddress, proxy, protocol);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18233z(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void connectFailed(@NotNull final sx3 call, @NotNull final InetSocketAddress inetSocketAddress, @NotNull final Proxy proxy, @Nullable final Protocol protocol, @NotNull final IOException ioe) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        ioe.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.connectFailed.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().connectFailed(call, inetSocketAddress, proxy, protocol, ioe);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.connectFailed(call, inetSocketAddress, proxy, protocol, ioe);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18233z(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.networkTrackInfo.m18211X(ioe);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void connectStart(@NotNull final sx3 call, @NotNull final InetSocketAddress inetSocketAddress, @NotNull final Proxy proxy) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.connectStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().connectStart(call, inetSocketAddress, proxy);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.connectStart(call, inetSocketAddress, proxy);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m18189B(SystemClock.elapsedRealtime());
                networkTrackInfo.m18196I(inetSocketAddress);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void connectionAcquired(@NotNull final sx3 call, @NotNull final wv5 connection) {
        call.getClass();
        connection.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.connectionAcquired.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().connectionAcquired(call, connection);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.connectionAcquired(call, connection);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m18190C(connection);
                networkTrackInfo.m18191D(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void dnsEnd(@NotNull final sx3 call, @NotNull final String domainName, @NotNull final List<InetAddress> inetAddressList) {
        call.getClass();
        domainName.getClass();
        inetAddressList.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.dnsEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().dnsEnd(call, domainName, inetAddressList);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.dnsEnd(call, domainName, inetAddressList);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m18193F(SystemClock.elapsedRealtime());
                StringBuilder sb = new StringBuilder();
                Iterator it2 = inetAddressList.iterator();
                while (it2.hasNext()) {
                    sb.append(((InetAddress) it2.next()).getHostAddress());
                    sb.append(Constants.SEPARATOR_COMMA);
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                networkTrackInfo.m18188A(sb.toString());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void dnsStart(@NotNull final sx3 call, @NotNull final String domainName) {
        call.getClass();
        domainName.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.dnsStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().dnsStart(call, domainName);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.dnsStart(call, domainName);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18194G(SystemClock.elapsedRealtime());
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
    public final List<o3f> m18171f() {
        return this.eventListeners;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final o3f.InterfaceC18833b getOtherFactory() {
        return this.otherFactory;
    }

    @Override // p149l.o3f
    public void requestBodyEnd(@NotNull final sx3 call, final long byteCount) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.requestBodyEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().requestBodyEnd(call, byteCount);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.requestBodyEnd(call, byteCount);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18198K(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void requestBodyStart(@NotNull final sx3 call) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.requestBodyStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().requestBodyStart(call);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.requestBodyStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18199L(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void requestHeadersEnd(@NotNull final sx3 call, @NotNull final stc0 request) {
        call.getClass();
        request.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.requestHeadersEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().requestHeadersEnd(call, request);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.requestHeadersEnd(call, request);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18200M(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.networkTrackInfo.m18197J(request);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void requestHeadersStart(@NotNull final sx3 call) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.requestHeadersStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().requestHeadersStart(call);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.requestHeadersStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18201N(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void responseBodyEnd(@NotNull final sx3 call, final long byteCount) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.responseBodyEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().responseBodyEnd(call, byteCount);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.responseBodyEnd(call, byteCount);
                }
                NetworkTrackInfo networkTrackInfo = NetworkMetricsEventListener.this.networkTrackInfo;
                networkTrackInfo.m18205R(SystemClock.elapsedRealtime());
                networkTrackInfo.m18204Q(byteCount);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void responseBodyStart(@NotNull final sx3 call) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.responseBodyStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().responseBodyStart(call);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.responseBodyStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18206S(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void responseHeadersEnd(@NotNull final sx3 call, @NotNull final exc0 response) {
        call.getClass();
        response.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.responseHeadersEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().responseHeadersEnd(call, response);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.responseHeadersEnd(call, response);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18207T(SystemClock.elapsedRealtime());
                NetworkMetricsEventListener.this.networkTrackInfo.m18203P(response);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void responseHeadersStart(@NotNull final sx3 call) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.responseHeadersStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().responseHeadersStart(call);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.responseHeadersStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18208U(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void secureConnectEnd(@NotNull final sx3 call, @Nullable final dvk handshake) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.secureConnectEnd.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().secureConnectEnd(call, handshake);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.secureConnectEnd(call, handshake);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18209V(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    @Override // p149l.o3f
    public void secureConnectStart(@NotNull final sx3 call) {
        call.getClass();
        fc20.m120418a(new Function0<Unit>() { // from class: com.immomo.android.network.metrics.NetworkMetricsEventListener.secureConnectStart.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Iterator<o3f> it = NetworkMetricsEventListener.this.m18171f().iterator();
                while (it.hasNext()) {
                    it.next().secureConnectStart(call);
                }
                o3f o3fVar = NetworkMetricsEventListener.this.factoryEventListener;
                if (o3fVar != null) {
                    o3fVar.secureConnectStart(call);
                }
                NetworkMetricsEventListener.this.networkTrackInfo.m18210W(SystemClock.elapsedRealtime());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }
}
