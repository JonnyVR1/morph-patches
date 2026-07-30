package kotlinx.coroutines.debug.internal;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom;
import com.p046p1.mobile.putong.core.data.Action;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractMutableMap;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.jwk;
import p149l.lmr;
import p149l.ns5;
import p149l.qkq0;
import p149l.tr4;
import p149l.tuw;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003\u001b-.B\u0011\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u001b\u0010\u0018\u001a\u00020\u00102\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R&\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010#R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004R!\u0010,\u001a\u0018\u0012\u0014\u0012\u00120+R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000*8\u0002X\u0082\u0004¨\u0006/"}, m87232d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "", "K", j6f.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/collections/AbstractMutableMap;", "", "weakRefQueue", "<init>", "(Z)V", Constants.KEY_KEY, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", Action.remove, "", BLiveResOperation.clear, "()V", "j", "f", RXScreenCaptureService.KEY_INDEX, "Ll/jwk;", "w", "e", "(Ll/jwk;)V", "Ljava/lang/ref/ReferenceQueue;", "a", "Ljava/lang/ref/ReferenceQueue;", "", "getSize", "()I", "size", "", "getKeys", "()Ljava/util/Set;", UserMetadata.KEYDATA_FILENAME, "", "getEntries", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "Lkotlinx/atomicfu/AtomicInt;", "_size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a;", "core", "b", "c", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ConcurrentWeakMap<K, V> extends AbstractMutableMap<K, V> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66758b = AtomicIntegerFieldUpdater.newUpdater(ConcurrentWeakMap.class, "_size$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66759c = AtomicReferenceFieldUpdater.newUpdater(ConcurrentWeakMap.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final ReferenceQueue<K> weakRefQueue;
    private volatile /* synthetic */ Object core$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a */
    @Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\t\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0018\"\u0004\b\u0002\u0010\u00152\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u0019\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n0'8\u0002X\u0082\u0004R\u000b\u0010*\u001a\u00020)8\u0002X\u0082\u0004R\u0013\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'8\u0002X\u0082\u0004¨\u0006,"}, m87232d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a;", "", "", "allocated", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", Constants.KEY_KEY, "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Ll/jwk;", "weakKey0", "k", "(Ljava/lang/Object;Ljava/lang/Object;Ll/jwk;)Ljava/lang/Object;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "m", "()Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a;", "weakRef", "", Constants.INAPP_DATA_TAG, "(Ll/jwk;)V", "E", "Lkotlin/Function2;", "factory", "", "j", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "hash", RXScreenCaptureService.KEY_INDEX, "(I)I", FirebaseAnalytics.Param.INDEX, "n", "(I)V", "a", "I", "b", "shift", "c", "threshold", "Lkotlinx/atomicfu/AtomicArray;", UserMetadata.KEYDATA_FILENAME, "Lkotlinx/atomicfu/AtomicInt;", TrackLoadSettingsAtom.TYPE, "values", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public final class C15417a {

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f66761g = AtomicIntegerFieldUpdater.newUpdater(C15417a.class, "load$volatile");

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int allocated;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int shift;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int threshold;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicReferenceArray f66765d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReferenceArray f66766e;
        private volatile /* synthetic */ int load$volatile;

        /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$a$a */
        @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, m87232d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a$a;", "E", "", "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$a;Lkotlin/jvm/functions/Function2;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "c", "()Ljava/lang/Void;", "", "a", "()V", "Lkotlin/jvm/functions/Function2;", "", "b", "I", FirebaseAnalytics.Param.INDEX, "Ljava/lang/Object;", Constants.KEY_KEY, Constants.INAPP_DATA_TAG, "value", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
        @SourceDebugExtension
        public final class a<E> implements Iterator<E>, KMutableIterator {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final Function2<K, V, E> factory;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public int index = -1;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            public K key;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public V value;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super K, ? super V, ? extends E> function2) {
                this.factory = function2;
                m94036a();
            }

            /* JADX INFO: renamed from: a */
            public final void m94036a() {
                K k;
                while (true) {
                    int i = this.index + 1;
                    this.index = i;
                    if (i >= C15417a.this.allocated) {
                        return;
                    }
                    jwk jwkVar = (jwk) C15417a.this.getF66765d().get(this.index);
                    if (jwkVar != null && (k = (K) jwkVar.get()) != null) {
                        this.key = k;
                        Object obj = (V) C15417a.this.getF66766e().get(this.index);
                        if (obj instanceof tuw) {
                            obj = (V) ((tuw) obj).com.p1.mobile.putong.core.data.Ref.TYPE java.lang.String;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                ns5.m160761e();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < C15417a.this.allocated;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // java.util.Iterator
            public E next() {
                if (this.index >= C15417a.this.allocated) {
                    lmr.m150601a();
                    return null;
                }
                Function2<K, V, E> function2 = this.factory;
                K k = this.key;
                if (k == false) {
                    Intrinsics.m87502r(Constants.KEY_KEY);
                    k = (K) Unit.INSTANCE;
                }
                V v2 = this.value;
                if (v2 == false) {
                    Intrinsics.m87502r("value");
                    v2 = (V) Unit.INSTANCE;
                }
                E e = (E) function2.invoke(k, v2);
                m94036a();
                return e;
            }
        }

        public C15417a(int i) {
            this.allocated = i;
            this.shift = Integer.numberOfLeadingZeros(i) + 1;
            this.threshold = (i * 2) / 3;
            this.f66765d = new AtomicReferenceArray(i);
            this.f66766e = new AtomicReferenceArray(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: l */
        public static /* synthetic */ Object m94026l(C15417a c15417a, Object obj, Object obj2, jwk jwkVar, int i, Object obj3) {
            if ((i & 4) != 0) {
                jwkVar = null;
            }
            return c15417a.m94033k(obj, obj2, jwkVar);
        }

        /* JADX INFO: renamed from: d */
        public final void m94027d(@NotNull jwk<?> weakRef) {
            int iM94031i = m94031i(weakRef.hash);
            while (true) {
                jwk<?> jwkVar = (jwk) getF66765d().get(iM94031i);
                if (jwkVar == null) {
                    return;
                }
                if (jwkVar == weakRef) {
                    m94035n(iM94031i);
                    return;
                } else {
                    if (iM94031i == 0) {
                        iM94031i = this.allocated;
                    }
                    iM94031i--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        /* JADX INFO: renamed from: e */
        public final V m94028e(@NotNull K key) {
            int iM94031i = m94031i(key.hashCode());
            while (true) {
                jwk jwkVar = (jwk) getF66765d().get(iM94031i);
                if (jwkVar == null) {
                    return null;
                }
                T t = jwkVar.get();
                if (Intrinsics.m87488d(key, t)) {
                    V v2 = (V) getF66766e().get(iM94031i);
                    return v2 instanceof tuw ? (V) ((tuw) v2).com.p1.mobile.putong.core.data.Ref.TYPE java.lang.String : v2;
                }
                if (t == 0) {
                    m94035n(iM94031i);
                }
                if (iM94031i == 0) {
                    iM94031i = this.allocated;
                }
                iM94031i--;
            }
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final /* synthetic */ AtomicReferenceArray getF66765d() {
            return this.f66765d;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final /* synthetic */ AtomicReferenceArray getF66766e() {
            return this.f66766e;
        }

        /* JADX INFO: renamed from: i */
        public final int m94031i(int hash) {
            return (hash * (-1640531527)) >>> this.shift;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final <E> Iterator<E> m94032j(@NotNull Function2<? super K, ? super V, ? extends E> factory) {
            return new a(factory);
        }

        @Nullable
        /* JADX INFO: renamed from: k */
        public final Object m94033k(@NotNull K key, @Nullable V value, @Nullable jwk<K> weakKey0) {
            int i;
            Object obj;
            int iM94031i = m94031i(key.hashCode());
            boolean z = false;
            while (true) {
                jwk jwkVar = (jwk) getF66765d().get(iM94031i);
                if (jwkVar != null) {
                    T t = jwkVar.get();
                    if (Intrinsics.m87488d(key, t)) {
                        if (!z) {
                            break;
                        }
                        f66761g.decrementAndGet(this);
                        break;
                    }
                    if (t == 0) {
                        m94035n(iM94031i);
                    }
                    if (iM94031i == 0) {
                        iM94031i = this.allocated;
                    }
                    iM94031i--;
                } else if (value != null) {
                    if (!z) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f66761g;
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.threshold) {
                                return ns5.f140238a;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (weakKey0 == null) {
                        weakKey0 = new jwk<>(key, ConcurrentWeakMap.this.weakRefQueue);
                    }
                    if (tr4.m190366a(getF66765d(), iM94031i, null, weakKey0)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
            do {
                obj = getF66766e().get(iM94031i);
                if (obj instanceof tuw) {
                    return ns5.f140238a;
                }
            } while (!tr4.m190366a(getF66766e(), iM94031i, obj, value));
            return obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: m */
        public final ConcurrentWeakMap<K, V>.C15417a m94034m() {
            Object obj;
            while (true) {
                ConcurrentWeakMap<K, V>.C15417a c15417a = (ConcurrentWeakMap<K, V>.C15417a) ConcurrentWeakMap.this.new C15417a(Integer.highestOneBit(C15167a.m87596b(ConcurrentWeakMap.this.size(), 4)) * 4);
                int i = this.allocated;
                for (int i2 = 0; i2 < i; i2++) {
                    jwk jwkVar = (jwk) getF66765d().get(i2);
                    Object obj2 = jwkVar != null ? jwkVar.get() : null;
                    if (jwkVar != null && obj2 == null) {
                        m94035n(i2);
                    }
                    do {
                        obj = getF66766e().get(i2);
                        if (obj instanceof tuw) {
                            obj = ((tuw) obj).com.p1.mobile.putong.core.data.Ref.TYPE java.lang.String;
                            break;
                        }
                    } while (!tr4.m190366a(getF66766e(), i2, obj, ns5.m160760d(obj)));
                    if (obj2 == null || obj == null || c15417a.m94033k(obj2, obj, jwkVar) != ns5.f140238a) {
                    }
                }
                return c15417a;
            }
        }

        /* JADX INFO: renamed from: n */
        public final void m94035n(int index) {
            Object obj;
            do {
                obj = getF66766e().get(index);
                if (obj == null || (obj instanceof tuw)) {
                    return;
                }
            } while (!tr4.m190366a(getF66766e(), index, obj, null));
            ConcurrentWeakMap.this.m94019f();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$b */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00028\u00032\u0006\u0010\b\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m87232d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$b;", "K", j6f.GPS_MEASUREMENT_INTERRUPTED, "", Constants.KEY_KEY, "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", Constants.KEY_NEW_VALUE, "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "getValue", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public static final class C15418b<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final K key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final V value;

        public C15418b(K k, V v2) {
            this.key = k;
            this.value = v2;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            ns5.m160761e();
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$c */
    @Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR&\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$c;", "E", "Lkotlin/collections/AbstractMutableSet;", "Lkotlin/Function2;", "factory", "<init>", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lkotlin/jvm/functions/Function2;)V", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "a", "Lkotlin/jvm/functions/Function2;", "", "getSize", "()I", "size", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
    public final class C15419c<E> extends AbstractMutableSet<E> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Function2<K, V, E> factory;

        /* JADX WARN: Multi-variable type inference failed */
        public C15419c(Function2<? super K, ? super V, ? extends E> function2) {
            this.factory = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E element) {
            ns5.m160761e();
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return ConcurrentWeakMap.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NotNull
        public Iterator<E> iterator() {
            return ((C15417a) ConcurrentWeakMap.m94016g().get(ConcurrentWeakMap.this)).m94032j(this.factory);
        }
    }

    public ConcurrentWeakMap(boolean z) {
        this.core$volatile = new C15417a(16);
        this.weakRefQueue = z ? new ReferenceQueue<>() : null;
    }

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m94016g() {
        return f66759c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m94018e(jwk<?> w) {
        ((C15417a) f66759c.get(this)).m94027d(w);
    }

    /* JADX INFO: renamed from: f */
    public final void m94019f() {
        f66758b.decrementAndGet(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V get(@Nullable Object key) {
        if (key == null) {
            return null;
        }
        return (V) ((C15417a) f66759c.get(this)).m94028e(key);
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<Map.Entry<K, V>> getEntries() {
        return new C15419c(new Function2<K, V, Map.Entry<K, V>>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final Map.Entry<K, V> invoke(@NotNull K k, @NotNull V v2) {
                return new ConcurrentWeakMap.C15418b(k, v2);
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    @NotNull
    public Set<K> getKeys() {
        return new C15419c(new Function2<K, V, K>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final K invoke(@NotNull K k, @NotNull V v2) {
                return k;
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return f66758b.get(this);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized V m94020i(K key, V value) {
        V v2;
        C15417a c15417aM94034m = (C15417a) f66759c.get(this);
        while (true) {
            K k = key;
            V v3 = value;
            v2 = (V) C15417a.m94026l(c15417aM94034m, k, v3, null, 4, null);
            if (v2 == ns5.f140238a) {
                c15417aM94034m = c15417aM94034m.m94034m();
                f66759c.set(this, c15417aM94034m);
                key = k;
                value = v3;
            }
        }
        return v2;
    }

    /* JADX INFO: renamed from: j */
    public final void m94021j() {
        if (this.weakRefQueue == null) {
            qkq0.m175383a("Must be created with weakRefQueue = true");
            return;
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.weakRefQueue.remove();
                referenceRemove.getClass();
                m94018e((jwk) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public V put(@NotNull K key, @NotNull V value) {
        V vM94020i = (V) C15417a.m94026l((C15417a) f66759c.get(this), key, value, null, 4, null);
        if (vM94020i == ns5.f140238a) {
            vM94020i = m94020i(key, value);
        }
        if (vM94020i == null) {
            f66758b.incrementAndGet(this);
        }
        return vM94020i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @Nullable
    public V remove(@Nullable Object key) {
        if (key == 0) {
            return null;
        }
        V vM94020i = (V) C15417a.m94026l((C15417a) f66759c.get(this), key, null, null, 4, null);
        if (vM94020i == ns5.f140238a) {
            vM94020i = m94020i(key, null);
        }
        if (vM94020i != null) {
            f66758b.decrementAndGet(this);
        }
        return vM94020i;
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }
}
