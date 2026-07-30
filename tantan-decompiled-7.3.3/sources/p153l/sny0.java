package p153l;

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
import com.google.android.gms.internal.ads.C2233o1;
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
public final class sny0 implements dgy0, uny0 {

    /* JADX INFO: renamed from: a */
    public final Context f169792a;

    /* JADX INFO: renamed from: b */
    public final wny0 f169793b;

    /* JADX INFO: renamed from: c */
    public final PlaybackSession f169794c;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f169800i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public PlaybackMetrics.Builder f169801j;

    /* JADX INFO: renamed from: k */
    public int f169802k;

    /* JADX INFO: renamed from: n */
    @Nullable
    public zzce f169805n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public qny0 f169806o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public qny0 f169807p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public qny0 f169808q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public sqr0 f169809r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public sqr0 f169810s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public sqr0 f169811t;

    /* JADX INFO: renamed from: u */
    public boolean f169812u;

    /* JADX INFO: renamed from: v */
    public boolean f169813v;

    /* JADX INFO: renamed from: w */
    public int f169814w;

    /* JADX INFO: renamed from: x */
    public int f169815x;

    /* JADX INFO: renamed from: y */
    public int f169816y;

    /* JADX INFO: renamed from: z */
    public boolean f169817z;

    /* JADX INFO: renamed from: e */
    public final wyt0 f169796e = new wyt0();

    /* JADX INFO: renamed from: f */
    public final hwt0 f169797f = new hwt0();

    /* JADX INFO: renamed from: h */
    public final HashMap f169799h = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashMap f169798g = new HashMap();

    /* JADX INFO: renamed from: d */
    public final long f169795d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l */
    public int f169803l = 0;

    /* JADX INFO: renamed from: m */
    public int f169804m = 0;

    public sny0(Context context, PlaybackSession playbackSession) {
        this.f169792a = context.getApplicationContext();
        this.f169794c = playbackSession;
        ony0 ony0Var = new ony0(ony0.f148239i);
        this.f169793b = ony0Var;
        ony0Var.mo168418c(this);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static sny0 m187029n(Context context) {
        MediaMetricsManager mediaMetricsManagerM203891a = vxx.m203891a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerM203891a == null) {
            return null;
        }
        return new sny0(context, mediaMetricsManagerM203891a.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    /* JADX INFO: renamed from: r */
    public static int m187030r(int i) {
        switch (mpw0.m159426x(i)) {
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

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: c */
    public final void mo115769c(yfy0 yfy0Var, zzce zzceVar) {
        this.f169805n = zzceVar;
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
    @Override // p153l.dgy0
    /* JADX INFO: renamed from: d */
    public final void mo115770d(oot0 oot0Var, bgy0 bgy0Var) {
        int i;
        int i2;
        int iM187030r;
        int i3;
        int errorCode;
        int iM159427y;
        zzae zzaeVar;
        int i4;
        int i5;
        if (bgy0Var.m104287b() == 0) {
            return;
        }
        for (int i6 = 0; i6 < bgy0Var.m104287b(); i6++) {
            int iM104286a = bgy0Var.m104286a(i6);
            yfy0 yfy0VarM104288c = bgy0Var.m104288c(iM104286a);
            if (iM104286a == 0) {
                this.f169793b.mo168419d(yfy0VarM104288c);
            } else {
                wny0 wny0Var = this.f169793b;
                if (iM104286a == 11) {
                    wny0Var.mo168421f(yfy0VarM104288c, this.f169802k);
                } else {
                    wny0Var.mo168417b(yfy0VarM104288c);
                }
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (bgy0Var.m104289d(0)) {
            yfy0 yfy0VarM104288c2 = bgy0Var.m104288c(0);
            if (this.f169801j != null) {
                m187037v(yfy0VarM104288c2.f199685b, yfy0VarM104288c2.f199687d);
            }
        }
        if (bgy0Var.m104289d(2) && this.f169801j != null) {
            zzgaa zzgaaVarM196124a = oot0Var.zzo().m196124a();
            int size = zzgaaVarM196124a.size();
            int i7 = 0;
            loop1: while (true) {
                if (i7 >= size) {
                    zzaeVar = null;
                    break;
                }
                mgu0 mgu0Var = (mgu0) zzgaaVarM196124a.get(i7);
                char c = 0;
                while (true) {
                    int i8 = mgu0Var.f136792a;
                    i5 = i7 + 1;
                    if (c <= 0) {
                        if (mgu0Var.m158390d(0) && (zzaeVar = mgu0Var.m158388b(0).f170254o) != null) {
                            break loop1;
                        } else {
                            c = 1;
                        }
                    }
                }
                i7 = i5;
            }
            if (zzaeVar != null) {
                PlaybackMetrics.Builder builder = this.f169801j;
                int i9 = mpw0.f137957a;
                int i10 = 0;
                while (true) {
                    if (i10 >= zzaeVar.zzb) {
                        i4 = 1;
                        break;
                    }
                    UUID uuid = zzaeVar.m13590a(i10).zza;
                    if (uuid.equals(cly0.f82441d)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(cly0.f82442e)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(cly0.f82440c)) {
                            i4 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builder.setDrmType(i4);
            }
        }
        if (bgy0Var.m104289d(1011)) {
            this.f169816y++;
        }
        zzce zzceVar = this.f169805n;
        if (zzceVar != null) {
            Context context = this.f169792a;
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
                        iM159427y = ((zzhr) cause).zzd;
                        i3 = 5;
                    } else if ((cause instanceof zzhq) || (cause instanceof zzcc)) {
                        iM159427y = 0;
                        i3 = 11;
                    } else {
                        boolean z2 = cause instanceof zzhp;
                        if (z2 || (cause instanceof zzhz)) {
                            if (C2233o1.m13124b(context).m13126a() == 1) {
                                iM159427y = 0;
                                i3 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    iM159427y = 0;
                                    i3 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    iM159427y = 0;
                                    i3 = 7;
                                } else if (z2 && ((zzhp) cause).zzc == 1) {
                                    iM159427y = 0;
                                    i3 = 4;
                                } else {
                                    iM159427y = 0;
                                    i3 = 8;
                                }
                            }
                        } else if (zzceVar.zzb == 1002) {
                            i3 = 21;
                        } else if (cause instanceof zzrq) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i12 = mpw0.f137957a;
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = mpw0.m159427y(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iM187030r = m187030r(errorCode);
                                int i13 = iM187030r;
                                iM159427y = errorCode;
                                i3 = i13;
                            } else if (mpw0.f137957a >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                i3 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i3 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i3 = 29;
                            } else if (cause3 instanceof zzsb) {
                                iM159427y = 0;
                                i3 = 23;
                            } else {
                                i3 = cause3 instanceof zzro ? 28 : 30;
                            }
                        } else if ((cause instanceof zzhl) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            int i14 = mpw0.f137957a;
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i3 = 32;
                            } else {
                                iM159427y = 0;
                                i3 = 31;
                            }
                        } else {
                            iM159427y = 0;
                            i3 = 9;
                        }
                    }
                } else if (z) {
                    i3 = 35;
                    if (i11 != 0 && i11 != 1) {
                        if (!z && i11 == 3) {
                            i3 = 15;
                        } else if (!z && i11 == 2) {
                            iM159427y = 0;
                            i3 = 23;
                        } else if (cause instanceof zzsx) {
                            iM159427y = mpw0.m159427y(((zzsx) cause).zzd);
                            i3 = 13;
                        } else {
                            iM187030r = 14;
                            if (cause instanceof zzst) {
                                errorCode = mpw0.m159427y(((zzst) cause).zzb);
                            } else if (cause instanceof OutOfMemoryError) {
                                i3 = 14;
                            } else if (cause instanceof zzpx) {
                                errorCode = ((zzpx) cause).zza;
                                iM187030r = 17;
                            } else if (cause instanceof zzqa) {
                                errorCode = ((zzqa) cause).zza;
                                iM187030r = 18;
                            } else {
                                int i15 = mpw0.f137957a;
                                if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    iM187030r = m187030r(errorCode);
                                } else {
                                    i3 = 22;
                                }
                            }
                            int i16 = iM187030r;
                            iM159427y = errorCode;
                            i3 = i16;
                        }
                    }
                } else if (!z) {
                    if (!z) {
                    }
                    if (cause instanceof zzsx) {
                        iM159427y = mpw0.m159427y(((zzsx) cause).zzd);
                        i3 = 13;
                    } else {
                        iM187030r = 14;
                        if (cause instanceof zzst) {
                            errorCode = mpw0.m159427y(((zzst) cause).zzb);
                        } else if (cause instanceof OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof zzpx) {
                            errorCode = ((zzpx) cause).zza;
                            iM187030r = 17;
                        } else if (cause instanceof zzqa) {
                            errorCode = ((zzqa) cause).zza;
                            iM187030r = 18;
                        } else {
                            int i17 = mpw0.f137957a;
                            if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iM187030r = m187030r(errorCode);
                            } else {
                                i3 = 22;
                            }
                        }
                        int i18 = iM187030r;
                        iM159427y = errorCode;
                        i3 = i18;
                    }
                } else {
                    if (!z) {
                    }
                    if (cause instanceof zzsx) {
                        iM159427y = mpw0.m159427y(((zzsx) cause).zzd);
                        i3 = 13;
                    } else {
                        iM187030r = 14;
                        if (cause instanceof zzst) {
                            errorCode = mpw0.m159427y(((zzst) cause).zzb);
                        } else if (cause instanceof OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof zzpx) {
                            errorCode = ((zzpx) cause).zza;
                            iM187030r = 17;
                        } else if (cause instanceof zzqa) {
                            errorCode = ((zzqa) cause).zza;
                            iM187030r = 18;
                        } else {
                            int i19 = mpw0.f137957a;
                            if (cause instanceof MediaCodec.CryptoException) {
                                errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                iM187030r = m187030r(errorCode);
                            } else {
                                i3 = 22;
                            }
                        }
                        int i110 = iM187030r;
                        iM159427y = errorCode;
                        i3 = i110;
                    }
                }
                this.f169794c.reportPlaybackErrorEvent(kwx.m151745a().setTimeSinceCreatedMillis(jElapsedRealtime - this.f169795d).setErrorCode(i3).setSubErrorCode(iM159427y).setException(zzceVar).build());
                this.f169817z = true;
                this.f169805n = null;
            }
            iM159427y = 0;
            this.f169794c.reportPlaybackErrorEvent(kwx.m151745a().setTimeSinceCreatedMillis(jElapsedRealtime - this.f169795d).setErrorCode(i3).setSubErrorCode(iM159427y).setException(zzceVar).build());
            this.f169817z = true;
            this.f169805n = null;
        }
        if (bgy0Var.m104289d(2)) {
            uhu0 uhu0VarZzo = oot0Var.zzo();
            boolean zM196125b = uhu0VarZzo.m196125b(2);
            boolean zM196125b2 = uhu0VarZzo.m196125b(1);
            boolean zM196125b3 = uhu0VarZzo.m196125b(3);
            if (zM196125b || zM196125b2) {
                if (!zM196125b) {
                    m187038w(jElapsedRealtime, null, 0);
                }
                if (!zM196125b2) {
                    m187035t(jElapsedRealtime, null, 0);
                }
                if (!zM196125b3) {
                    m187036u(jElapsedRealtime, null, 0);
                }
            } else if (zM196125b3) {
                zM196125b3 = true;
                if (!zM196125b) {
                    m187038w(jElapsedRealtime, null, 0);
                }
                if (!zM196125b2) {
                    m187035t(jElapsedRealtime, null, 0);
                }
                if (!zM196125b3) {
                    m187036u(jElapsedRealtime, null, 0);
                }
            }
        }
        if (m187040y(this.f169806o)) {
            sqr0 sqr0Var = this.f169806o.f158672a;
            if (sqr0Var.f170257r != -1) {
                m187038w(jElapsedRealtime, sqr0Var, 0);
                this.f169806o = null;
            }
        }
        if (m187040y(this.f169807p)) {
            m187035t(jElapsedRealtime, this.f169807p.f158672a, 0);
            this.f169807p = null;
        }
        if (m187040y(this.f169808q)) {
            m187036u(jElapsedRealtime, this.f169808q.f158672a, 0);
            this.f169808q = null;
        }
        switch (C2233o1.m13124b(this.f169792a).m13126a()) {
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
        if (i != this.f169804m) {
            this.f169804m = i;
            this.f169794c.reportNetworkEvent(gxx.m132927a().setNetworkType(i).setTimeSinceCreatedMillis(jElapsedRealtime - this.f169795d).build());
        }
        if (oot0Var.zzf() != 2) {
            this.f169812u = false;
        }
        if (((mfy0) oot0Var).m158182l() == null) {
            this.f169813v = false;
        } else if (bgy0Var.m104289d(10)) {
            this.f169813v = true;
        }
        int iZzf = oot0Var.zzf();
        if (this.f169812u) {
            i2 = 5;
        } else if (this.f169813v) {
            i2 = 13;
        } else {
            i2 = 4;
            if (iZzf == 4) {
                i2 = 11;
            } else if (iZzf == 2) {
                int i20 = this.f169803l;
                if (i20 == 0 || i20 == 2) {
                    i2 = 2;
                } else if (oot0Var.mo158176b()) {
                    i2 = oot0Var.zzg() != 0 ? 10 : 6;
                } else {
                    i2 = 7;
                }
            } else if (iZzf != 3) {
                i2 = (iZzf != 1 || this.f169803l == 0) ? this.f169803l : 12;
            } else if (oot0Var.mo158176b()) {
                i2 = oot0Var.zzg() != 0 ? 9 : 3;
            }
        }
        if (this.f169803l != i2) {
            this.f169803l = i2;
            this.f169817z = true;
            this.f169794c.reportPlaybackStateEvent(zvx.m221826a().setState(this.f169803l).setTimeSinceCreatedMillis(jElapsedRealtime - this.f169795d).build());
        }
        if (bgy0Var.m104289d(TXLiteAVCode.EVT_SW_ENCODER_START_SUCC)) {
            this.f169793b.mo168416a(bgy0Var.m104288c(TXLiteAVCode.EVT_SW_ENCODER_START_SUCC));
        }
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: f */
    public final void mo115772f(yfy0 yfy0Var, gzy0 gzy0Var) {
        kzy0 kzy0Var = yfy0Var.f199687d;
        if (kzy0Var == null) {
            return;
        }
        sqr0 sqr0Var = gzy0Var.f107254b;
        sqr0Var.getClass();
        qny0 qny0Var = new qny0(sqr0Var, 0, this.f169793b.mo168420e(yfy0Var.f199685b, kzy0Var));
        int i = gzy0Var.f107253a;
        if (i != 0) {
            if (i == 1) {
                this.f169807p = qny0Var;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f169808q = qny0Var;
                return;
            }
        }
        this.f169806o = qny0Var;
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: h */
    public final void mo115774h(yfy0 yfy0Var, int i, long j, long j2) {
        kzy0 kzy0Var = yfy0Var.f199687d;
        if (kzy0Var != null) {
            wny0 wny0Var = this.f169793b;
            d0u0 d0u0Var = yfy0Var.f199685b;
            HashMap map = this.f169799h;
            String strMo168420e = wny0Var.mo168420e(d0u0Var, kzy0Var);
            Long l2 = (Long) map.get(strMo168420e);
            Long l3 = (Long) this.f169798g.get(strMo168420e);
            this.f169799h.put(strMo168420e, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            this.f169798g.put(strMo168420e, Long.valueOf((l3 != null ? l3.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // p153l.uny0
    /* JADX INFO: renamed from: i */
    public final void mo187031i(yfy0 yfy0Var, String str, boolean z) {
        kzy0 kzy0Var = yfy0Var.f199687d;
        if ((kzy0Var == null || !kzy0Var.m152240b()) && str.equals(this.f169800i)) {
            m187034s();
        }
        this.f169798g.remove(str);
        this.f169799h.remove(str);
    }

    @Override // p153l.uny0
    /* JADX INFO: renamed from: k */
    public final void mo187032k(yfy0 yfy0Var, String str) {
        kzy0 kzy0Var = yfy0Var.f199687d;
        if (kzy0Var == null || !kzy0Var.m152240b()) {
            m187034s();
            this.f169800i = str;
            this.f169801j = rxx.m183570a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.2.1");
            m187037v(yfy0Var.f199685b, yfy0Var.f199687d);
        }
    }

    /* JADX INFO: renamed from: l */
    public final LogSessionId m187033l() {
        return this.f169794c.getSessionId();
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: m */
    public final void mo115776m(yfy0 yfy0Var, gnt0 gnt0Var, gnt0 gnt0Var2, int i) {
        if (i == 1) {
            this.f169812u = true;
            i = 1;
        }
        this.f169802k = i;
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: p */
    public final void mo115778p(yfy0 yfy0Var, vwx0 vwx0Var) {
        this.f169814w += vwx0Var.f186209g;
        this.f169815x += vwx0Var.f186207e;
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: q */
    public final void mo115779q(yfy0 yfy0Var, aou0 aou0Var) {
        qny0 qny0Var = this.f169806o;
        if (qny0Var != null) {
            sqr0 sqr0Var = qny0Var.f158672a;
            if (sqr0Var.f170257r == -1) {
                znr0 znr0VarM187559b = sqr0Var.m187559b();
                znr0VarM187559b.m220644C(aou0Var.f72646a);
                znr0VarM187559b.m220654i(aou0Var.f72647b);
                this.f169806o = new qny0(znr0VarM187559b.m220645D(), 0, qny0Var.f158674c);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m187034s() {
        PlaybackMetrics.Builder builder = this.f169801j;
        if (builder != null && this.f169817z) {
            builder.setAudioUnderrunCount(this.f169816y);
            this.f169801j.setVideoFramesDropped(this.f169814w);
            this.f169801j.setVideoFramesPlayed(this.f169815x);
            Long l2 = (Long) this.f169798g.get(this.f169800i);
            this.f169801j.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f169799h.get(this.f169800i);
            this.f169801j.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f169801j.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f169794c.reportPlaybackMetrics(this.f169801j.build());
        }
        this.f169801j = null;
        this.f169800i = null;
        this.f169816y = 0;
        this.f169814w = 0;
        this.f169815x = 0;
        this.f169809r = null;
        this.f169810s = null;
        this.f169811t = null;
        this.f169817z = false;
    }

    /* JADX INFO: renamed from: t */
    public final void m187035t(long j, @Nullable sqr0 sqr0Var, int i) {
        if (mpw0.m159408f(this.f169810s, sqr0Var)) {
            return;
        }
        int i2 = this.f169810s == null ? 1 : 0;
        this.f169810s = sqr0Var;
        m187039x(0, j, sqr0Var, i2);
    }

    /* JADX INFO: renamed from: u */
    public final void m187036u(long j, @Nullable sqr0 sqr0Var, int i) {
        if (mpw0.m159408f(this.f169811t, sqr0Var)) {
            return;
        }
        int i2 = this.f169811t == null ? 1 : 0;
        this.f169811t = sqr0Var;
        m187039x(2, j, sqr0Var, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    /* JADX INFO: renamed from: v */
    public final void m187037v(d0u0 d0u0Var, @Nullable kzy0 kzy0Var) {
        int iMo113457a;
        PlaybackMetrics.Builder builder = this.f169801j;
        if (kzy0Var == null || (iMo113457a = d0u0Var.mo113457a(kzy0Var.f129476a)) == -1) {
            return;
        }
        int i = 0;
        d0u0Var.mo107662d(iMo113457a, this.f169797f, false);
        d0u0Var.mo107663e(this.f169797f.f111930c, this.f169796e, 0L);
        zis0 zis0Var = this.f169796e.f191693c.f175939b;
        if (zis0Var != null) {
            int iM159389B = mpw0.m159389B(zis0Var.f204611a);
            if (iM159389B == 0) {
                i = 3;
            } else if (iM159389B != 1) {
                i = iM159389B != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        wyt0 wyt0Var = this.f169796e;
        if (wyt0Var.f191703m != -9223372036854775807L && !wyt0Var.f191701k && !wyt0Var.f191698h && !wyt0Var.m208629b()) {
            builder.setMediaDurationMillis(mpw0.m159396I(this.f169796e.f191703m));
        }
        builder.setPlaybackType(true != this.f169796e.m208629b() ? 1 : 2);
        this.f169817z = true;
    }

    /* JADX INFO: renamed from: w */
    public final void m187038w(long j, @Nullable sqr0 sqr0Var, int i) {
        if (mpw0.m159408f(this.f169809r, sqr0Var)) {
            return;
        }
        int i2 = this.f169809r == null ? 1 : 0;
        this.f169809r = sqr0Var;
        m187039x(1, j, sqr0Var, i2);
    }

    /* JADX INFO: renamed from: x */
    public final void m187039x(int i, long j, @Nullable sqr0 sqr0Var, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = vwx.m203821a(i).setTimeSinceCreatedMillis(j - this.f169795d);
        if (sqr0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = sqr0Var.f170250k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = sqr0Var.f170251l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = sqr0Var.f170248i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = sqr0Var.f170247h;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = sqr0Var.f170256q;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = sqr0Var.f170257r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = sqr0Var.f170264y;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = sqr0Var.f170265z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = sqr0Var.f170242c;
            if (str4 != null) {
                int i8 = mpw0.f137957a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = sqr0Var.f170258s;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f169817z = true;
        this.f169794c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* JADX INFO: renamed from: y */
    public final boolean m187040y(@Nullable qny0 qny0Var) {
        if (qny0Var != null) {
            return qny0Var.f158674c.equals(this.f169793b.zze());
        }
        return false;
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo115777o(yfy0 yfy0Var, int i) {
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo115767a(yfy0 yfy0Var, sqr0 sqr0Var, zwx0 zwx0Var) {
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo115768b(yfy0 yfy0Var, Object obj, long j) {
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void mo115773g(yfy0 yfy0Var, sqr0 sqr0Var, zwx0 zwx0Var) {
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo115775j(yfy0 yfy0Var, int i, long j) {
    }

    @Override // p153l.dgy0
    /* JADX INFO: renamed from: e */
    public final void mo115771e(yfy0 yfy0Var, bzy0 bzy0Var, gzy0 gzy0Var, IOException iOException, boolean z) {
    }
}
