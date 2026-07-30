package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.internal.ads.C2210o1;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzce;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzhl;
import com.google.android.gms.internal.ads.zzhp;
import com.google.android.gms.internal.ads.zzhq;
import com.google.android.gms.internal.ads.zzhr;
import com.google.android.gms.internal.ads.zzhz;
import com.google.android.gms.internal.ads.zziz;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzro;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzsb;
import com.google.android.gms.internal.ads.zzst;
import com.google.android.gms.internal.ads.zzsx;
import com.tencent.liteav.TXLiteAVCode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(31)
public final class mey0 implements x6y0, oey0 {

    /* JADX INFO: renamed from: a */
    public final Context f133522a;

    /* JADX INFO: renamed from: b */
    public final qey0 f133523b;

    /* JADX INFO: renamed from: c */
    public final PlaybackSession f133524c;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f133530i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public PlaybackMetrics.Builder f133531j;

    /* JADX INFO: renamed from: k */
    public int f133532k;

    /* JADX INFO: renamed from: n */
    @Nullable
    public zzce f133535n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public key0 f133536o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public key0 f133537p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public key0 f133538q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public mhr0 f133539r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public mhr0 f133540s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public mhr0 f133541t;

    /* JADX INFO: renamed from: u */
    public boolean f133542u;

    /* JADX INFO: renamed from: v */
    public boolean f133543v;

    /* JADX INFO: renamed from: w */
    public int f133544w;

    /* JADX INFO: renamed from: x */
    public int f133545x;

    /* JADX INFO: renamed from: y */
    public int f133546y;

    /* JADX INFO: renamed from: z */
    public boolean f133547z;

    /* JADX INFO: renamed from: e */
    public final qpt0 f133526e = new qpt0();

    /* JADX INFO: renamed from: f */
    public final bnt0 f133527f = new bnt0();

    /* JADX INFO: renamed from: h */
    public final HashMap f133529h = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashMap f133528g = new HashMap();

    /* JADX INFO: renamed from: d */
    public final long f133525d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l */
    public int f133533l = 0;

    /* JADX INFO: renamed from: m */
    public int f133534m = 0;

    public mey0(Context context, PlaybackSession playbackSession) {
        this.f133522a = context.getApplicationContext();
        this.f133524c = playbackSession;
        iey0 iey0Var = new iey0(iey0.f112935i);
        this.f133523b = iey0Var;
        iey0Var.mo135828c(this);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static mey0 m154342n(Context context) {
        MediaMetricsManager mediaMetricsManagerM215553a = yox.m215553a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM215553a == null) {
            return null;
        }
        return new mey0(context, mediaMetricsManagerM215553a.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: r */
    public static int m154343r(int i) {
        switch (ggw0.m126082x(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: c */
    public final void mo154346c(s6y0 s6y0Var, zzce zzceVar) {
        this.f133535n = zzceVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0170  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0203  */
    /* JADX WARN: Code duplicated, block: B:149:0x020f  */
    /* JADX WARN: Code duplicated, block: B:151:0x0215  */
    /* JADX WARN: Code duplicated, block: B:152:0x021f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0223  */
    /* JADX WARN: Code duplicated, block: B:155:0x0226  */
    /* JADX WARN: Code duplicated, block: B:157:0x022a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0232  */
    /* JADX WARN: Code duplicated, block: B:160:0x0236  */
    /* JADX WARN: Code duplicated, block: B:161:0x023e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0244  */
    /* JADX WARN: Code duplicated, block: B:164:0x0250  */
    /* JADX WARN: Code duplicated, block: B:174:0x0298  */
    /* JADX WARN: Code duplicated, block: B:176:0x029d  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.x6y0
    /* JADX INFO: renamed from: d */
    public final void mo154347d(ift0 ift0Var, v6y0 v6y0Var) {
        int i;
        int i2;
        int iM154343r;
        int i3;
        int errorCode;
        int iM126083y;
        zzae zzaeVar;
        int i4;
        int i5;
        if (v6y0Var.m197280b() == 0) {
            return;
        }
        for (int i6 = 0; i6 < v6y0Var.m197280b(); i6++) {
            int iM197279a = v6y0Var.m197279a(i6);
            s6y0 s6y0VarM197281c = v6y0Var.m197281c(iM197279a);
            if (iM197279a == 0) {
                this.f133523b.mo135829d(s6y0VarM197281c);
            } else {
                qey0 qey0Var = this.f133523b;
                if (iM197279a == 11) {
                    qey0Var.mo135831f(s6y0VarM197281c, this.f133532k);
                } else {
                    qey0Var.mo135827b(s6y0VarM197281c);
                }
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (v6y0Var.m197282d(0)) {
            s6y0 s6y0VarM197281c2 = v6y0Var.m197281c(0);
            if (this.f133531j != null) {
                m154363v(s6y0VarM197281c2.f162866b, s6y0VarM197281c2.f162868d);
            }
        }
        if (v6y0Var.m197282d(2) && this.f133531j != null) {
            zzgaa zzgaaVarM163190a = ift0Var.zzo().m163190a();
            int size = zzgaaVarM163190a.size();
            int i7 = 0;
            loop1: while (true) {
                if (i7 >= size) {
                    zzaeVar = null;
                    break;
                }
                g7u0 g7u0Var = (g7u0) zzgaaVarM163190a.get(i7);
                char c = 0;
                while (true) {
                    int i8 = g7u0Var.f101442a;
                    i5 = i7 + 1;
                    if (c <= 0) {
                        if (g7u0Var.m124737d(0) && (zzaeVar = g7u0Var.m124735b(0).f133895o) != null) {
                            break loop1;
                        } else {
                            c = 1;
                        }
                    }
                }
                i7 = i5;
            }
            if (zzaeVar != null) {
                PlaybackMetrics.Builder builder = this.f133531j;
                int i9 = ggw0.f102568a;
                int i10 = 0;
                while (true) {
                    if (i10 >= zzaeVar.zzb) {
                        i4 = 1;
                        break;
                    }
                    UUID uuid = zzaeVar.m13536a(i10).zza;
                    if (uuid.equals(wby0.f185633d)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(wby0.f185634e)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(wby0.f185632c)) {
                            i4 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builder.setDrmType(i4);
            }
        }
        if (v6y0Var.m197282d(1011)) {
            this.f133546y++;
        }
        zzce zzceVar = this.f133535n;
        if (zzceVar != null) {
            Context context = this.f133522a;
            if (zzceVar.zzb == 1001) {
                i3 = 20;
            } else {
                zziz zzizVar = (zziz) zzceVar;
                boolean z = zzizVar.zze == 1;
                int i11 = zzizVar.zzi;
                Throwable cause = zzceVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzhr) {
                        iM126083y = ((zzhr) cause).zzd;
                        i3 = 5;
                    } else if ((cause instanceof zzhq) || (cause instanceof zzcc)) {
                        iM126083y = 0;
                        i3 = 11;
                    } else {
                        boolean z2 = cause instanceof zzhp;
                        if (z2 || (cause instanceof zzhz)) {
                            if (C2210o1.m13070b(context).m13072a() == 1) {
                                iM126083y = 0;
                                i3 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iM126083y = 0;
                                    i3 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iM126083y = 0;
                                    i3 = 7;
                                } else if (z2 && ((zzhp) cause).zzc == 1) {
                                    iM126083y = 0;
                                    i3 = 4;
                                } else {
                                    iM126083y = 0;
                                    i3 = 8;
                                }
                            }
                        } else if (zzceVar.zzb == 1002) {
                            i3 = 21;
                        } else if (cause instanceof zzrq) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i12 = ggw0.f102568a;
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = ggw0.m126083y(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iM154343r = m154343r(errorCode);
                                int i13 = iM154343r;
                                iM126083y = errorCode;
                                i3 = i13;
                            } else if (ggw0.f102568a >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                i3 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i3 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i3 = 29;
                            } else if (cause3 instanceof zzsb) {
                                iM126083y = 0;
                                i3 = 23;
                            } else {
                                i3 = cause3 instanceof zzro ? 28 : 30;
                            }
                        } else if ((cause instanceof zzhl) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            int i14 = ggw0.f102568a;
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i3 = 32;
                            } else {
                                iM126083y = 0;
                                i3 = 31;
                            }
                        } else {
                            iM126083y = 0;
                            i3 = 9;
                        }
                    }
                } else if (z) {
                    i3 = 35;
                    if (i11 != 0 && i11 != 1) {
                        if (!z && i11 == 3) {
                            i3 = 15;
                        } else if (!z && i11 == 2) {
                            iM126083y = 0;
                            i3 = 23;
                        } else if (cause instanceof zzsx) {
                            iM126083y = ggw0.m126083y(((zzsx) cause).zzd);
                            i3 = 13;
                        } else {
                            iM154343r = 14;
                            if (cause instanceof zzst) {
                                errorCode = ggw0.m126083y(((zzst) cause).zzb);
                            } else if (cause instanceof OutOfMemoryError) {
                                i3 = 14;
                            } else if (cause instanceof zzpx) {
                                errorCode = ((zzpx) cause).zza;
                                iM154343r = 17;
                            } else if (cause instanceof zzqa) {
                                errorCode = ((zzqa) cause).zza;
                                iM154343r = 18;
                            } else {
                                int i15 = ggw0.f102568a;
                                if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    iM154343r = m154343r(errorCode);
                                } else {
                                    i3 = 22;
                                }
                            }
                            int i16 = iM154343r;
                            iM126083y = errorCode;
                            i3 = i16;
                        }
                    }
                } else if (!z) {
                    if (!z) {
                    }
                    if (cause instanceof zzsx) {
                        iM126083y = ggw0.m126083y(((zzsx) cause).zzd);
                        i3 = 13;
                    } else {
                        iM154343r = 14;
                        if (cause instanceof zzst) {
                            errorCode = ggw0.m126083y(((zzst) cause).zzb);
                        } else if (cause instanceof OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof zzpx) {
                            errorCode = ((zzpx) cause).zza;
                            iM154343r = 17;
                        } else if (cause instanceof zzqa) {
                            errorCode = ((zzqa) cause).zza;
                            iM154343r = 18;
                        } else {
                            int i17 = ggw0.f102568a;
                            if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iM154343r = m154343r(errorCode);
                            } else {
                                i3 = 22;
                            }
                        }
                        int i18 = iM154343r;
                        iM126083y = errorCode;
                        i3 = i18;
                    }
                } else {
                    if (!z) {
                    }
                    if (cause instanceof zzsx) {
                        iM126083y = ggw0.m126083y(((zzsx) cause).zzd);
                        i3 = 13;
                    } else {
                        iM154343r = 14;
                        if (cause instanceof zzst) {
                            errorCode = ggw0.m126083y(((zzst) cause).zzb);
                        } else if (cause instanceof OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof zzpx) {
                            errorCode = ((zzpx) cause).zza;
                            iM154343r = 17;
                        } else if (cause instanceof zzqa) {
                            errorCode = ((zzqa) cause).zza;
                            iM154343r = 18;
                        } else {
                            int i19 = ggw0.f102568a;
                            if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iM154343r = m154343r(errorCode);
                            } else {
                                i3 = 22;
                            }
                        }
                        int i110 = iM154343r;
                        iM126083y = errorCode;
                        i3 = i110;
                    }
                }
                this.f133524c.reportPlaybackErrorEvent(nnx.m160375a().setTimeSinceCreatedMillis(jElapsedRealtime - this.f133525d).setErrorCode(i3).setSubErrorCode(iM126083y).setException(zzceVar).build());
                this.f133547z = true;
                this.f133535n = null;
            }
            iM126083y = 0;
            this.f133524c.reportPlaybackErrorEvent(nnx.m160375a().setTimeSinceCreatedMillis(jElapsedRealtime - this.f133525d).setErrorCode(i3).setSubErrorCode(iM126083y).setException(zzceVar).build());
            this.f133547z = true;
            this.f133535n = null;
        }
        if (v6y0Var.m197282d(2)) {
            o8u0 o8u0VarZzo = ift0Var.zzo();
            boolean zM163191b = o8u0VarZzo.m163191b(2);
            boolean zM163191b2 = o8u0VarZzo.m163191b(1);
            boolean zM163191b3 = o8u0VarZzo.m163191b(3);
            if (zM163191b || zM163191b2) {
                if (!zM163191b) {
                    m154364w(jElapsedRealtime, null, 0);
                }
                if (!zM163191b2) {
                    m154361t(jElapsedRealtime, null, 0);
                }
                if (!zM163191b3) {
                    m154362u(jElapsedRealtime, null, 0);
                }
            } else if (zM163191b3) {
                zM163191b3 = true;
                if (!zM163191b) {
                    m154364w(jElapsedRealtime, null, 0);
                }
                if (!zM163191b2) {
                    m154361t(jElapsedRealtime, null, 0);
                }
                if (!zM163191b3) {
                    m154362u(jElapsedRealtime, null, 0);
                }
            }
        }
        if (m154366y(this.f133536o)) {
            mhr0 mhr0Var = this.f133536o.f122879a;
            if (mhr0Var.f133898r != -1) {
                m154364w(jElapsedRealtime, mhr0Var, 0);
                this.f133536o = null;
            }
        }
        if (m154366y(this.f133537p)) {
            m154361t(jElapsedRealtime, this.f133537p.f122879a, 0);
            this.f133537p = null;
        }
        if (m154366y(this.f133538q)) {
            m154362u(jElapsedRealtime, this.f133538q.f122879a, 0);
            this.f133538q = null;
        }
        switch (C2210o1.m13070b(this.f133522a).m13072a()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.f133534m) {
            this.f133534m = i;
            this.f133524c.reportNetworkEvent(jox.m142536a().setNetworkType(i).setTimeSinceCreatedMillis(jElapsedRealtime - this.f133525d).build());
        }
        if (ift0Var.zzf() != 2) {
            this.f133542u = false;
        }
        if (((g6y0) ift0Var).m124680l() == null) {
            this.f133543v = false;
        } else if (v6y0Var.m197282d(10)) {
            this.f133543v = true;
        }
        int iZzf = ift0Var.zzf();
        if (this.f133542u) {
            i2 = 5;
        } else if (this.f133543v) {
            i2 = 13;
        } else {
            i2 = 4;
            if (iZzf == 4) {
                i2 = 11;
            } else if (iZzf == 2) {
                int i20 = this.f133533l;
                if (i20 == 0 || i20 == 2) {
                    i2 = 2;
                } else if (ift0Var.mo124670b()) {
                    i2 = ift0Var.zzg() != 0 ? 10 : 6;
                } else {
                    i2 = 7;
                }
            } else if (iZzf != 3) {
                i2 = (iZzf != 1 || this.f133533l == 0) ? this.f133533l : 12;
            } else if (ift0Var.mo124670b()) {
                i2 = ift0Var.zzg() != 0 ? 9 : 3;
            }
        }
        if (this.f133533l != i2) {
            this.f133533l = i2;
            this.f133547z = true;
            this.f133524c.reportPlaybackStateEvent(cnx.m107836a().setState(this.f133533l).setTimeSinceCreatedMillis(jElapsedRealtime - this.f133525d).build());
        }
        if (v6y0Var.m197282d(TXLiteAVCode.EVT_SW_ENCODER_START_SUCC)) {
            this.f133523b.mo135826a(v6y0Var.m197281c(TXLiteAVCode.EVT_SW_ENCODER_START_SUCC));
        }
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: f */
    public final void mo154349f(s6y0 s6y0Var, aqy0 aqy0Var) {
        eqy0 eqy0Var = s6y0Var.f162868d;
        if (eqy0Var == null) {
            return;
        }
        mhr0 mhr0Var = aqy0Var.f71221b;
        mhr0Var.getClass();
        key0 key0Var = new key0(mhr0Var, 0, this.f133523b.mo135830e(s6y0Var.f162866b, eqy0Var));
        int i = aqy0Var.f71220a;
        if (i != 0) {
            if (i == 1) {
                this.f133537p = key0Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f133538q = key0Var;
                return;
            }
        }
        this.f133536o = key0Var;
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: h */
    public final void mo154351h(s6y0 s6y0Var, int i, long j, long j2) {
        eqy0 eqy0Var = s6y0Var.f162868d;
        if (eqy0Var != null) {
            qey0 qey0Var = this.f133523b;
            xqt0 xqt0Var = s6y0Var.f162866b;
            HashMap map = this.f133529h;
            String strMo135830e = qey0Var.mo135830e(xqt0Var, eqy0Var);
            Long l2 = (Long) map.get(strMo135830e);
            Long l3 = (Long) this.f133528g.get(strMo135830e);
            this.f133529h.put(strMo135830e, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            this.f133528g.put(strMo135830e, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // p149l.oey0
    /* JADX INFO: renamed from: i */
    public final void mo154352i(s6y0 s6y0Var, String str, boolean z) {
        eqy0 eqy0Var = s6y0Var.f162868d;
        if ((eqy0Var == null || !eqy0Var.m117807b()) && str.equals(this.f133530i)) {
            m154360s();
        }
        this.f133528g.remove(str);
        this.f133529h.remove(str);
    }

    @Override // p149l.oey0
    /* JADX INFO: renamed from: k */
    public final void mo154354k(s6y0 s6y0Var, String str) {
        eqy0 eqy0Var = s6y0Var.f162868d;
        if (eqy0Var == null || !eqy0Var.m117807b()) {
            m154360s();
            this.f133530i = str;
            this.f133531j = uox.m194570a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.2.1");
            m154363v(s6y0Var.f162866b, s6y0Var.f162868d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final LogSessionId m154355l() {
        return this.f133524c.getSessionId();
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: m */
    public final void mo154356m(s6y0 s6y0Var, aet0 aet0Var, aet0 aet0Var2, int i) {
        if (i == 1) {
            this.f133542u = true;
            i = 1;
        }
        this.f133532k = i;
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: p */
    public final void mo154358p(s6y0 s6y0Var, pnx0 pnx0Var) {
        this.f133544w += pnx0Var.f150423g;
        this.f133545x += pnx0Var.f150421e;
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: q */
    public final void mo154359q(s6y0 s6y0Var, ueu0 ueu0Var) {
        key0 key0Var = this.f133536o;
        if (key0Var != null) {
            mhr0 mhr0Var = key0Var.f122879a;
            if (mhr0Var.f133898r == -1) {
                ter0 ter0VarM154634b = mhr0Var.m154634b();
                ter0VarM154634b.m188590C(ueu0Var.f176206a);
                ter0VarM154634b.m188600i(ueu0Var.f176207b);
                this.f133536o = new key0(ter0VarM154634b.m188591D(), 0, key0Var.f122881c);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m154360s() {
        PlaybackMetrics.Builder builder = this.f133531j;
        if (builder != null && this.f133547z) {
            builder.setAudioUnderrunCount(this.f133546y);
            this.f133531j.setVideoFramesDropped(this.f133544w);
            this.f133531j.setVideoFramesPlayed(this.f133545x);
            Long l2 = (Long) this.f133528g.get(this.f133530i);
            this.f133531j.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f133529h.get(this.f133530i);
            this.f133531j.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f133531j.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f133524c.reportPlaybackMetrics(this.f133531j.build());
        }
        this.f133531j = null;
        this.f133530i = null;
        this.f133546y = 0;
        this.f133544w = 0;
        this.f133545x = 0;
        this.f133539r = null;
        this.f133540s = null;
        this.f133541t = null;
        this.f133547z = false;
    }

    /* JADX INFO: renamed from: t */
    public final void m154361t(long j, @Nullable mhr0 mhr0Var, int i) {
        if (ggw0.m126064f(this.f133540s, mhr0Var)) {
            return;
        }
        int i2 = this.f133540s == null ? 1 : 0;
        this.f133540s = mhr0Var;
        m154365x(0, j, mhr0Var, i2);
    }

    /* JADX INFO: renamed from: u */
    public final void m154362u(long j, @Nullable mhr0 mhr0Var, int i) {
        if (ggw0.m126064f(this.f133541t, mhr0Var)) {
            return;
        }
        int i2 = this.f133541t == null ? 1 : 0;
        this.f133541t = mhr0Var;
        m154365x(2, j, mhr0Var, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    /* JADX INFO: renamed from: v */
    public final void m154363v(xqt0 xqt0Var, @Nullable eqy0 eqy0Var) {
        int iMo112550a;
        PlaybackMetrics.Builder builder = this.f133531j;
        if (eqy0Var == null || (iMo112550a = xqt0Var.mo112550a(eqy0Var.f92867a)) == -1) {
            return;
        }
        int i = 0;
        xqt0Var.mo112551d(iMo112550a, this.f133527f, false);
        xqt0Var.mo112552e(this.f133527f.f76445c, this.f133526e, 0L);
        t9s0 t9s0Var = this.f133526e.f155816c.f139152b;
        if (t9s0Var != null) {
            int iM126045B = ggw0.m126045B(t9s0Var.f169062a);
            if (iM126045B == 0) {
                i = 3;
            } else if (iM126045B != 1) {
                i = iM126045B != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        qpt0 qpt0Var = this.f133526e;
        if (qpt0Var.f155826m != -9223372036854775807L && !qpt0Var.f155824k && !qpt0Var.f155821h && !qpt0Var.m175866b()) {
            builder.setMediaDurationMillis(ggw0.m126052I(this.f133526e.f155826m));
        }
        builder.setPlaybackType(true != this.f133526e.m175866b() ? 1 : 2);
        this.f133547z = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m154364w(long j, @Nullable mhr0 mhr0Var, int i) {
        if (ggw0.m126064f(this.f133539r, mhr0Var)) {
            return;
        }
        int i2 = this.f133539r == null ? 1 : 0;
        this.f133539r = mhr0Var;
        m154365x(1, j, mhr0Var, i2);
    }

    /* JADX INFO: renamed from: x */
    public final void m154365x(int i, long j, @Nullable mhr0 mhr0Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = ynx.m215471a(i).setTimeSinceCreatedMillis(j - this.f133525d);
        if (mhr0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = mhr0Var.f133891k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = mhr0Var.f133892l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = mhr0Var.f133889i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = mhr0Var.f133888h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = mhr0Var.f133897q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = mhr0Var.f133898r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = mhr0Var.f133905y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = mhr0Var.f133906z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = mhr0Var.f133883c;
            if (str4 != null) {
                int i8 = ggw0.f102568a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = mhr0Var.f133899s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f133547z = true;
        this.f133524c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: y */
    public final boolean m154366y(@Nullable key0 key0Var) {
        if (key0Var != null) {
            return key0Var.f122881c.equals(this.f133523b.zze());
        }
        return false;
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo154357o(s6y0 s6y0Var, int i) {
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo154344a(s6y0 s6y0Var, mhr0 mhr0Var, tnx0 tnx0Var) {
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo154345b(s6y0 s6y0Var, Object obj, long j) {
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void mo154350g(s6y0 s6y0Var, mhr0 mhr0Var, tnx0 tnx0Var) {
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo154353j(s6y0 s6y0Var, int i, long j) {
    }

    @Override // p149l.x6y0
    /* JADX INFO: renamed from: e */
    public final void mo154348e(s6y0 s6y0Var, vpy0 vpy0Var, aqy0 aqy0Var, IOException iOException, boolean z) {
    }
}
