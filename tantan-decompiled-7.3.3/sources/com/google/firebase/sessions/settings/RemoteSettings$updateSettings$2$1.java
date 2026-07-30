package com.google.firebase.sessions.settings;

import android.util.Log;
import com.p051p1.mobile.putong.data.Careers;
import com.tencent.mmkv.MMKV;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, "Lorg/json/JSONObject;"}, m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
@DebugMetadata(m88262c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m88263f = "RemoteSettings.kt", m88264l = {125, 128, 131, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 134, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA}, m88265m = "invokeSuspend")
@SourceDebugExtension
public final class RemoteSettings$updateSettings$2$1 extends SuspendLambda implements Function2<JSONObject, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$updateSettings$2$1(RemoteSettings remoteSettings, Continuation<? super RemoteSettings$updateSettings$2$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull JSONObject jSONObject, @Nullable Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0102 A[PHI: r0 r1
      0x0102: PHI (r0v9 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r0v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v11 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:44:0x00e5, B:46:0x00fe, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]
      0x0102: PHI (r1v12 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r1v7 kotlin.jvm.internal.Ref$ObjectRef)
      (r1v7 kotlin.jvm.internal.Ref$ObjectRef)
      (r1v16 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:44:0x00e5, B:46:0x00fe, B:10:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122 A[PHI: r0
      0x0122: PHI (r0v12 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r0v9 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v9 kotlin.jvm.internal.Ref$ObjectRef)
      (r0v16 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:49:0x0106, B:51:0x011f, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0128  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x0148  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013f, code lost:
    
        if (r12.updateSessionCacheDuration(r0, r11) == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0180, code lost:
    
        if (r12.updateSessionCacheUpdatedTime(r0, r11) == r4) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Boolean bool;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        SettingsCache settingsCache;
        Integer num;
        SettingsCache settingsCache2;
        Double d;
        Unit unit;
        SettingsCache settingsCache3;
        Integer numM88260b;
        Object objM198688e = uyp.m198688e();
        switch (this.label) {
            case 0:
                ResultKt.m88128b(obj);
                JSONObject jSONObject = (JSONObject) this.L$0;
                Objects.toString(jSONObject);
                Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                if (jSONObject.has("app_quality")) {
                    Object obj2 = jSONObject.get("app_quality");
                    obj2.getClass();
                    JSONObject jSONObject2 = (JSONObject) obj2;
                    try {
                        bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            if (jSONObject2.has("sampling_rate")) {
                                objectRef6.element = (Double) jSONObject2.get("sampling_rate");
                            }
                            if (jSONObject2.has("session_timeout_seconds")) {
                                objectRef.element = (Integer) jSONObject2.get("session_timeout_seconds");
                            }
                            if (jSONObject2.has("cache_duration")) {
                                objectRef7.element = (Integer) jSONObject2.get("cache_duration");
                            }
                        } catch (JSONException e) {
                            e = e;
                            Log.e(RemoteSettings.TAG, "Error parsing the configs remotely fetched: ", e);
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        bool = null;
                    }
                    break;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    SettingsCache settingsCache4 = this.this$0.getSettingsCache();
                    this.L$0 = objectRef6;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef7;
                    this.label = 1;
                    if (settingsCache4.updateSettingsEnabled(bool, this) != objM198688e) {
                        objectRef4 = objectRef6;
                        objectRef5 = objectRef;
                        objectRef3 = objectRef7;
                        objectRef = objectRef5;
                        objectRef2 = objectRef4;
                        if (((Integer) objectRef.element) != null) {
                            settingsCache = this.this$0.getSettingsCache();
                            num = (Integer) objectRef.element;
                            this.L$0 = objectRef2;
                            this.L$1 = objectRef3;
                            this.L$2 = null;
                            this.label = 2;
                            if (settingsCache.updateSessionRestartTimeout(num, this) != objM198688e) {
                                if (((Double) objectRef2.element) != null) {
                                    settingsCache2 = this.this$0.getSettingsCache();
                                    d = (Double) objectRef2.element;
                                    this.L$0 = objectRef3;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 3;
                                    if (settingsCache2.updateSamplingRate(d, this) != objM198688e) {
                                        if (((Integer) objectRef3.element) != null) {
                                            unit = null;
                                            if (unit != null) {
                                                SettingsCache settingsCache5 = this.this$0.getSettingsCache();
                                                Long lM88261c = Boxing.m88261c(System.currentTimeMillis());
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.label = 6;
                                            } else {
                                                settingsCache3 = this.this$0.getSettingsCache();
                                                numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.label = 5;
                                                if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                                    SettingsCache settingsCache6 = this.this$0.getSettingsCache();
                                                    Long lM88261c2 = Boxing.m88261c(System.currentTimeMillis());
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.label = 6;
                                                }
                                            }
                                        } else {
                                            SettingsCache settingsCache7 = this.this$0.getSettingsCache();
                                            Integer num2 = (Integer) objectRef3.element;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 4;
                                        }
                                    }
                                } else if (((Integer) objectRef3.element) != null) {
                                    unit = null;
                                    if (unit != null) {
                                        SettingsCache settingsCache8 = this.this$0.getSettingsCache();
                                        Long lM88261c3 = Boxing.m88261c(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    } else {
                                        settingsCache3 = this.this$0.getSettingsCache();
                                        numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 5;
                                        if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                            SettingsCache settingsCache9 = this.this$0.getSettingsCache();
                                            Long lM88261c4 = Boxing.m88261c(System.currentTimeMillis());
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 6;
                                        }
                                    }
                                } else {
                                    SettingsCache settingsCache10 = this.this$0.getSettingsCache();
                                    Integer num3 = (Integer) objectRef3.element;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 4;
                                }
                            }
                        } else if (((Double) objectRef2.element) != null) {
                            settingsCache2 = this.this$0.getSettingsCache();
                            d = (Double) objectRef2.element;
                            this.L$0 = objectRef3;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (settingsCache2.updateSamplingRate(d, this) != objM198688e) {
                                if (((Integer) objectRef3.element) != null) {
                                    unit = null;
                                    if (unit != null) {
                                        SettingsCache settingsCache11 = this.this$0.getSettingsCache();
                                        Long lM88261c5 = Boxing.m88261c(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    } else {
                                        settingsCache3 = this.this$0.getSettingsCache();
                                        numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 5;
                                        if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                            SettingsCache settingsCache12 = this.this$0.getSettingsCache();
                                            Long lM88261c6 = Boxing.m88261c(System.currentTimeMillis());
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 6;
                                        }
                                    }
                                } else {
                                    SettingsCache settingsCache13 = this.this$0.getSettingsCache();
                                    Integer num4 = (Integer) objectRef3.element;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 4;
                                }
                            }
                        } else if (((Integer) objectRef3.element) != null) {
                            unit = null;
                            if (unit != null) {
                                SettingsCache settingsCache14 = this.this$0.getSettingsCache();
                                Long lM88261c7 = Boxing.m88261c(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            } else {
                                settingsCache3 = this.this$0.getSettingsCache();
                                numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                    SettingsCache settingsCache15 = this.this$0.getSettingsCache();
                                    Long lM88261c8 = Boxing.m88261c(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                }
                            }
                        } else {
                            SettingsCache settingsCache16 = this.this$0.getSettingsCache();
                            Integer num5 = (Integer) objectRef3.element;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                        }
                    }
                    break;
                } else {
                    objectRef2 = objectRef6;
                    objectRef3 = objectRef7;
                    if (((Integer) objectRef.element) != null) {
                        settingsCache = this.this$0.getSettingsCache();
                        num = (Integer) objectRef.element;
                        this.L$0 = objectRef2;
                        this.L$1 = objectRef3;
                        this.L$2 = null;
                        this.label = 2;
                        if (settingsCache.updateSessionRestartTimeout(num, this) != objM198688e) {
                            if (((Double) objectRef2.element) != null) {
                                settingsCache2 = this.this$0.getSettingsCache();
                                d = (Double) objectRef2.element;
                                this.L$0 = objectRef3;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 3;
                                if (settingsCache2.updateSamplingRate(d, this) != objM198688e) {
                                    if (((Integer) objectRef3.element) != null) {
                                        unit = null;
                                        if (unit != null) {
                                            SettingsCache settingsCache17 = this.this$0.getSettingsCache();
                                            Long lM88261c9 = Boxing.m88261c(System.currentTimeMillis());
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 6;
                                        } else {
                                            settingsCache3 = this.this$0.getSettingsCache();
                                            numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 5;
                                            if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                                SettingsCache settingsCache18 = this.this$0.getSettingsCache();
                                                Long lM88261c10 = Boxing.m88261c(System.currentTimeMillis());
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.label = 6;
                                            }
                                        }
                                    } else {
                                        SettingsCache settingsCache19 = this.this$0.getSettingsCache();
                                        Integer num6 = (Integer) objectRef3.element;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 4;
                                    }
                                }
                            } else if (((Integer) objectRef3.element) != null) {
                                unit = null;
                                if (unit != null) {
                                    SettingsCache settingsCache110 = this.this$0.getSettingsCache();
                                    Long lM88261c11 = Boxing.m88261c(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                } else {
                                    settingsCache3 = this.this$0.getSettingsCache();
                                    numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 5;
                                    if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                        SettingsCache settingsCache111 = this.this$0.getSettingsCache();
                                        Long lM88261c12 = Boxing.m88261c(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    }
                                }
                            } else {
                                SettingsCache settingsCache112 = this.this$0.getSettingsCache();
                                Integer num7 = (Integer) objectRef3.element;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                            }
                        }
                    } else if (((Double) objectRef2.element) != null) {
                        settingsCache2 = this.this$0.getSettingsCache();
                        d = (Double) objectRef2.element;
                        this.L$0 = objectRef3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (settingsCache2.updateSamplingRate(d, this) != objM198688e) {
                            if (((Integer) objectRef3.element) != null) {
                                unit = null;
                                if (unit != null) {
                                    SettingsCache settingsCache113 = this.this$0.getSettingsCache();
                                    Long lM88261c13 = Boxing.m88261c(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                } else {
                                    settingsCache3 = this.this$0.getSettingsCache();
                                    numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 5;
                                    if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                        SettingsCache settingsCache114 = this.this$0.getSettingsCache();
                                        Long lM88261c14 = Boxing.m88261c(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    }
                                }
                            } else {
                                SettingsCache settingsCache115 = this.this$0.getSettingsCache();
                                Integer num8 = (Integer) objectRef3.element;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                            }
                        }
                    } else if (((Integer) objectRef3.element) != null) {
                        unit = null;
                        if (unit != null) {
                            SettingsCache settingsCache116 = this.this$0.getSettingsCache();
                            Long lM88261c15 = Boxing.m88261c(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                        } else {
                            settingsCache3 = this.this$0.getSettingsCache();
                            numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                SettingsCache settingsCache117 = this.this$0.getSettingsCache();
                                Long lM88261c16 = Boxing.m88261c(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            }
                        }
                    } else {
                        SettingsCache settingsCache118 = this.this$0.getSettingsCache();
                        Integer num9 = (Integer) objectRef3.element;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                    }
                    break;
                }
                return objM198688e;
            case 1:
                objectRef3 = (Ref.ObjectRef) this.L$2;
                objectRef5 = (Ref.ObjectRef) this.L$1;
                objectRef4 = (Ref.ObjectRef) this.L$0;
                ResultKt.m88128b(obj);
                objectRef = objectRef5;
                objectRef2 = objectRef4;
                if (((Integer) objectRef.element) != null) {
                    settingsCache = this.this$0.getSettingsCache();
                    num = (Integer) objectRef.element;
                    this.L$0 = objectRef2;
                    this.L$1 = objectRef3;
                    this.L$2 = null;
                    this.label = 2;
                    if (settingsCache.updateSessionRestartTimeout(num, this) != objM198688e) {
                        if (((Double) objectRef2.element) != null) {
                            settingsCache2 = this.this$0.getSettingsCache();
                            d = (Double) objectRef2.element;
                            this.L$0 = objectRef3;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            if (settingsCache2.updateSamplingRate(d, this) != objM198688e) {
                                if (((Integer) objectRef3.element) != null) {
                                    unit = null;
                                    if (unit != null) {
                                        SettingsCache settingsCache119 = this.this$0.getSettingsCache();
                                        Long lM88261c17 = Boxing.m88261c(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    } else {
                                        settingsCache3 = this.this$0.getSettingsCache();
                                        numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 5;
                                        if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                            SettingsCache settingsCache1110 = this.this$0.getSettingsCache();
                                            Long lM88261c18 = Boxing.m88261c(System.currentTimeMillis());
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 6;
                                        }
                                    }
                                } else {
                                    SettingsCache settingsCache1111 = this.this$0.getSettingsCache();
                                    Integer num10 = (Integer) objectRef3.element;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 4;
                                }
                            }
                        } else if (((Integer) objectRef3.element) != null) {
                            unit = null;
                            if (unit != null) {
                                SettingsCache settingsCache1112 = this.this$0.getSettingsCache();
                                Long lM88261c19 = Boxing.m88261c(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            } else {
                                settingsCache3 = this.this$0.getSettingsCache();
                                numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                    SettingsCache settingsCache1113 = this.this$0.getSettingsCache();
                                    Long lM88261c110 = Boxing.m88261c(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                }
                            }
                        } else {
                            SettingsCache settingsCache1114 = this.this$0.getSettingsCache();
                            Integer num11 = (Integer) objectRef3.element;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                        }
                    }
                    break;
                } else {
                    if (((Double) objectRef2.element) != null) {
                        settingsCache2 = this.this$0.getSettingsCache();
                        d = (Double) objectRef2.element;
                        this.L$0 = objectRef3;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (settingsCache2.updateSamplingRate(d, this) != objM198688e) {
                            if (((Integer) objectRef3.element) != null) {
                                unit = null;
                                if (unit != null) {
                                    SettingsCache settingsCache1115 = this.this$0.getSettingsCache();
                                    Long lM88261c111 = Boxing.m88261c(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                } else {
                                    settingsCache3 = this.this$0.getSettingsCache();
                                    numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 5;
                                    if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                        SettingsCache settingsCache1116 = this.this$0.getSettingsCache();
                                        Long lM88261c112 = Boxing.m88261c(System.currentTimeMillis());
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 6;
                                    }
                                }
                            } else {
                                SettingsCache settingsCache1117 = this.this$0.getSettingsCache();
                                Integer num12 = (Integer) objectRef3.element;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                            }
                        }
                    } else if (((Integer) objectRef3.element) != null) {
                        unit = null;
                        if (unit != null) {
                            SettingsCache settingsCache1118 = this.this$0.getSettingsCache();
                            Long lM88261c113 = Boxing.m88261c(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                        } else {
                            settingsCache3 = this.this$0.getSettingsCache();
                            numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                SettingsCache settingsCache1119 = this.this$0.getSettingsCache();
                                Long lM88261c114 = Boxing.m88261c(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            }
                        }
                    } else {
                        SettingsCache settingsCache11110 = this.this$0.getSettingsCache();
                        Integer num13 = (Integer) objectRef3.element;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                    }
                    break;
                }
                return objM198688e;
            case 2:
                objectRef3 = (Ref.ObjectRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                ResultKt.m88128b(obj);
                if (((Double) objectRef2.element) != null) {
                    settingsCache2 = this.this$0.getSettingsCache();
                    d = (Double) objectRef2.element;
                    this.L$0 = objectRef3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (settingsCache2.updateSamplingRate(d, this) != objM198688e) {
                        if (((Integer) objectRef3.element) != null) {
                            unit = null;
                            if (unit != null) {
                                SettingsCache settingsCache11111 = this.this$0.getSettingsCache();
                                Long lM88261c115 = Boxing.m88261c(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            } else {
                                settingsCache3 = this.this$0.getSettingsCache();
                                numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 5;
                                if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                    SettingsCache settingsCache11112 = this.this$0.getSettingsCache();
                                    Long lM88261c116 = Boxing.m88261c(System.currentTimeMillis());
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 6;
                                }
                            }
                        } else {
                            SettingsCache settingsCache11113 = this.this$0.getSettingsCache();
                            Integer num14 = (Integer) objectRef3.element;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                        }
                    }
                    break;
                } else {
                    if (((Integer) objectRef3.element) != null) {
                        unit = null;
                        if (unit != null) {
                            SettingsCache settingsCache11114 = this.this$0.getSettingsCache();
                            Long lM88261c117 = Boxing.m88261c(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                        } else {
                            settingsCache3 = this.this$0.getSettingsCache();
                            numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                                SettingsCache settingsCache11115 = this.this$0.getSettingsCache();
                                Long lM88261c118 = Boxing.m88261c(System.currentTimeMillis());
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                            }
                        }
                    } else {
                        SettingsCache settingsCache11116 = this.this$0.getSettingsCache();
                        Integer num15 = (Integer) objectRef3.element;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                    }
                    break;
                }
                return objM198688e;
            case 3:
                objectRef3 = (Ref.ObjectRef) this.L$0;
                ResultKt.m88128b(obj);
                if (((Integer) objectRef3.element) != null) {
                    SettingsCache settingsCache11117 = this.this$0.getSettingsCache();
                    Integer num16 = (Integer) objectRef3.element;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    break;
                } else {
                    unit = null;
                    if (unit != null) {
                        SettingsCache settingsCache11118 = this.this$0.getSettingsCache();
                        Long lM88261c119 = Boxing.m88261c(System.currentTimeMillis());
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                    } else {
                        settingsCache3 = this.this$0.getSettingsCache();
                        numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                            SettingsCache settingsCache11119 = this.this$0.getSettingsCache();
                            Long lM88261c1110 = Boxing.m88261c(System.currentTimeMillis());
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                        }
                    }
                    break;
                }
                return objM198688e;
            case 4:
                ResultKt.m88128b(obj);
                unit = Unit.INSTANCE;
                if (unit != null) {
                    settingsCache3 = this.this$0.getSettingsCache();
                    numM88260b = Boxing.m88260b(MMKV.ExpireInDay);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (settingsCache3.updateSessionCacheDuration(numM88260b, this) != objM198688e) {
                        SettingsCache settingsCache111110 = this.this$0.getSettingsCache();
                        Long lM88261c1111 = Boxing.m88261c(System.currentTimeMillis());
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                    }
                    break;
                } else {
                    SettingsCache settingsCache111111 = this.this$0.getSettingsCache();
                    Long lM88261c1112 = Boxing.m88261c(System.currentTimeMillis());
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 6;
                    break;
                }
                return objM198688e;
            case 5:
                ResultKt.m88128b(obj);
                SettingsCache settingsCache111112 = this.this$0.getSettingsCache();
                Long lM88261c1113 = Boxing.m88261c(System.currentTimeMillis());
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                break;
            case 6:
                ResultKt.m88128b(obj);
                return Unit.INSTANCE;
            default:
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
