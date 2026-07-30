package cn.shuzilm.core;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.asm.Opcodes;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.File;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;
import p149l.ohg0;

/* JADX INFO: loaded from: classes.dex */
public class AIClient {

    /* JADX INFO: renamed from: Y */
    private static long f3668Y = 0;

    /* JADX INFO: renamed from: Z */
    private static long f3669Z = 0;

    /* JADX INFO: renamed from: a */
    static int f3670a = 0;
    public static boolean isf = false;

    /* JADX INFO: renamed from: aa */
    private Context f3696aa;

    /* JADX INFO: renamed from: ab */
    private String f3697ab = null;

    /* JADX INFO: renamed from: ac */
    private final int f3698ac = 0;

    /* JADX INFO: renamed from: ad */
    private final int f3699ad = 1;

    /* JADX INFO: renamed from: ae */
    private final int f3700ae = 2;

    /* JADX INFO: renamed from: af */
    private final int f3701af = 3;

    /* JADX INFO: renamed from: ag */
    private final int f3702ag = 4;

    /* JADX INFO: renamed from: ah */
    private final int f3703ah = 5;

    /* JADX INFO: renamed from: ai */
    private final int f3704ai = 6;

    /* JADX INFO: renamed from: aj */
    private final int f3705aj = 7;

    /* JADX INFO: renamed from: ak */
    private final int f3706ak = 8;

    /* JADX INFO: renamed from: b */
    private static int[] f3671b = {245, 252, 251, 246, 252, 247, 228, 188, 246, 251, 253, 224, 246, 252, 243, 188, 255, 253, 241, 0};

    /* JADX INFO: renamed from: c */
    private static int[] f3672c = {230, 224, 243, 230, 225, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 215, 209, 219, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 192, 215, 193, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 192, 215, 219, 212, 219, Opcodes.IFNULL, 220, 215, 214, 219, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 193, 214, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 193, 223, 213, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 214, 219, 221, 192, 214, 220, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 215, 222, 213, 221, 221, 213, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 223, 221, 209, 0};

    /* JADX INFO: renamed from: d */
    private static int[] f3673d = {230, 248, 242, 187, 241, 252, 250, 231, 241, 251, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 187, 240, 249, 242, 250, 250, 242, 187, 248, 250, 246, 0};

    /* JADX INFO: renamed from: e */
    private static int[] f3674e = {166, 160, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 181, 177, 166, 144, 167, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 176, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 183, 177, 166, 181, 167, 130, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 237, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 162, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 177, 166, 183, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 237, 177, 166, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 165, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 183, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 166, 167, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 237, 176, 167, 162, 237, 176, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 237, 167, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 177, 167, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 162, 237, 166, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 237, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 160, 0};

    /* JADX INFO: renamed from: f */
    private static int[] f3675f = {218, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 169, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 218, 222, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 218, 222, 222, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 166, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 217, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 221, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 166, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 217, 169, 217, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 218, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 219, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 217, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 218, 0};

    /* JADX INFO: renamed from: g */
    private static int[] f3676g = {246, 227, 224, 247, 245, 218, 0};

    /* JADX INFO: renamed from: h */
    private static int[] f3677h = {234, 231, 249, 230, 160, 231, 235, 249, 239, 251, 230, 160, 227, 225, 237, 0};

    /* JADX INFO: renamed from: i */
    private static int[] f3678i = {230, 224, 234, 245, 241, 230, 240, 252, 240, 231, 234, 237, 230, 243, 236, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, Opcodes.IFNULL, 192, 202, 213, Opcodes.IFNULL, Opcodes.IFNONNULL, 205, Opcodes.IFNULL, Primes.SMALL_FACTOR_LIMIT, 204, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, 208, 202, Opcodes.IFNONNULL, 204, 214, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, 206, 204, 192, 0};

    /* JADX INFO: renamed from: j */
    private static int[] f3679j = {209, 215, 221, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNULL, 209, 231, Opcodes.IFNULL, 209, 221, 210, 221, 192, 218, 209, 208, 253, 209, 215, 221, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 209, 240, 218, 209, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 251, 154, 216, 208, 221, 213, 154, 209, 215, 221, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 209, 208, 218, 209, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 219, 154, Opcodes.IFNONNULL, 221, 208, 219, 193, 154, 217, 219, 215, 0};

    /* JADX INFO: renamed from: k */
    private static int[] f3680k = {243, 245, 255, 224, 228, 243, 229, 242, 255, 243, 245, 255, 224, 243, 242, 184, 255, 227, 236, 184, 251, 249, 245, 0};

    /* JADX INFO: renamed from: l */
    private static int[] f3681l = {CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 207, 208, 212, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 245, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 207, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 207, 208, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 226, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 207, 208, 212, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 213, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 207, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 207, 208, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 207, Primes.SMALL_FACTOR_LIMIT, 220, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 203, 201, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 0};

    /* JADX INFO: renamed from: m */
    private static int[] f3682m = {204, 202, 200, 207, 219, 204, 221, Opcodes.IFNONNULL, 224, 205, 192, 204, 202, 192, 223, 204, 237, 224, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, 204, 202, 192, 223, 219, 204, 218, 205, 192, 204, 202, 192, 223, 204, 205, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, 192, 220, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNULL, 202, 0};

    /* JADX INFO: renamed from: n */
    private static int[] f3683n = {221, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 167, 219, 220, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 220, 167, 222, 219, 166, 221, 220, 219, 166, 217, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 222, 219, 217, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 219, 222, 219, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 0};

    /* JADX INFO: renamed from: o */
    private static int[] f3684o = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 213, Primes.SMALL_FACTOR_LIMIT, 206, 209, 209, 212, 210, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 200, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 200, Opcodes.IFNONNULL, 200, 213, 207, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 200, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 210, 216, 210, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 213, 210, 200, 210, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 209, 0};

    /* JADX INFO: renamed from: p */
    private static int[] f3685p = {233, 255, 243, 238, 232, 255, 234, 245, 232, 202, 247, 255, 238, 233, 227, 201, 180, 233, 245, 180, 254, 243, 245, 232, 254, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 251, 0};

    /* JADX INFO: renamed from: q */
    private static int[] f3686q = {IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 249, 254, 245, 224, 255, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 224, 241, 228, 233, 245, 248, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256, 253, 255, 243, 0};

    /* JADX INFO: renamed from: r */
    private static int[] f3687r = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 201, 214, 210, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 243, 217, Opcodes.IFNULL, 201, 212, 206, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 233, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 201, 206, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 208, 207, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 208, 193, 212, 217, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 200, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 205, 207, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 0};

    /* JADX INFO: renamed from: s */
    private static int[] f3688s = {Opcodes.IFNONNULL, 202, 214, 204, 0};

    /* JADX INFO: renamed from: t */
    private static int[] f3689t = {220, 209, 246, 253, 232, 215, 209, 182, 252, 241, 246, 253, 232, 247, 182, 232, 249, 236, 225, 253, 240, 182, 245, 247, 251, 0};

    /* JADX INFO: renamed from: u */
    private static int[] f3690u = {226, 228, 238, 241, 245, 226, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 248, 227, 238, 248, 233, 226, 247, 232, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 206, 201, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 215, 200, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 215, Opcodes.IFNULL, Primes.SMALL_FACTOR_LIMIT, 222, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 207, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 202, 200, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 201, 200, 206, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNULL, 0};

    /* JADX INFO: renamed from: v */
    private static int[] f3691v = {234, 248, 230, 165, 248, 254, 248, 234, 165, 230, 228, 232, 0};

    /* JADX INFO: renamed from: w */
    private static int[] f3692w = {217, 212, 217, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 206, 206, 216, 222, 222, 220, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 243, 242, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 233, 254, 252, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 252, 238, 240, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 238, 232, 238, 252, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 240, 242, 254, 0};

    /* JADX INFO: renamed from: x */
    private static int[] f3693x = {216, 213, 216, 229, 238, 253, 232, 242, 249, 241, 249, 240, 236, 236, 233, 207, 178, 253, 239, 241, 178, 239, 233, 239, 253, 178, 241, 243, 255, 0};

    /* JADX INFO: renamed from: y */
    private static int[] f3694y = {209, 215, 221, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNULL, 209, 231, 240, 253, 240, 205, Opcodes.IFNULL, 213, 192, 218, 209, 217, 209, 216, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 193, 231, 154, 240, 253, 240, 205, Opcodes.IFNULL, 213, 192, 218, 209, 217, 209, 216, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 193, 231, 154, 213, Opcodes.IFNONNULL, 217, 154, Opcodes.IFNONNULL, 193, Opcodes.IFNONNULL, 213, 154, 217, 219, 215, 0};

    /* JADX INFO: renamed from: z */
    private static int[] f3695z = {203, 205, 207, 200, 220, 203, 218, 192, 231, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 202, Opcodes.IFNONNULL, 239, 202, Opcodes.IFNONNULL, 234, 231, 128, 234, 231, 234, 215, 220, 207, 218, 192, 203, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 203, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 222, 222, 219, 253, 128, 207, 221, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 128, 221, 219, 221, 207, 128, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 193, 205, 0};

    /* JADX INFO: renamed from: A */
    private static int[] f3644A = {Opcodes.IFNONNULL, 193, 203, 212, 208, Opcodes.IFNONNULL, 209, Opcodes.IFNULL, 203, Opcodes.IFNONNULL, 193, 203, 212, Opcodes.IFNONNULL, Opcodes.IFNULL, 140, Opcodes.IFNULL, 203, 205, 208, Opcodes.IFNULL, 204, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 140, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 204, 215, 209, 207, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 209, 140, 207, 205, 193, 0};

    /* JADX INFO: renamed from: B */
    private static int[] f3645B = {215, 209, 219, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 192, 215, 225, 214, 251, 215, 209, 219, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 215, 246, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 215, 209, 219, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 192, 215, 193, 214, 219, 215, 209, 219, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 215, 214, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 214, 219, 221, 192, 214, 220, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 213, 220, Opcodes.IFNONNULL, 193, 223, Primes.SMALL_FACTOR_LIMIT, 193, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 223, 221, 209, 0};

    /* JADX INFO: renamed from: C */
    private static int[] f3646C = {214, 208, 218, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 193, 214, 224, 215, 250, 214, 208, 218, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 214, 247, 250, 157, 214, 208, 218, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 193, 214, 192, 215, 218, 214, 208, 218, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 214, 215, 157, 215, 218, 220, 193, 215, 221, 210, 157, 212, 221, Opcodes.IFNULL, 192, 222, 210, 192, 157, 222, 220, 208, 0};

    /* JADX INFO: renamed from: D */
    private static int[] f3647D = {140, 200, Opcodes.IFNONNULL, 208, Opcodes.IFNONNULL, 202, 205, Opcodes.IFNULL, Primes.SMALL_FACTOR_LIMIT, 204, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, Opcodes.IFNULL, 206, 218, 207, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, 214, 217, 202, Opcodes.IFNULL, 206, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, 206, 204, 192, 140, 140, 153, 215, 205, Opcodes.IFNULL, 215, 205, 204, 192, 0};

    /* JADX INFO: renamed from: E */
    private static int[] f3648E = {243, 252, 235, 252, 241, 246, 253, 232, 247, 182, 253, 245, 225, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 254, 182, 237, 226, 241, 253, 245, 182, 245, 247, 251, 0};

    /* JADX INFO: renamed from: F */
    private static int[] f3649F = {218, 215, 202, 215, 205, Opcodes.IFNULL, Opcodes.IFNONNULL, 202, 140, 218, 215, 202, 215, 205, Opcodes.IFNULL, Opcodes.IFNONNULL, 202, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 202, 193, 214, 205, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, 205, 192, 140, 140, 153, 215, 205, Opcodes.IFNULL, 215, 205, 204, 192, 0};

    /* JADX INFO: renamed from: G */
    private static int[] f3650G = {205, 209, 204, 232, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 200, 215, 206, Primes.SMALL_FACTOR_LIMIT, 241, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 232, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 205, 209, 204, 200, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 200, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 200, 206, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 207, 192, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 204, 206, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 0};

    /* JADX INFO: renamed from: H */
    private static int[] f3651H = {234, 248, 230, 165, 239, 226, 239, 230, 165, 230, 228, 232, 0};

    /* JADX INFO: renamed from: I */
    private static int[] f3652I = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 201, 214, 210, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 243, 204, 235, 193, Primes.SMALL_FACTOR_LIMIT, 237, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 201, 214, 210, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 193, Primes.SMALL_FACTOR_LIMIT, 205, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 201, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 205, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 205, 207, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 0};

    /* JADX INFO: renamed from: J */
    private static int[] f3653J = {250, 252, 246, 233, 237, 250, 236, 177, 235, 237, 254, 235, 236, 177, 241, 240, 246, 235, 252, 254, 177, 254, 236, 242, 177, 241, 234, 253, 177, 242, 240, 252, 0};

    /* JADX INFO: renamed from: K */
    private static int[] f3654K = {253, 245, 249, 246, 255, 243, 232, 182, 245, 249, 234, 249, 232, 182, 249, 235, 245, 182, 246, 237, 250, 182, 245, 247, 251, 0};

    /* JADX INFO: renamed from: L */
    private static int[] f3655L = {237, 252, 234, 247, 240, 247, 236, 235, 183, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 248, 235, 248, 233, 183, 248, 234, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 183, 247, 236, 251, 183, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 246, 250, 0};

    /* JADX INFO: renamed from: M */
    private static int[] f3656M = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 201, 214, 210, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 243, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 233, 193, Primes.SMALL_FACTOR_LIMIT, 237, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 201, 214, 210, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 193, Primes.SMALL_FACTOR_LIMIT, 205, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 201, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 205, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 205, 207, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 0};

    /* JADX INFO: renamed from: N */
    private static int[] f3657N = {CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 201, 214, 210, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, Primes.SMALL_FACTOR_LIMIT, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 207, 212, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 206, 201, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 206, 207, 201, 212, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 193, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 193, Primes.SMALL_FACTOR_LIMIT, 205, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 206, 213, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 205, 207, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 0};

    /* JADX INFO: renamed from: O */
    private static int[] f3658O = {252, 250, 248, 255, 235, 252, 237, 247, 208, 253, 208, 248, 234, 212, 183, 251, 240, 245, 183, 247, 236, 251, 183, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 246, 250, 0};

    /* JADX INFO: renamed from: P */
    private static int[] f3659P = {250, 237, 251, 234, 225, 252, 254, 160, 231, 251, 253, 253, 160, 225, 252, 0};

    /* JADX INFO: renamed from: Q */
    private static int[] f3660Q = {202, 214, 208, 208, 0};

    /* JADX INFO: renamed from: R */
    private static int[] f3661R = {212, 200, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 202, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 213, 193, 0};

    /* JADX INFO: renamed from: S */
    private static int[] f3662S = {248, 241, 246, 245, 248, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 241, 249, 241, 241, 230, 242, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 240, 248, 253, 225, 246, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, 251, 230, 0};

    /* JADX INFO: renamed from: T */
    private static int[] f3663T = {238, 232, 245, 234, 234, 239, 233, 254, 243, 255, 249, 243, 236, 255, 254, 180, 254, 251, 234, 246, 245, 245, 249, 180, 247, 245, 249, 0};

    /* JADX INFO: renamed from: U */
    private static int[] f3664U = {207, 201, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 220, 216, 207, 249, 206, 227, 207, 201, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 220, 207, 238, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 222, 216, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 218, 218, 223, 217, 206, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 207, 201, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256, 220, 207, 206, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, 206, 203, 218, Opcodes.IFNULL, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 201, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA, Opcodes.IFNONNULL, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 201, 0};

    /* JADX INFO: renamed from: V */
    private static int[] f3665V = {217, 206, 204, 202, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 202, 230, 207, 226, 206, 200, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 221, 206, 239, 226, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 223, 217, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 219, 219, 222, 216, 207, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 206, 200, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 221, 206, 207, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 207, 202, 219, Opcodes.IFNONNULL, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 200, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, Opcodes.IFNULL, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 200, 0};

    /* JADX INFO: renamed from: W */
    private static int[] f3666W = {204, 202, 192, 223, 219, 204, 250, 237, 224, 232, 230, 224, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, 205, 192, 200, Opcodes.IFNULL, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, 204, 202, 192, 223, 219, 204, 218, 205, 220, Opcodes.IFNULL, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 202, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, 219, Opcodes.IFNULL, Opcodes.IFNONNULL, Opcodes.IFNULL, 193, 192, 193, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, Opcodes.IFNULL, 202, 0};

    /* JADX INFO: renamed from: X */
    private static int[] f3667X = {169, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 221, 166, 167, 166, 220, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 169, 219, 169, 166, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 217, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 169, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 169, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 218, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 221, 166, 169, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 166, 218, 220, 166, 0};

    /* JADX INFO: renamed from: cn.shuzilm.core.AIClient$AC */
    final class ServiceConnectionC0803AC implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        boolean f3709a;

        /* JADX INFO: renamed from: b */
        private final LinkedBlockingQueue f3710b;

        private ServiceConnectionC0803AC() {
            this.f3709a = false;
            this.f3710b = new LinkedBlockingQueue(1);
        }

        public IBinder getBinder() {
            if (this.f3709a) {
                ohg0.m164364a();
                return null;
            }
            this.f3709a = true;
            return (IBinder) this.f3710b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AIClient.m4650b(this.f3710b, iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: cn.shuzilm.core.AIClient$AI */
    final class C0804AI implements IInterface {

        /* JADX INFO: renamed from: b */
        private IBinder f3712b;

        /* JADX INFO: renamed from: c */
        private String f3713c;

        /* JADX INFO: renamed from: d */
        private int f3714d;

        public C0804AI(IBinder iBinder, String str, int i) {
            this.f3712b = iBinder;
            this.f3713c = str;
            this.f3714d = i;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f3712b;
        }

        public String getId() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            String string = null;
            try {
                String str = this.f3713c;
                if (str != null && this.f3714d >= 0) {
                    parcelObtain.writeInterfaceToken(str);
                    this.f3712b.transact(this.f3714d, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    string = parcelObtain2.readString();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return string;
                }
                return null;
            } catch (Throwable unused) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    final class AIO implements IInterface {

        /* JADX INFO: renamed from: b */
        private IBinder f3716b;

        /* JADX INFO: renamed from: c */
        private String f3717c;

        public AIO(IBinder iBinder, String str) {
            this.f3716b = iBinder;
            this.f3717c = str;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f3716b;
        }

        public String getId(String str, String str2, String str3) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            String string = null;
            try {
                String str4 = this.f3717c;
                if (str4 == null) {
                    return null;
                }
                parcelObtain.writeInterfaceToken(str4);
                parcelObtain.writeString(str);
                parcelObtain.writeString(str2);
                parcelObtain.writeString(str3);
                this.f3716b.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable unused) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return string;
        }
    }

    /* JADX INFO: renamed from: cn.shuzilm.core.AIClient$HI */
    interface InterfaceC0806HI {

        /* JADX INFO: renamed from: cn.shuzilm.core.AIClient$HI$u */
        public abstract class u extends Binder implements InterfaceC0806HI {

            /* JADX INFO: renamed from: cn.shuzilm.core.AIClient$HI$u$d */
            public class d implements InterfaceC0806HI {

                /* JADX INFO: renamed from: a */
                private IBinder f3723a;

                public d(IBinder iBinder) {
                    this.f3723a = iBinder;
                }

                @Override // cn.shuzilm.core.AIClient.InterfaceC0806HI
                /* JADX INFO: renamed from: b */
                public void mo4678b(HII.AbstractBinderC0807OI abstractBinderC0807OI) {
                    Parcel parcelObtain = Parcel.obtain();
                    Parcel parcelObtain2 = Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
                        parcelObtain.writeStrongBinder(abstractBinderC0807OI);
                        this.f3723a.transact(2, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                    } catch (Throwable th) {
                        try {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            th.printStackTrace();
                        } finally {
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        void mo4678b(HII.AbstractBinderC0807OI abstractBinderC0807OI);
    }

    public interface HII extends IInterface {

        /* JADX INFO: renamed from: cn.shuzilm.core.AIClient$HII$OI */
        public abstract class AbstractBinderC0807OI extends Binder implements HII {

            /* JADX INFO: renamed from: a */
            String f3724a = "com.hihonor.cloudservice.oaid.IOAIDCallBack";

            public AbstractBinderC0807OI() {
                attachInterface(this, "com.hihonor.cloudservice.oaid.IOAIDCallBack");
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this;
            }

            @Override // android.os.Binder
            public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
                if (i == 2) {
                    try {
                        parcel.enforceInterface(this.f3724a);
                        mo4679go(parcel.readInt(), parcel.readInt() == 0 ? null : (Bundle) Bundle.CREATOR.createFromParcel(parcel));
                        parcel2.writeNoException();
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        /* JADX INFO: renamed from: go */
        void mo4679go(int i, Bundle bundle);
    }

    final class HNO implements IInterface {

        /* JADX INFO: renamed from: b */
        private IBinder f3726b;

        public HNO(IBinder iBinder) {
            this.f3726b = iBinder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f3726b;
        }

        public void getID() {
            try {
                IBinder iBinder = this.f3726b;
                if (iBinder == null) {
                    return;
                }
                Object objQueryLocalInterface = iBinder.queryLocalInterface(AIClient.this.m4640a(AIClient.f3666W));
                ((objQueryLocalInterface == null || !(objQueryLocalInterface instanceof InterfaceC0806HI.u.d)) ? new InterfaceC0806HI.u.d(this.f3726b) : (InterfaceC0806HI.u.d) objQueryLocalInterface).mo4678b(AIClient.this.new gid());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class gid extends HII.AbstractBinderC0807OI {
        public gid() {
        }

        @Override // cn.shuzilm.core.AIClient.HII
        /* JADX INFO: renamed from: go */
        public void mo4679go(int i, Bundle bundle) {
            try {
                String string = bundle.getString(AIClient.this.m4640a(new int[]{238, 232, 229, 239, 214, 237, 224, 214, 232, 230, 0}));
                AIClient aIClient = AIClient.this;
                aIClient.m4642a(string, aIClient.m4640a(AIClient.f3667X));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public AIClient(Context context) {
        this.f3696aa = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    private void m4644a(String str, String str2, String str3, String str4, String str5, int i) {
        Intent intent;
        Intent intent2;
        C0804AI c0804ai;
        try {
            Intent intent3 = null;
            ServiceConnectionC0803AC serviceConnectionC0803AC = new ServiceConnectionC0803AC();
            if (i == 0) {
                Intent intent4 = new Intent(str2);
                intent4.setPackage(str3);
                intent3 = intent4;
            } else {
                if (i == 1) {
                    intent2 = new Intent();
                    intent2.setClassName(str, str2);
                } else if (i == 2) {
                    intent3 = new Intent();
                    intent3.setComponent(new ComponentName(str, str2));
                    intent3.setAction(str3);
                } else {
                    if (i == 3) {
                        intent = new Intent();
                        intent.setAction(str3);
                        intent.setComponent(new ComponentName(str, str));
                    } else if (i == 6) {
                        intent3 = new Intent();
                        intent3.setClassName(str, str2);
                        intent3.setAction(str3);
                        intent3.putExtra(m4640a(f3654K), this.f3696aa.getApplicationInfo().packageName);
                    } else if (i == 7) {
                        intent2 = new Intent();
                        intent2.setComponent(new ComponentName(str, str2));
                    } else if (i == 8) {
                        intent = new Intent();
                        intent.setAction(str3);
                        intent.setPackage(str);
                    }
                    intent3 = intent;
                }
                intent3 = intent2;
            }
            if (this.f3696aa.bindService(intent3, serviceConnectionC0803AC, 1)) {
                try {
                    if (i == 2) {
                        try {
                            Thread.sleep(100L);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        String id = new AIO(serviceConnectionC0803AC.getBinder(), str4).getId(this.f3696aa.getPackageName(), m4658e(), m4640a(f3688s));
                        if (id != null) {
                            m4642a(id, str5);
                        }
                    } else if (i == 8) {
                        new HNO(serviceConnectionC0803AC.getBinder()).getID();
                    } else {
                        if (i == 3 || i == 6) {
                            c0804ai = new C0804AI(serviceConnectionC0803AC.getBinder(), str4, 3);
                        } else {
                            c0804ai = i == 7 ? new C0804AI(serviceConnectionC0803AC.getBinder(), str4, 2) : new C0804AI(serviceConnectionC0803AC.getBinder(), str4, 1);
                        }
                        String id2 = c0804ai.getId();
                        if (id2 != null) {
                            m4642a(id2, str5);
                        }
                    }
                } catch (Throwable unused) {
                }
                this.f3696aa.unbindService(serviceConnectionC0803AC);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m4651b(String str, int i) {
        String absolutePath;
        int iLastIndexOf;
        boolean zExists = false;
        try {
            File externalFilesDir = this.f3696aa.getExternalFilesDir(null);
            zExists = new File(((externalFilesDir == null || (iLastIndexOf = (absolutePath = externalFilesDir.getAbsolutePath()).lastIndexOf("/data/")) == -1) ? "" : absolutePath.substring(0, iLastIndexOf).concat("/data/")) + str).exists();
        } catch (Exception unused) {
        }
        if (zExists) {
            return true;
        }
        return m4654c(str, i);
    }

    /* JADX INFO: renamed from: c */
    private String m4653c(String str) {
        try {
            SharedPreferences sharedPreferences = this.f3696aa.getSharedPreferences(this.f3696aa.getPackageName() + m4640a(f3676g), 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.remove(str);
                editorEdit.apply();
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    private String m4656d(String str) {
        if (str == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(m4640a(f3685p));
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private String m4658e() {
        Signature[] signatureArr;
        if (this.f3697ab == null) {
            try {
                signatureArr = this.f3696aa.getPackageManager().getPackageInfo(this.f3696aa.getPackageName(), 64).signatures;
            } catch (Exception unused) {
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
                        }
                        this.f3697ab = sb.toString();
                    }
                } catch (Exception unused2) {
                }
            }
        }
        return this.f3697ab;
    }

    /* JADX INFO: renamed from: f */
    private void m4660f() {
        try {
            int[] iArr = {226, 239, 231, 201, 242, 227, 225, 0};
            int[] iArr2 = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 167, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 218, 220, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 218, 219, 219, 217, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 220, 169, 169, 167, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 167, 220, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 218, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 217, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 221, 166, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 0};
            Object systemService = this.f3696aa.getSystemService(m4640a(new int[]{255, 232, 251, 255, 232, 254, 236, 254, 224, 210, 224, 248, 251, 226, 0}));
            if (systemService == null) {
                return;
            }
            String str = (String) systemService.getClass().getDeclaredMethod(m4640a(iArr), null).invoke(systemService, null);
            if (f3679j == null) {
                return;
            }
            m4642a(str, m4640a(iArr2));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private void m4662g() {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) this.f3696aa.getSystemService("keyguard");
            m4642a((String) keyguardManager.getClass().getDeclaredMethod(m4640a(new int[]{237, 224, 232, Opcodes.IFNULL, 231, 224, 232, 253, 235, 230, 0}), null).invoke(keyguardManager, null), m4640a(new int[]{221, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 220, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 220, 166, 220, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 220, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 167, 221, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 166, 222, 222, 219, 221, 219, 218, 221, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 222, 219, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 0}));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    private void m4663h() {
        try {
            Class<?> cls = Class.forName(m4640a(f3650G));
            m4642a((String) cls.getMethod(m4640a(new int[]{CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 207, Opcodes.IFNONNULL, 201, 242, 227, 225, 0}), Context.class).invoke(cls.newInstance(), this.f3696aa), m4640a(new int[]{CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 217, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 221, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 222, 222, 218, 220, 220, 169, 219, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 222, 219, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 169, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 169, 219, 166, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 166, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 0}));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    private boolean m4664i() {
        if (f3668Y == 0) {
            f3668Y = System.currentTimeMillis() / 1000;
            return true;
        }
        if ((System.currentTimeMillis() / 1000) - f3668Y <= 10) {
            return false;
        }
        f3668Y = System.currentTimeMillis() / 1000;
        return true;
    }

    /* JADX INFO: renamed from: j */
    private boolean m4665j() {
        if (f3669Z == 0) {
            f3669Z = System.currentTimeMillis() / 1000;
            return true;
        }
        if ((System.currentTimeMillis() / 1000) - f3669Z <= 5) {
            return false;
        }
        f3669Z = System.currentTimeMillis() / 1000;
        return true;
    }

    /* JADX INFO: renamed from: k */
    private boolean m4666k() {
        String strM4656d = m4656d(m4640a(f3684o));
        return !TextUtils.isEmpty(strM4656d) && strM4656d.equals("1");
    }

    /* JADX INFO: renamed from: l */
    private boolean m4667l() {
        String strM4656d = m4656d(m4640a(f3662S));
        return !TextUtils.isEmpty(strM4656d) && strM4656d.equalsIgnoreCase(m4640a(f3661R));
    }

    /* JADX INFO: renamed from: n */
    private boolean m4668n() {
        String strM4656d = m4656d(m4640a(f3659P));
        return (TextUtils.isEmpty(strM4656d) || strM4656d.equalsIgnoreCase("unknown")) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    private boolean m4669o() {
        PackageManager packageManager;
        try {
            return (!m4661f("<48ID") || (packageManager = this.f3696aa.getPackageManager()) == null || packageManager.resolveContentProvider(m4640a(f3648E), 0) == null) ? false : true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    private boolean m4670p() {
        try {
            if (!m4661f("=D180")) {
                return false;
            }
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.f3696aa.getContentResolver().acquireUnstableContentProviderClient(Uri.parse(m4640a(f3649F)));
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("isSupport", null, null);
            if (bundleCall != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
                if (bundleCall.getInt("code", -1) == 0) {
                    return bundleCall.getBoolean("isSupport", true);
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    private void m4671q() {
        Intent intent = new Intent();
        intent.setClassName(m4640a(f3651H), m4640a(f3652I));
        intent.setAction(m4640a(f3653J));
        intent.putExtra(m4640a(f3654K), this.f3696aa.getApplicationInfo().packageName);
        try {
            intent.putExtra(m4640a(f3655L), true);
            this.f3696aa.startService(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x079f A[Catch: Exception -> 0x079d, TryCatch #12 {Exception -> 0x079d, blocks: (B:100:0x0763, B:102:0x0770, B:104:0x077a, B:106:0x0796, B:113:0x07af, B:115:0x07b5, B:116:0x07bf, B:111:0x079f), top: B:181:0x0763 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x07bf A[Catch: Exception -> 0x079d, TRY_LEAVE, TryCatch #12 {Exception -> 0x079d, blocks: (B:100:0x0763, B:102:0x0770, B:104:0x077a, B:106:0x0796, B:113:0x07af, B:115:0x07b5, B:116:0x07bf, B:111:0x079f), top: B:181:0x0763 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:124:0x07f6 A[Catch: Exception -> 0x086a, TRY_LEAVE, TryCatch #8 {Exception -> 0x086a, blocks: (B:122:0x07ea, B:124:0x07f6), top: B:174:0x07ea }] */
    /* JADX WARN: Code duplicated, block: B:137:0x08b8 A[Catch: Exception -> 0x08f6, TryCatch #10 {Exception -> 0x08f6, blocks: (B:125:0x086a, B:127:0x0876, B:129:0x087c, B:131:0x0884, B:133:0x088c, B:136:0x0895, B:137:0x08b8, B:139:0x08c4, B:141:0x08d4), top: B:178:0x086a }] */
    /* JADX WARN: Code duplicated, block: B:139:0x08c4 A[Catch: Exception -> 0x08f6, TryCatch #10 {Exception -> 0x08f6, blocks: (B:125:0x086a, B:127:0x0876, B:129:0x087c, B:131:0x0884, B:133:0x088c, B:136:0x0895, B:137:0x08b8, B:139:0x08c4, B:141:0x08d4), top: B:178:0x086a }] */
    /* JADX WARN: Code duplicated, block: B:141:0x08d4 A[Catch: Exception -> 0x08f6, TRY_LEAVE, TryCatch #10 {Exception -> 0x08f6, blocks: (B:125:0x086a, B:127:0x0876, B:129:0x087c, B:131:0x0884, B:133:0x088c, B:136:0x0895, B:137:0x08b8, B:139:0x08c4, B:141:0x08d4), top: B:178:0x086a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x02b7 A[Catch: Exception -> 0x032f, TRY_LEAVE, TryCatch #3 {Exception -> 0x032f, blocks: (B:49:0x02af, B:51:0x02b7), top: B:164:0x02af }] */
    /* JADX WARN: Code duplicated, block: B:59:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x03d4  */
    public void asynAI(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int[] iArr2;
        String string;
        String str;
        if (isOaidCollectAllowed(i)) {
            isf = false;
            if (f3670a > 0) {
                return;
            }
            if (m4666k() && m4664i()) {
                m4642a(new C0805AO(this.f3696aa).m4675a(4), m4640a(new int[]{222, 167, 217, 167, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 217, 220, 222, 219, 166, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 221, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 220, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 217, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 221, 221, 219, 218, 222, 221, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 219, 0}));
            }
            try {
                if (m4661f(";4=>E>") && m4647a(m4640a(f3680k), 0)) {
                    m4644a(m4640a(f3680k), m4640a(f3681l), null, m4640a(f3682m), m4640a(f3683n), 1);
                }
            } catch (Exception unused) {
            }
            char c = 24;
            char c2 = 23;
            char c3 = 22;
            char c4 = 21;
            int i7 = 7;
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (m4661f("<>C>A>;0") && m4647a(m4640a(f3680k), 0)) {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                i7 = 7;
                                                                                c = 24;
                                                                                c2 = 23;
                                                                                c3 = 22;
                                                                                c4 = 21;
                                                                                i6 = 3;
                                                                                i3 = 25;
                                                                                i4 = 11;
                                                                                i2 = 15;
                                                                                i5 = 5;
                                                                                try {
                                                                                    m4644a(m4640a(f3680k), m4640a(f3681l), null, m4640a(f3682m), m4640a(new int[]{CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 221, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 169, 167, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 222, 222, 217, 217, 222, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 221, 167, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 222, 217, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 220, 219, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 218, 169, 222, 217, 0}), 1);
                                                                                } catch (Exception unused2) {
                                                                                }
                                                                            } catch (Exception unused3) {
                                                                                i7 = 7;
                                                                                c = 24;
                                                                                c2 = 23;
                                                                                c3 = 22;
                                                                                c4 = 21;
                                                                                i3 = 25;
                                                                                i4 = 11;
                                                                                i2 = 15;
                                                                                i5 = 5;
                                                                                i6 = 3;
                                                                            }
                                                                        } catch (Exception unused4) {
                                                                            i3 = 25;
                                                                            i2 = 15;
                                                                            i4 = 11;
                                                                        }
                                                                    } catch (Exception unused5) {
                                                                        i2 = 15;
                                                                        i3 = 25;
                                                                    }
                                                                    if ((m4661f(">??>") || m4661f("A40;<4")) && m4647a(m4640a(f3686q), 0)) {
                                                                        int[] iArr3 = new int[33];
                                                                        iArr3[0] = 222;
                                                                        iArr3[1] = 174;
                                                                        iArr3[2] = 168;
                                                                        iArr3[i6] = 169;
                                                                        iArr3[4] = 219;
                                                                        iArr3[i5] = 170;
                                                                        iArr3[6] = 175;
                                                                        iArr3[i7] = 221;
                                                                        iArr3[8] = 218;
                                                                        iArr3[9] = 221;
                                                                        iArr3[10] = 170;
                                                                        iArr3[i4] = 218;
                                                                        iArr3[12] = 170;
                                                                        iArr3[13] = 168;
                                                                        iArr3[14] = 173;
                                                                        iArr3[i2] = 169;
                                                                        iArr3[16] = 217;
                                                                        iArr3[17] = 169;
                                                                        iArr3[18] = 174;
                                                                        iArr3[19] = 166;
                                                                        iArr3[20] = 175;
                                                                        iArr3[c4] = 171;
                                                                        iArr3[c3] = 220;
                                                                        iArr3[c2] = 168;
                                                                        iArr3[c] = 172;
                                                                        iArr3[i3] = 220;
                                                                        iArr3[26] = 222;
                                                                        iArr3[27] = 166;
                                                                        iArr3[28] = 175;
                                                                        iArr3[29] = 167;
                                                                        iArr3[30] = 170;
                                                                        iArr3[31] = 170;
                                                                        iArr3[32] = 0;
                                                                        m4644a(m4640a(f3686q), m4640a(f3687r), m4640a(f3690u), m4640a(f3689t), m4640a(iArr3), 2);
                                                                    }
                                                                    if (m4661f(">=4?;DB") && m4647a(m4640a(f3686q), 2)) {
                                                                        int[] iArr4 = new int[33];
                                                                        iArr4[0] = 173;
                                                                        iArr4[1] = 169;
                                                                        iArr4[2] = 167;
                                                                        iArr4[i6] = 217;
                                                                        iArr4[4] = 219;
                                                                        iArr4[i5] = 219;
                                                                        iArr4[6] = 218;
                                                                        iArr4[i7] = 221;
                                                                        iArr4[8] = 220;
                                                                        iArr4[9] = 167;
                                                                        iArr4[10] = 218;
                                                                        iArr4[i4] = 220;
                                                                        iArr4[12] = 217;
                                                                        iArr4[13] = 167;
                                                                        iArr4[14] = 222;
                                                                        iArr4[i2] = 169;
                                                                        iArr4[16] = 172;
                                                                        iArr4[17] = 172;
                                                                        iArr4[18] = 220;
                                                                        iArr4[19] = 217;
                                                                        iArr4[20] = 219;
                                                                        iArr4[c4] = 217;
                                                                        iArr4[c3] = 172;
                                                                        iArr4[c2] = 168;
                                                                        iArr4[c] = 221;
                                                                        iArr4[i3] = 168;
                                                                        iArr4[26] = 221;
                                                                        iArr4[27] = 173;
                                                                        iArr4[28] = 167;
                                                                        iArr4[29] = 175;
                                                                        iArr4[30] = 171;
                                                                        iArr4[31] = 166;
                                                                        iArr4[32] = 0;
                                                                        m4644a(m4640a(f3686q), m4640a(f3687r), m4640a(f3690u), m4640a(f3689t), m4640a(iArr4), 2);
                                                                    }
                                                                    if (m4661f("0BDB")) {
                                                                        int[] iArr5 = new int[33];
                                                                        iArr5[0] = 217;
                                                                        iArr5[1] = 170;
                                                                        iArr5[2] = 217;
                                                                        iArr5[i6] = 218;
                                                                        iArr5[4] = 166;
                                                                        iArr5[i5] = 174;
                                                                        iArr5[6] = 221;
                                                                        iArr5[i7] = 222;
                                                                        iArr5[8] = 174;
                                                                        iArr5[9] = 167;
                                                                        iArr5[10] = 171;
                                                                        iArr5[i4] = 174;
                                                                        iArr5[12] = 173;
                                                                        iArr5[13] = 217;
                                                                        iArr5[14] = 221;
                                                                        iArr5[i2] = 170;
                                                                        iArr5[16] = 171;
                                                                        iArr5[17] = 169;
                                                                        iArr5[18] = 217;
                                                                        iArr5[19] = 221;
                                                                        iArr5[20] = 171;
                                                                        iArr5[c4] = 166;
                                                                        iArr5[c3] = 167;
                                                                        iArr5[c2] = 171;
                                                                        iArr5[c] = 173;
                                                                        iArr5[i3] = 218;
                                                                        iArr5[26] = 170;
                                                                        iArr5[27] = 217;
                                                                        iArr5[28] = 172;
                                                                        iArr5[29] = 167;
                                                                        iArr5[30] = 170;
                                                                        iArr5[31] = 171;
                                                                        iArr5[32] = 0;
                                                                        m4644a(m4640a(f3693x), m4640a(f3694y), m4640a(f3692w), m4640a(f3695z), m4640a(iArr5), 3);
                                                                    }
                                                                    if (m4661f("B0<BD=6") && m4647a(m4640a(f3644A), 0)) {
                                                                        int[] iArr6 = new int[33];
                                                                        iArr6[0] = 175;
                                                                        iArr6[1] = 220;
                                                                        iArr6[2] = 167;
                                                                        iArr6[i6] = 172;
                                                                        iArr6[4] = 175;
                                                                        iArr6[i5] = 219;
                                                                        iArr6[6] = 170;
                                                                        iArr6[i7] = 173;
                                                                        iArr6[8] = 173;
                                                                        iArr6[9] = 222;
                                                                        iArr6[10] = 175;
                                                                        iArr6[i4] = 219;
                                                                        iArr6[12] = 168;
                                                                        iArr6[13] = 219;
                                                                        iArr6[14] = 217;
                                                                        iArr6[i2] = 170;
                                                                        iArr6[16] = 221;
                                                                        iArr6[17] = 167;
                                                                        iArr6[18] = 218;
                                                                        iArr6[19] = 175;
                                                                        iArr6[20] = 172;
                                                                        iArr6[c4] = 218;
                                                                        iArr6[c3] = 217;
                                                                        iArr6[c2] = 218;
                                                                        iArr6[c] = 221;
                                                                        iArr6[i3] = 219;
                                                                        iArr6[26] = 217;
                                                                        iArr6[27] = 217;
                                                                        iArr6[28] = 172;
                                                                        iArr6[29] = 173;
                                                                        iArr6[30] = 221;
                                                                        iArr6[31] = 174;
                                                                        iArr6[32] = 0;
                                                                        m4644a(m4640a(f3644A), m4640a(f3645B), null, m4640a(f3646C), m4640a(iArr6), 1);
                                                                    }
                                                                    if (m4669o()) {
                                                                        m4642a(new C0805AO(this.f3696aa).m4675a(i5), m4640a(new int[]{CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 166, 222, 169, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 167, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 222, 218, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 218, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 169, 217, 167, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 222, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 217, 169, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 219, 221, 219, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 221, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 0}));
                                                                    }
                                                                    if (m4670p()) {
                                                                        m4642a(new C0805AO(this.f3696aa).m4674a(), m4640a(new int[]{220, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 218, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 217, 220, 219, 218, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 167, 169, 221, 169, 222, 166, 218, 220, 222, 217, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 167, 219, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 221, 218, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 221, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 0}));
                                                                    }
                                                                    if (m4661f("IC4") && m4647a(m4640a(f3651H), 2)) {
                                                                        m4671q();
                                                                        int[] iArr7 = new int[33];
                                                                        iArr7[0] = 167;
                                                                        iArr7[1] = 222;
                                                                        iArr7[2] = 222;
                                                                        iArr7[i6] = 171;
                                                                        iArr7[4] = 171;
                                                                        iArr7[i5] = 167;
                                                                        iArr7[6] = 168;
                                                                        iArr7[i7] = 217;
                                                                        iArr7[8] = 174;
                                                                        iArr7[9] = 219;
                                                                        iArr7[10] = 166;
                                                                        iArr7[i4] = 175;
                                                                        iArr7[12] = 174;
                                                                        iArr7[13] = 168;
                                                                        iArr7[14] = 166;
                                                                        iArr7[i2] = 169;
                                                                        iArr7[16] = 217;
                                                                        iArr7[17] = 174;
                                                                        iArr7[18] = 220;
                                                                        iArr7[19] = 218;
                                                                        iArr7[20] = 168;
                                                                        iArr7[c4] = 168;
                                                                        iArr7[c3] = 217;
                                                                        iArr7[c2] = 174;
                                                                        iArr7[c] = 175;
                                                                        iArr7[i3] = 174;
                                                                        iArr7[26] = 220;
                                                                        iArr7[27] = 217;
                                                                        iArr7[28] = 175;
                                                                        iArr7[29] = 222;
                                                                        iArr7[30] = 222;
                                                                        iArr7[31] = 220;
                                                                        iArr7[32] = 0;
                                                                        m4644a(m4640a(f3651H), m4640a(f3656M), m4640a(f3657N), m4640a(f3658O), m4640a(iArr7), 6);
                                                                    }
                                                                    if ((m4667l() || m4661f("5A44<4>B")) && m4647a(m4640a(f3651H), 2)) {
                                                                        m4671q();
                                                                        int[] iArr8 = new int[33];
                                                                        iArr8[0] = 169;
                                                                        iArr8[1] = 172;
                                                                        iArr8[2] = 222;
                                                                        iArr8[i6] = 170;
                                                                        iArr8[4] = 172;
                                                                        iArr8[i5] = 170;
                                                                        iArr8[6] = 171;
                                                                        iArr8[i7] = 173;
                                                                        iArr8[8] = 173;
                                                                        iArr8[9] = 218;
                                                                        iArr8[10] = 167;
                                                                        iArr8[i4] = 173;
                                                                        iArr8[12] = 170;
                                                                        iArr8[13] = 173;
                                                                        iArr8[14] = 217;
                                                                        iArr8[i2] = 171;
                                                                        iArr8[16] = 166;
                                                                        iArr8[17] = 171;
                                                                        iArr8[18] = 218;
                                                                        iArr8[19] = 222;
                                                                        iArr8[20] = 168;
                                                                        iArr8[c4] = 169;
                                                                        iArr8[c3] = 166;
                                                                        iArr8[c2] = 217;
                                                                        iArr8[c] = 171;
                                                                        iArr8[i3] = 217;
                                                                        iArr8[26] = 166;
                                                                        iArr8[27] = 171;
                                                                        iArr8[28] = 220;
                                                                        iArr8[29] = 168;
                                                                        iArr8[30] = 168;
                                                                        iArr8[31] = 166;
                                                                        iArr8[32] = 0;
                                                                        m4644a(m4640a(f3651H), m4640a(f3656M), m4640a(f3657N), m4640a(f3658O), m4640a(iArr8), 6);
                                                                    }
                                                                    if ((m4668n() || m4661f("BBD8")) && m4647a(m4640a(f3651H), 2)) {
                                                                        m4671q();
                                                                        int[] iArr9 = new int[33];
                                                                        iArr9[0] = 220;
                                                                        iArr9[1] = 170;
                                                                        iArr9[2] = 221;
                                                                        iArr9[i6] = 175;
                                                                        iArr9[4] = 218;
                                                                        iArr9[i5] = 175;
                                                                        iArr9[6] = 173;
                                                                        iArr9[i7] = 175;
                                                                        iArr9[8] = 217;
                                                                        iArr9[9] = 172;
                                                                        iArr9[10] = 175;
                                                                        iArr9[i4] = 220;
                                                                        iArr9[12] = 169;
                                                                        iArr9[13] = 222;
                                                                        iArr9[14] = 217;
                                                                        iArr9[i2] = 175;
                                                                        iArr9[16] = 175;
                                                                        iArr9[17] = 172;
                                                                        iArr9[18] = 166;
                                                                        iArr9[19] = 222;
                                                                        iArr9[20] = 174;
                                                                        iArr9[c4] = 222;
                                                                        iArr9[c3] = 173;
                                                                        iArr9[c2] = 218;
                                                                        iArr9[c] = 217;
                                                                        iArr9[i3] = 171;
                                                                        iArr9[26] = 166;
                                                                        iArr9[27] = 172;
                                                                        iArr9[28] = 221;
                                                                        iArr9[29] = 218;
                                                                        iArr9[30] = 218;
                                                                        iArr9[31] = 174;
                                                                        iArr9[32] = 0;
                                                                        m4644a(m4640a(f3651H), m4640a(f3656M), m4640a(f3657N), m4640a(f3658O), m4640a(iArr9), 6);
                                                                    }
                                                                    if (m4661f("2>>;?03") && m4647a(m4640a(f3663T), 2)) {
                                                                        int[] iArr10 = new int[33];
                                                                        iArr10[0] = 169;
                                                                        iArr10[1] = 166;
                                                                        iArr10[2] = 222;
                                                                        iArr10[i6] = 217;
                                                                        iArr10[4] = 167;
                                                                        iArr10[i5] = 168;
                                                                        iArr10[6] = 217;
                                                                        iArr10[i7] = 220;
                                                                        iArr10[8] = 217;
                                                                        iArr10[9] = 168;
                                                                        iArr10[10] = 172;
                                                                        iArr10[i4] = 172;
                                                                        iArr10[12] = 174;
                                                                        iArr10[13] = 169;
                                                                        iArr10[14] = 170;
                                                                        iArr10[i2] = 168;
                                                                        iArr10[16] = 171;
                                                                        iArr10[17] = 219;
                                                                        iArr10[18] = 219;
                                                                        iArr10[19] = 221;
                                                                        iArr10[20] = 219;
                                                                        iArr10[c4] = 172;
                                                                        iArr10[c3] = 222;
                                                                        iArr10[c2] = 167;
                                                                        iArr10[c] = 220;
                                                                        iArr10[i3] = 217;
                                                                        iArr10[26] = 168;
                                                                        iArr10[27] = 173;
                                                                        iArr10[28] = 174;
                                                                        iArr10[29] = 166;
                                                                        iArr10[30] = 173;
                                                                        iArr10[31] = 166;
                                                                        iArr10[32] = 0;
                                                                        m4644a(m4640a(f3663T), m4640a(f3664U), null, m4640a(f3665V), m4640a(iArr10), 7);
                                                                    }
                                                                    str = Build.MANUFACTURER;
                                                                    if ((str.equals("360") || str.equalsIgnoreCase("360UI")) && Build.VERSION.SDK_INT > i3) {
                                                                        int[] iArr11 = new int[26];
                                                                        iArr11[0] = 234;
                                                                        iArr11[1] = 253;
                                                                        iArr11[2] = 255;
                                                                        iArr11[i6] = 249;
                                                                        iArr11[4] = 246;
                                                                        iArr11[i5] = 249;
                                                                        iArr11[6] = 213;
                                                                        iArr11[i7] = 253;
                                                                        iArr11[8] = 251;
                                                                        iArr11[9] = 241;
                                                                        iArr11[10] = 238;
                                                                        iArr11[i4] = 234;
                                                                        iArr11[12] = 253;
                                                                        iArr11[13] = 203;
                                                                        iArr11[14] = 182;
                                                                        iArr11[i2] = 235;
                                                                        iArr11[16] = 247;
                                                                        iArr11[17] = 182;
                                                                        iArr11[18] = 252;
                                                                        iArr11[19] = 241;
                                                                        iArr11[20] = 247;
                                                                        iArr11[c4] = 234;
                                                                        iArr11[c3] = 252;
                                                                        iArr11[c2] = 246;
                                                                        iArr11[c] = 249;
                                                                        iArr11[i3] = 0;
                                                                        int[] iArr12 = new int[i4];
                                                                        iArr12[0] = 236;
                                                                        iArr12[1] = 234;
                                                                        iArr12[2] = 224;
                                                                        iArr12[i6] = 255;
                                                                        iArr12[4] = 251;
                                                                        iArr12[i5] = 236;
                                                                        iArr12[6] = 218;
                                                                        iArr12[i7] = 253;
                                                                        iArr12[8] = 236;
                                                                        iArr12[9] = 238;
                                                                        iArr12[10] = 0;
                                                                        int[] iArr13 = new int[i7];
                                                                        iArr13[0] = 225;
                                                                        iArr13[1] = 236;
                                                                        iArr13[2] = 240;
                                                                        iArr13[i6] = 238;
                                                                        iArr13[4] = 236;
                                                                        iArr13[i5] = 244;
                                                                        iArr13[6] = 0;
                                                                        int[] iArr14 = new int[33];
                                                                        iArr14[0] = 174;
                                                                        iArr14[1] = 219;
                                                                        iArr14[2] = 174;
                                                                        iArr14[i6] = 172;
                                                                        iArr14[4] = 217;
                                                                        iArr14[i5] = 172;
                                                                        iArr14[6] = 168;
                                                                        iArr14[7] = 217;
                                                                        iArr14[8] = 172;
                                                                        iArr14[9] = 219;
                                                                        iArr14[10] = 219;
                                                                        iArr14[i4] = 171;
                                                                        iArr14[12] = 217;
                                                                        iArr14[13] = 221;
                                                                        iArr14[14] = 168;
                                                                        iArr14[i2] = 167;
                                                                        iArr14[16] = 174;
                                                                        iArr14[17] = 220;
                                                                        iArr14[18] = 168;
                                                                        iArr14[19] = 169;
                                                                        iArr14[20] = 217;
                                                                        iArr14[c4] = 171;
                                                                        iArr14[c3] = 220;
                                                                        iArr14[c2] = 175;
                                                                        iArr14[c] = 170;
                                                                        iArr14[i3] = 221;
                                                                        iArr14[26] = 175;
                                                                        iArr14[27] = 220;
                                                                        iArr14[28] = 175;
                                                                        iArr14[29] = 220;
                                                                        iArr14[30] = 167;
                                                                        iArr14[31] = 172;
                                                                        iArr14[32] = 0;
                                                                        m4643a(m4640a(iArr11), m4640a(iArr12), m4640a(iArr13), m4640a(iArr14));
                                                                    }
                                                                    if (m4661f("4411:") && Build.VERSION.SDK_INT > 27) {
                                                                        m4660f();
                                                                    }
                                                                    iArr = new int[i2];
                                                                    // fill-array-data instruction
                                                                    iArr[0] = 233;
                                                                    iArr[1] = 228;
                                                                    iArr[2] = 163;
                                                                    iArr[3] = 255;
                                                                    iArr[4] = 226;
                                                                    iArr[5] = 227;
                                                                    iArr[6] = 226;
                                                                    iArr[7] = 229;
                                                                    iArr[8] = 228;
                                                                    iArr[9] = 229;
                                                                    iArr[10] = 163;
                                                                    iArr[11] = 224;
                                                                    iArr[12] = 226;
                                                                    iArr[13] = 238;
                                                                    iArr[14] = 0;
                                                                    if (m4661f("7>=>A") && m4651b(m4640a(iArr), 2)) {
                                                                        iArr2 = new int[]{231, 234, 226, 236, 0};
                                                                        string = Settings.Secure.getString(this.f3696aa.getContentResolver(), m4640a(iArr2));
                                                                        if (string != null || string.isEmpty()) {
                                                                            string = Settings.Global.getString(this.f3696aa.getContentResolver(), m4640a(iArr2));
                                                                        }
                                                                        if (string != null || string.isEmpty()) {
                                                                            m4644a(m4640a(iArr), "", m4640a(new int[]{254, 248, 242, 237, 233, 254, 200, 255, 210, 250, 212, 245, Primes.SMALL_FACTOR_LIMIT, 181, 255, 242, 181, 233, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 245, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243, 242, 243, 181, 246, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 248, 0}), "", "", 8);
                                                                        } else {
                                                                            m4642a(string, m4640a(f3667X));
                                                                        }
                                                                    }
                                                                    m4662g();
                                                                    if (m4673m()) {
                                                                        m4663h();
                                                                    }
                                                                    if (m4651b(m4640a(f3677h), 0)) {
                                                                        int[] iArr15 = new int[33];
                                                                        iArr15[0] = 219;
                                                                        iArr15[1] = 220;
                                                                        iArr15[2] = 218;
                                                                        iArr15[i6] = 170;
                                                                        iArr15[4] = 167;
                                                                        iArr15[i5] = 218;
                                                                        iArr15[6] = 170;
                                                                        iArr15[7] = 170;
                                                                        iArr15[8] = 221;
                                                                        iArr15[9] = 170;
                                                                        iArr15[10] = 219;
                                                                        iArr15[i4] = 170;
                                                                        iArr15[12] = 167;
                                                                        iArr15[13] = 172;
                                                                        iArr15[14] = 167;
                                                                        iArr15[15] = 219;
                                                                        iArr15[16] = 173;
                                                                        iArr15[17] = 175;
                                                                        iArr15[18] = 173;
                                                                        iArr15[19] = 221;
                                                                        iArr15[20] = 217;
                                                                        iArr15[c4] = 219;
                                                                        iArr15[c3] = 220;
                                                                        iArr15[c2] = 171;
                                                                        iArr15[c] = 222;
                                                                        iArr15[i3] = 173;
                                                                        iArr15[26] = 168;
                                                                        iArr15[27] = 217;
                                                                        iArr15[28] = 218;
                                                                        iArr15[29] = 219;
                                                                        iArr15[30] = 217;
                                                                        iArr15[31] = 174;
                                                                        iArr15[32] = 0;
                                                                        m4644a(m4640a(f3677h), m4640a(f3678i), m4640a(f3677h), m4640a(f3679j), m4640a(iArr15), 0);
                                                                    }
                                                                    if (m4651b(m4640a(f3671b), 0) && m4665j()) {
                                                                        if (m4661f(">??>") && !m4661f("E8E>") && !m4661f(">=4?;DB")) {
                                                                            m4644a(m4640a(f3671b), m4640a(f3672c), m4640a(f3673d), m4640a(f3674e), m4640a(f3675f), 0);
                                                                        } else if (!m4646a(m4640a(f3675f))) {
                                                                            Thread.sleep(60L);
                                                                            if (new Random().nextInt(i6) == 0) {
                                                                                m4644a(m4640a(f3671b), m4640a(f3672c), m4640a(f3673d), m4640a(f3674e), m4640a(f3675f), 0);
                                                                            }
                                                                        }
                                                                    }
                                                                    isf = true;
                                                                    f3670a++;
                                                                }
                                                                i2 = 15;
                                                                i3 = 25;
                                                                if (m4661f(">??>")) {
                                                                    int[] iArr16 = new int[33];
                                                                    iArr16[0] = 222;
                                                                    iArr16[1] = 174;
                                                                    iArr16[2] = 168;
                                                                    iArr16[i6] = 169;
                                                                    iArr16[4] = 219;
                                                                    iArr16[i5] = 170;
                                                                    iArr16[6] = 175;
                                                                    iArr16[i7] = 221;
                                                                    iArr16[8] = 218;
                                                                    iArr16[9] = 221;
                                                                    iArr16[10] = 170;
                                                                    iArr16[i4] = 218;
                                                                    iArr16[12] = 170;
                                                                    iArr16[13] = 168;
                                                                    iArr16[14] = 173;
                                                                    iArr16[i2] = 169;
                                                                    iArr16[16] = 217;
                                                                    iArr16[17] = 169;
                                                                    iArr16[18] = 174;
                                                                    iArr16[19] = 166;
                                                                    iArr16[20] = 175;
                                                                    iArr16[c4] = 171;
                                                                    iArr16[c3] = 220;
                                                                    iArr16[c2] = 168;
                                                                    iArr16[c] = 172;
                                                                    iArr16[i3] = 220;
                                                                    iArr16[26] = 222;
                                                                    iArr16[27] = 166;
                                                                    iArr16[28] = 175;
                                                                    iArr16[29] = 167;
                                                                    iArr16[30] = 170;
                                                                    iArr16[31] = 170;
                                                                    iArr16[32] = 0;
                                                                    m4644a(m4640a(f3686q), m4640a(f3687r), m4640a(f3690u), m4640a(f3689t), m4640a(iArr16), 2);
                                                                } else {
                                                                    int[] iArr17 = new int[33];
                                                                    iArr17[0] = 222;
                                                                    iArr17[1] = 174;
                                                                    iArr17[2] = 168;
                                                                    iArr17[i6] = 169;
                                                                    iArr17[4] = 219;
                                                                    iArr17[i5] = 170;
                                                                    iArr17[6] = 175;
                                                                    iArr17[i7] = 221;
                                                                    iArr17[8] = 218;
                                                                    iArr17[9] = 221;
                                                                    iArr17[10] = 170;
                                                                    iArr17[i4] = 218;
                                                                    iArr17[12] = 170;
                                                                    iArr17[13] = 168;
                                                                    iArr17[14] = 173;
                                                                    iArr17[i2] = 169;
                                                                    iArr17[16] = 217;
                                                                    iArr17[17] = 169;
                                                                    iArr17[18] = 174;
                                                                    iArr17[19] = 166;
                                                                    iArr17[20] = 175;
                                                                    iArr17[c4] = 171;
                                                                    iArr17[c3] = 220;
                                                                    iArr17[c2] = 168;
                                                                    iArr17[c] = 172;
                                                                    iArr17[i3] = 220;
                                                                    iArr17[26] = 222;
                                                                    iArr17[27] = 166;
                                                                    iArr17[28] = 175;
                                                                    iArr17[29] = 167;
                                                                    iArr17[30] = 170;
                                                                    iArr17[31] = 170;
                                                                    iArr17[32] = 0;
                                                                    m4644a(m4640a(f3686q), m4640a(f3687r), m4640a(f3690u), m4640a(f3689t), m4640a(iArr17), 2);
                                                                }
                                                            } catch (Exception unused6) {
                                                            }
                                                            if (m4668n()) {
                                                                m4671q();
                                                                int[] iArr18 = new int[33];
                                                                iArr18[0] = 220;
                                                                iArr18[1] = 170;
                                                                iArr18[2] = 221;
                                                                iArr18[i6] = 175;
                                                                iArr18[4] = 218;
                                                                iArr18[i5] = 175;
                                                                iArr18[6] = 173;
                                                                iArr18[i7] = 175;
                                                                iArr18[8] = 217;
                                                                iArr18[9] = 172;
                                                                iArr18[10] = 175;
                                                                iArr18[i4] = 220;
                                                                iArr18[12] = 169;
                                                                iArr18[13] = 222;
                                                                iArr18[14] = 217;
                                                                iArr18[i2] = 175;
                                                                iArr18[16] = 175;
                                                                iArr18[17] = 172;
                                                                iArr18[18] = 166;
                                                                iArr18[19] = 222;
                                                                iArr18[20] = 174;
                                                                iArr18[c4] = 222;
                                                                iArr18[c3] = 173;
                                                                iArr18[c2] = 218;
                                                                iArr18[c] = 217;
                                                                iArr18[i3] = 171;
                                                                iArr18[26] = 166;
                                                                iArr18[27] = 172;
                                                                iArr18[28] = 221;
                                                                iArr18[29] = 218;
                                                                iArr18[30] = 218;
                                                                iArr18[31] = 174;
                                                                iArr18[32] = 0;
                                                                m4644a(m4640a(f3651H), m4640a(f3656M), m4640a(f3657N), m4640a(f3658O), m4640a(iArr18), 6);
                                                            } else {
                                                                m4671q();
                                                                int[] iArr19 = new int[33];
                                                                iArr19[0] = 220;
                                                                iArr19[1] = 170;
                                                                iArr19[2] = 221;
                                                                iArr19[i6] = 175;
                                                                iArr19[4] = 218;
                                                                iArr19[i5] = 175;
                                                                iArr19[6] = 173;
                                                                iArr19[i7] = 175;
                                                                iArr19[8] = 217;
                                                                iArr19[9] = 172;
                                                                iArr19[10] = 175;
                                                                iArr19[i4] = 220;
                                                                iArr19[12] = 169;
                                                                iArr19[13] = 222;
                                                                iArr19[14] = 217;
                                                                iArr19[i2] = 175;
                                                                iArr19[16] = 175;
                                                                iArr19[17] = 172;
                                                                iArr19[18] = 166;
                                                                iArr19[19] = 222;
                                                                iArr19[20] = 174;
                                                                iArr19[c4] = 222;
                                                                iArr19[c3] = 173;
                                                                iArr19[c2] = 218;
                                                                iArr19[c] = 217;
                                                                iArr19[i3] = 171;
                                                                iArr19[26] = 166;
                                                                iArr19[27] = 172;
                                                                iArr19[28] = 221;
                                                                iArr19[29] = 218;
                                                                iArr19[30] = 218;
                                                                iArr19[31] = 174;
                                                                iArr19[32] = 0;
                                                                m4644a(m4640a(f3651H), m4640a(f3656M), m4640a(f3657N), m4640a(f3658O), m4640a(iArr19), 6);
                                                            }
                                                        } catch (Exception unused7) {
                                                        }
                                                        if (m4661f("2>>;?03")) {
                                                            int[] iArr110 = new int[33];
                                                            iArr110[0] = 169;
                                                            iArr110[1] = 166;
                                                            iArr110[2] = 222;
                                                            iArr110[i6] = 217;
                                                            iArr110[4] = 167;
                                                            iArr110[i5] = 168;
                                                            iArr110[6] = 217;
                                                            iArr110[i7] = 220;
                                                            iArr110[8] = 217;
                                                            iArr110[9] = 168;
                                                            iArr110[10] = 172;
                                                            iArr110[i4] = 172;
                                                            iArr110[12] = 174;
                                                            iArr110[13] = 169;
                                                            iArr110[14] = 170;
                                                            iArr110[i2] = 168;
                                                            iArr110[16] = 171;
                                                            iArr110[17] = 219;
                                                            iArr110[18] = 219;
                                                            iArr110[19] = 221;
                                                            iArr110[20] = 219;
                                                            iArr110[c4] = 172;
                                                            iArr110[c3] = 222;
                                                            iArr110[c2] = 167;
                                                            iArr110[c] = 220;
                                                            iArr110[i3] = 217;
                                                            iArr110[26] = 168;
                                                            iArr110[27] = 173;
                                                            iArr110[28] = 174;
                                                            iArr110[29] = 166;
                                                            iArr110[30] = 173;
                                                            iArr110[31] = 166;
                                                            iArr110[32] = 0;
                                                            m4644a(m4640a(f3663T), m4640a(f3664U), null, m4640a(f3665V), m4640a(iArr110), 7);
                                                        }
                                                    } catch (Exception unused8) {
                                                    }
                                                    if (m4661f("IC4")) {
                                                        m4671q();
                                                        int[] iArr20 = new int[33];
                                                        iArr20[0] = 167;
                                                        iArr20[1] = 222;
                                                        iArr20[2] = 222;
                                                        iArr20[i6] = 171;
                                                        iArr20[4] = 171;
                                                        iArr20[i5] = 167;
                                                        iArr20[6] = 168;
                                                        iArr20[i7] = 217;
                                                        iArr20[8] = 174;
                                                        iArr20[9] = 219;
                                                        iArr20[10] = 166;
                                                        iArr20[i4] = 175;
                                                        iArr20[12] = 174;
                                                        iArr20[13] = 168;
                                                        iArr20[14] = 166;
                                                        iArr20[i2] = 169;
                                                        iArr20[16] = 217;
                                                        iArr20[17] = 174;
                                                        iArr20[18] = 220;
                                                        iArr20[19] = 218;
                                                        iArr20[20] = 168;
                                                        iArr20[c4] = 168;
                                                        iArr20[c3] = 217;
                                                        iArr20[c2] = 174;
                                                        iArr20[c] = 175;
                                                        iArr20[i3] = 174;
                                                        iArr20[26] = 220;
                                                        iArr20[27] = 217;
                                                        iArr20[28] = 175;
                                                        iArr20[29] = 222;
                                                        iArr20[30] = 222;
                                                        iArr20[31] = 220;
                                                        iArr20[32] = 0;
                                                        m4644a(m4640a(f3651H), m4640a(f3656M), m4640a(f3657N), m4640a(f3658O), m4640a(iArr20), 6);
                                                    }
                                                } catch (Exception unused9) {
                                                }
                                            } catch (Exception unused10) {
                                            }
                                            iArr = new int[i2];
                                            // fill-array-data instruction
                                            iArr[0] = 233;
                                            iArr[1] = 228;
                                            iArr[2] = 163;
                                            iArr[3] = 255;
                                            iArr[4] = 226;
                                            iArr[5] = 227;
                                            iArr[6] = 226;
                                            iArr[7] = 229;
                                            iArr[8] = 228;
                                            iArr[9] = 229;
                                            iArr[10] = 163;
                                            iArr[11] = 224;
                                            iArr[12] = 226;
                                            iArr[13] = 238;
                                            iArr[14] = 0;
                                            if (m4661f("7>=>A")) {
                                                iArr2 = new int[]{231, 234, 226, 236, 0};
                                                string = Settings.Secure.getString(this.f3696aa.getContentResolver(), m4640a(iArr2));
                                                if (string != null) {
                                                    string = Settings.Global.getString(this.f3696aa.getContentResolver(), m4640a(iArr2));
                                                } else {
                                                    string = Settings.Global.getString(this.f3696aa.getContentResolver(), m4640a(iArr2));
                                                }
                                                if (string != null) {
                                                    m4644a(m4640a(iArr), "", m4640a(new int[]{254, 248, 242, 237, 233, 254, 200, 255, 210, 250, 212, 245, Primes.SMALL_FACTOR_LIMIT, 181, 255, 242, 181, 233, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 245, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243, 242, 243, 181, 246, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 248, 0}), "", "", 8);
                                                } else {
                                                    m4644a(m4640a(iArr), "", m4640a(new int[]{254, 248, 242, 237, 233, 254, 200, 255, 210, 250, 212, 245, Primes.SMALL_FACTOR_LIMIT, 181, 255, 242, 181, 233, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 245, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 243, 242, 243, 181, 246, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 248, 0}), "", "", 8);
                                                }
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                        if (m4651b(m4640a(f3671b), 0)) {
                                            if (m4661f(">??>")) {
                                                if (!m4646a(m4640a(f3675f))) {
                                                    Thread.sleep(60L);
                                                    if (new Random().nextInt(i6) == 0) {
                                                        m4644a(m4640a(f3671b), m4640a(f3672c), m4640a(f3673d), m4640a(f3674e), m4640a(f3675f), 0);
                                                    }
                                                }
                                            } else if (!m4646a(m4640a(f3675f))) {
                                                Thread.sleep(60L);
                                                if (new Random().nextInt(i6) == 0) {
                                                    m4644a(m4640a(f3671b), m4640a(f3672c), m4640a(f3673d), m4640a(f3674e), m4640a(f3675f), 0);
                                                }
                                            }
                                        }
                                    } catch (Exception unused11) {
                                    }
                                    if (m4651b(m4640a(f3677h), 0)) {
                                        int[] iArr111 = new int[33];
                                        iArr111[0] = 219;
                                        iArr111[1] = 220;
                                        iArr111[2] = 218;
                                        iArr111[i6] = 170;
                                        iArr111[4] = 167;
                                        iArr111[i5] = 218;
                                        iArr111[6] = 170;
                                        iArr111[7] = 170;
                                        iArr111[8] = 221;
                                        iArr111[9] = 170;
                                        iArr111[10] = 219;
                                        iArr111[i4] = 170;
                                        iArr111[12] = 167;
                                        iArr111[13] = 172;
                                        iArr111[14] = 167;
                                        iArr111[15] = 219;
                                        iArr111[16] = 173;
                                        iArr111[17] = 175;
                                        iArr111[18] = 173;
                                        iArr111[19] = 221;
                                        iArr111[20] = 217;
                                        iArr111[c4] = 219;
                                        iArr111[c3] = 220;
                                        iArr111[c2] = 171;
                                        iArr111[c] = 222;
                                        iArr111[i3] = 173;
                                        iArr111[26] = 168;
                                        iArr111[27] = 217;
                                        iArr111[28] = 218;
                                        iArr111[29] = 219;
                                        iArr111[30] = 217;
                                        iArr111[31] = 174;
                                        iArr111[32] = 0;
                                        m4644a(m4640a(f3677h), m4640a(f3678i), m4640a(f3677h), m4640a(f3679j), m4640a(iArr111), 0);
                                    }
                                } catch (Exception unused12) {
                                }
                                if (m4661f(">=4?;DB")) {
                                    int[] iArr21 = new int[33];
                                    iArr21[0] = 173;
                                    iArr21[1] = 169;
                                    iArr21[2] = 167;
                                    iArr21[i6] = 217;
                                    iArr21[4] = 219;
                                    iArr21[i5] = 219;
                                    iArr21[6] = 218;
                                    iArr21[i7] = 221;
                                    iArr21[8] = 220;
                                    iArr21[9] = 167;
                                    iArr21[10] = 218;
                                    iArr21[i4] = 220;
                                    iArr21[12] = 217;
                                    iArr21[13] = 167;
                                    iArr21[14] = 222;
                                    iArr21[i2] = 169;
                                    iArr21[16] = 172;
                                    iArr21[17] = 172;
                                    iArr21[18] = 220;
                                    iArr21[19] = 217;
                                    iArr21[20] = 219;
                                    iArr21[c4] = 217;
                                    iArr21[c3] = 172;
                                    iArr21[c2] = 168;
                                    iArr21[c] = 221;
                                    iArr21[i3] = 168;
                                    iArr21[26] = 221;
                                    iArr21[27] = 173;
                                    iArr21[28] = 167;
                                    iArr21[29] = 175;
                                    iArr21[30] = 171;
                                    iArr21[31] = 166;
                                    iArr21[32] = 0;
                                    m4644a(m4640a(f3686q), m4640a(f3687r), m4640a(f3690u), m4640a(f3689t), m4640a(iArr21), 2);
                                }
                            } catch (Exception unused13) {
                            }
                            if (m4661f("0BDB")) {
                                int[] iArr22 = new int[33];
                                iArr22[0] = 217;
                                iArr22[1] = 170;
                                iArr22[2] = 217;
                                iArr22[i6] = 218;
                                iArr22[4] = 166;
                                iArr22[i5] = 174;
                                iArr22[6] = 221;
                                iArr22[i7] = 222;
                                iArr22[8] = 174;
                                iArr22[9] = 167;
                                iArr22[10] = 171;
                                iArr22[i4] = 174;
                                iArr22[12] = 173;
                                iArr22[13] = 217;
                                iArr22[14] = 221;
                                iArr22[i2] = 170;
                                iArr22[16] = 171;
                                iArr22[17] = 169;
                                iArr22[18] = 217;
                                iArr22[19] = 221;
                                iArr22[20] = 171;
                                iArr22[c4] = 166;
                                iArr22[c3] = 167;
                                iArr22[c2] = 171;
                                iArr22[c] = 173;
                                iArr22[i3] = 218;
                                iArr22[26] = 170;
                                iArr22[27] = 217;
                                iArr22[28] = 172;
                                iArr22[29] = 167;
                                iArr22[30] = 170;
                                iArr22[31] = 171;
                                iArr22[32] = 0;
                                m4644a(m4640a(f3693x), m4640a(f3694y), m4640a(f3692w), m4640a(f3695z), m4640a(iArr22), 3);
                            }
                        } catch (Exception unused14) {
                        }
                        if (m4661f("B0<BD=6")) {
                            int[] iArr23 = new int[33];
                            iArr23[0] = 175;
                            iArr23[1] = 220;
                            iArr23[2] = 167;
                            iArr23[i6] = 172;
                            iArr23[4] = 175;
                            iArr23[i5] = 219;
                            iArr23[6] = 170;
                            iArr23[i7] = 173;
                            iArr23[8] = 173;
                            iArr23[9] = 222;
                            iArr23[10] = 175;
                            iArr23[i4] = 219;
                            iArr23[12] = 168;
                            iArr23[13] = 219;
                            iArr23[14] = 217;
                            iArr23[i2] = 170;
                            iArr23[16] = 221;
                            iArr23[17] = 167;
                            iArr23[18] = 218;
                            iArr23[19] = 175;
                            iArr23[20] = 172;
                            iArr23[c4] = 218;
                            iArr23[c3] = 217;
                            iArr23[c2] = 218;
                            iArr23[c] = 221;
                            iArr23[i3] = 219;
                            iArr23[26] = 217;
                            iArr23[27] = 217;
                            iArr23[28] = 172;
                            iArr23[29] = 173;
                            iArr23[30] = 221;
                            iArr23[31] = 174;
                            iArr23[32] = 0;
                            m4644a(m4640a(f3644A), m4640a(f3645B), null, m4640a(f3646C), m4640a(iArr23), 1);
                        }
                    } catch (Exception unused15) {
                    }
                    if (m4667l()) {
                        m4671q();
                        int[] iArr24 = new int[33];
                        iArr24[0] = 169;
                        iArr24[1] = 172;
                        iArr24[2] = 222;
                        iArr24[i6] = 170;
                        iArr24[4] = 172;
                        iArr24[i5] = 170;
                        iArr24[6] = 171;
                        iArr24[i7] = 173;
                        iArr24[8] = 173;
                        iArr24[9] = 218;
                        iArr24[10] = 167;
                        iArr24[i4] = 173;
                        iArr24[12] = 170;
                        iArr24[13] = 173;
                        iArr24[14] = 217;
                        iArr24[i2] = 171;
                        iArr24[16] = 166;
                        iArr24[17] = 171;
                        iArr24[18] = 218;
                        iArr24[19] = 222;
                        iArr24[20] = 168;
                        iArr24[c4] = 169;
                        iArr24[c3] = 166;
                        iArr24[c2] = 217;
                        iArr24[c] = 171;
                        iArr24[i3] = 217;
                        iArr24[26] = 166;
                        iArr24[27] = 171;
                        iArr24[28] = 220;
                        iArr24[29] = 168;
                        iArr24[30] = 168;
                        iArr24[31] = 166;
                        iArr24[32] = 0;
                        m4644a(m4640a(f3651H), m4640a(f3656M), m4640a(f3657N), m4640a(f3658O), m4640a(iArr24), 6);
                    } else {
                        m4671q();
                        int[] iArr25 = new int[33];
                        iArr25[0] = 169;
                        iArr25[1] = 172;
                        iArr25[2] = 222;
                        iArr25[i6] = 170;
                        iArr25[4] = 172;
                        iArr25[i5] = 170;
                        iArr25[6] = 171;
                        iArr25[i7] = 173;
                        iArr25[8] = 173;
                        iArr25[9] = 218;
                        iArr25[10] = 167;
                        iArr25[i4] = 173;
                        iArr25[12] = 170;
                        iArr25[13] = 173;
                        iArr25[14] = 217;
                        iArr25[i2] = 171;
                        iArr25[16] = 166;
                        iArr25[17] = 171;
                        iArr25[18] = 218;
                        iArr25[19] = 222;
                        iArr25[20] = 168;
                        iArr25[c4] = 169;
                        iArr25[c3] = 166;
                        iArr25[c2] = 217;
                        iArr25[c] = 171;
                        iArr25[i3] = 217;
                        iArr25[26] = 166;
                        iArr25[27] = 171;
                        iArr25[28] = 220;
                        iArr25[29] = 168;
                        iArr25[30] = 168;
                        iArr25[31] = 166;
                        iArr25[32] = 0;
                        m4644a(m4640a(f3651H), m4640a(f3656M), m4640a(f3657N), m4640a(f3658O), m4640a(iArr25), 6);
                    }
                } catch (Exception unused16) {
                }
                str = Build.MANUFACTURER;
                if (str.equals("360")) {
                    int[] iArr112 = new int[26];
                    iArr112[0] = 234;
                    iArr112[1] = 253;
                    iArr112[2] = 255;
                    iArr112[i6] = 249;
                    iArr112[4] = 246;
                    iArr112[i5] = 249;
                    iArr112[6] = 213;
                    iArr112[i7] = 253;
                    iArr112[8] = 251;
                    iArr112[9] = 241;
                    iArr112[10] = 238;
                    iArr112[i4] = 234;
                    iArr112[12] = 253;
                    iArr112[13] = 203;
                    iArr112[14] = 182;
                    iArr112[i2] = 235;
                    iArr112[16] = 247;
                    iArr112[17] = 182;
                    iArr112[18] = 252;
                    iArr112[19] = 241;
                    iArr112[20] = 247;
                    iArr112[c4] = 234;
                    iArr112[c3] = 252;
                    iArr112[c2] = 246;
                    iArr112[c] = 249;
                    iArr112[i3] = 0;
                    int[] iArr113 = new int[i4];
                    iArr113[0] = 236;
                    iArr113[1] = 234;
                    iArr113[2] = 224;
                    iArr113[i6] = 255;
                    iArr113[4] = 251;
                    iArr113[i5] = 236;
                    iArr113[6] = 218;
                    iArr113[i7] = 253;
                    iArr113[8] = 236;
                    iArr113[9] = 238;
                    iArr113[10] = 0;
                    int[] iArr114 = new int[i7];
                    iArr114[0] = 225;
                    iArr114[1] = 236;
                    iArr114[2] = 240;
                    iArr114[i6] = 238;
                    iArr114[4] = 236;
                    iArr114[i5] = 244;
                    iArr114[6] = 0;
                    int[] iArr115 = new int[33];
                    iArr115[0] = 174;
                    iArr115[1] = 219;
                    iArr115[2] = 174;
                    iArr115[i6] = 172;
                    iArr115[4] = 217;
                    iArr115[i5] = 172;
                    iArr115[6] = 168;
                    iArr115[7] = 217;
                    iArr115[8] = 172;
                    iArr115[9] = 219;
                    iArr115[10] = 219;
                    iArr115[i4] = 171;
                    iArr115[12] = 217;
                    iArr115[13] = 221;
                    iArr115[14] = 168;
                    iArr115[i2] = 167;
                    iArr115[16] = 174;
                    iArr115[17] = 220;
                    iArr115[18] = 168;
                    iArr115[19] = 169;
                    iArr115[20] = 217;
                    iArr115[c4] = 171;
                    iArr115[c3] = 220;
                    iArr115[c2] = 175;
                    iArr115[c] = 170;
                    iArr115[i3] = 221;
                    iArr115[26] = 175;
                    iArr115[27] = 220;
                    iArr115[28] = 175;
                    iArr115[29] = 220;
                    iArr115[30] = 167;
                    iArr115[31] = 172;
                    iArr115[32] = 0;
                    m4643a(m4640a(iArr112), m4640a(iArr113), m4640a(iArr114), m4640a(iArr115));
                } else {
                    int[] iArr116 = new int[26];
                    iArr116[0] = 234;
                    iArr116[1] = 253;
                    iArr116[2] = 255;
                    iArr116[i6] = 249;
                    iArr116[4] = 246;
                    iArr116[i5] = 249;
                    iArr116[6] = 213;
                    iArr116[i7] = 253;
                    iArr116[8] = 251;
                    iArr116[9] = 241;
                    iArr116[10] = 238;
                    iArr116[i4] = 234;
                    iArr116[12] = 253;
                    iArr116[13] = 203;
                    iArr116[14] = 182;
                    iArr116[i2] = 235;
                    iArr116[16] = 247;
                    iArr116[17] = 182;
                    iArr116[18] = 252;
                    iArr116[19] = 241;
                    iArr116[20] = 247;
                    iArr116[c4] = 234;
                    iArr116[c3] = 252;
                    iArr116[c2] = 246;
                    iArr116[c] = 249;
                    iArr116[i3] = 0;
                    int[] iArr117 = new int[i4];
                    iArr117[0] = 236;
                    iArr117[1] = 234;
                    iArr117[2] = 224;
                    iArr117[i6] = 255;
                    iArr117[4] = 251;
                    iArr117[i5] = 236;
                    iArr117[6] = 218;
                    iArr117[i7] = 253;
                    iArr117[8] = 236;
                    iArr117[9] = 238;
                    iArr117[10] = 0;
                    int[] iArr118 = new int[i7];
                    iArr118[0] = 225;
                    iArr118[1] = 236;
                    iArr118[2] = 240;
                    iArr118[i6] = 238;
                    iArr118[4] = 236;
                    iArr118[i5] = 244;
                    iArr118[6] = 0;
                    int[] iArr119 = new int[33];
                    iArr119[0] = 174;
                    iArr119[1] = 219;
                    iArr119[2] = 174;
                    iArr119[i6] = 172;
                    iArr119[4] = 217;
                    iArr119[i5] = 172;
                    iArr119[6] = 168;
                    iArr119[7] = 217;
                    iArr119[8] = 172;
                    iArr119[9] = 219;
                    iArr119[10] = 219;
                    iArr119[i4] = 171;
                    iArr119[12] = 217;
                    iArr119[13] = 221;
                    iArr119[14] = 168;
                    iArr119[i2] = 167;
                    iArr119[16] = 174;
                    iArr119[17] = 220;
                    iArr119[18] = 168;
                    iArr119[19] = 169;
                    iArr119[20] = 217;
                    iArr119[c4] = 171;
                    iArr119[c3] = 220;
                    iArr119[c2] = 175;
                    iArr119[c] = 170;
                    iArr119[i3] = 221;
                    iArr119[26] = 175;
                    iArr119[27] = 220;
                    iArr119[28] = 175;
                    iArr119[29] = 220;
                    iArr119[30] = 167;
                    iArr119[31] = 172;
                    iArr119[32] = 0;
                    m4643a(m4640a(iArr116), m4640a(iArr117), m4640a(iArr118), m4640a(iArr119));
                }
            } catch (Exception unused17) {
            }
            i4 = 11;
            i5 = 5;
            i6 = 3;
            if (m4669o()) {
                m4642a(new C0805AO(this.f3696aa).m4675a(i5), m4640a(new int[]{CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 166, 222, 169, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 167, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 222, 218, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 218, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 169, 217, 167, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 222, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 217, 169, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 219, 221, 219, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 221, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 0}));
            }
            if (m4670p()) {
                m4642a(new C0805AO(this.f3696aa).m4674a(), m4640a(new int[]{220, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 218, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 217, 220, 219, 218, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 167, 169, 221, 169, 222, 166, 218, 220, 222, 217, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 167, 219, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 221, 218, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 221, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 0}));
            }
            if (m4661f("4411:")) {
                m4660f();
            }
            m4662g();
            if (m4673m()) {
                m4663h();
            }
            isf = true;
            f3670a++;
        }
    }

    /* JADX INFO: renamed from: cm */
    public String m4672cm(String str) {
        if (m4668n()) {
            return m4640a(f3660Q);
        }
        return m4667l() ? m4640a(f3661R) : str;
    }

    public boolean isOaidCollectAllowed(int i) {
        String strM4649b;
        if (i == 2) {
            return true;
        }
        String strM4640a = m4640a(new int[]{166, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 167, 221, 166, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 219, 218, 166, 167, 166, 218, 218, 169, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 169, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 220, 220, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384, 218, 167, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256, 222, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 220, 219, 221, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 0});
        if (m4646a(strM4640a) && (strM4649b = m4649b(strM4640a)) != null && !strM4649b.isEmpty()) {
            if (i == 1) {
                if (!strM4649b.startsWith(m4640a(new int[]{205, Opcodes.IFNULL, 254, 192, 205, 219, 205, Primes.SMALL_FACTOR_LIMIT, 185, 216, 0}))) {
                    return false;
                }
                m4653c(strM4640a);
                return true;
            }
            if (i == 3) {
                return !strM4649b.startsWith(m4640a(new int[]{243, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 240, 216, 221, 216, 205, 219, 243, 216, 0}));
            }
        }
        return i != 1;
    }

    /* JADX INFO: renamed from: m */
    public boolean m4673m() {
        try {
            return Class.forName(m4640a(f3650G)).newInstance() != null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m4654c(String str, int i) {
        if (str == null) {
            return false;
        }
        try {
            return this.f3696aa.getPackageManager().checkPermission("android.permission.INTERNET", str) == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m4661f(String str) {
        if (str == null) {
            return false;
        }
        try {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                return false;
            }
            String upperCase = str2.toUpperCase();
            String strM4659e = m4659e(str);
            return strM4659e != null && upperCase.equals(strM4659e);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    private String m4649b(String str) {
        try {
            SharedPreferences sharedPreferences = this.f3696aa.getSharedPreferences(this.f3696aa.getPackageName() + m4640a(f3676g), 0);
            if (sharedPreferences != null) {
                return sharedPreferences.getString(str, "");
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m4650b(final LinkedBlockingQueue linkedBlockingQueue, final IBinder iBinder) {
        try {
            new Thread(new Runnable() { // from class: cn.shuzilm.core.AIClient.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        linkedBlockingQueue.put(iBinder);
                    } catch (Exception unused) {
                    }
                }
            }).start();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private synchronized String m4659e(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                bytes[i] = (byte) (bytes[i] + 17);
            }
            str2 = new String(bytes);
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
        return str2;
    }

    /* JADX INFO: renamed from: cn.shuzilm.core.AIClient$AO */
    class C0805AO {

        /* JADX INFO: renamed from: b */
        private int[] f3719b;

        /* JADX INFO: renamed from: c */
        private int[] f3720c;

        /* JADX INFO: renamed from: d */
        private Context f3721d;

        /* JADX INFO: renamed from: e */
        private int[] f3722e;

        private C0805AO(Context context) {
            this.f3719b = new int[]{246, 251, 243, 253, 157, 214, 251, 192, 215, 219, 212, 219, Opcodes.IFNULL, 220, 215, 214, 251, 157, 192, 215, 214, 219, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 221, 192, 226, 214, 251, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 193, 223, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 221, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 219, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 223, 221, 209, 157, 157, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, Opcodes.IFNULL, 220, 215, Opcodes.IFNULL, 220, 221, 209, 0};
            this.f3720c = new int[]{231, 234, 226, 236, 0};
            this.f3722e = new int[]{CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 207, Opcodes.IFNONNULL, 201, 242, 227, 225, 0};
            this.f3721d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:10:0x0052  */
        /* JADX INFO: renamed from: a */
        public String m4675a(int i) {
            Cursor cursorQuery;
            String string = null;
            try {
                if (i == 4) {
                    if (Build.VERSION.SDK_INT > 27) {
                        cursorQuery = this.f3721d.getContentResolver().query(Uri.parse(AIClient.this.m4640a(this.f3719b)), null, null, null, null);
                    } else {
                        cursorQuery = null;
                    }
                } else if (i == 5) {
                    cursorQuery = this.f3721d.getContentResolver().query(Uri.parse(AIClient.this.m4640a(AIClient.f3647D)), null, null, new String[]{AIClient.this.m4640a(this.f3720c)}, null);
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null && !cursorQuery.isClosed()) {
                    string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex("value")) : null;
                    cursorQuery.close();
                }
            } catch (Throwable unused) {
            }
            return string;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public String m4674a() {
            try {
                ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f3721d.getContentResolver().acquireContentProviderClient(Uri.parse(AIClient.this.m4640a(AIClient.f3649F)));
                if (contentProviderClientAcquireContentProviderClient != null) {
                    Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call(AIClient.this.m4640a(this.f3722e), null, null);
                    contentProviderClientAcquireContentProviderClient.close();
                    if (bundleCall != null && bundleCall.getInt("code", -1) == 0) {
                        return bundleCall.getString("id");
                    }
                }
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m4646a(String str) {
        SharedPreferences sharedPreferences = this.f3696aa.getSharedPreferences(this.f3696aa.getPackageName() + m4640a(f3676g), 0);
        if (sharedPreferences != null) {
            return sharedPreferences.contains(str);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m4642a(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                if (!str.isEmpty() && !str2.isEmpty()) {
                    try {
                        byte[] bArr = new byte[3];
                        byte[] bArrEncode = Base64.encode(str.getBytes(), 0);
                        bArr[1] = 115;
                        if (bArrEncode != null) {
                            try {
                                byte[] bArr2 = new byte[bArrEncode.length];
                                int i = 0;
                                for (byte b : bArrEncode) {
                                    if (33 < b && b < 126) {
                                        bArr2[i] = b;
                                        i++;
                                    }
                                }
                                bArr[0] = 75;
                                byte[] bArr3 = new byte[i];
                                System.arraycopy(bArr2, 0, bArr3, 0, i);
                                bArr[2] = 90;
                                if (i < 256) {
                                    str = new String(bArr, "UTF-8") + new String(bArr3, "UTF-8");
                                }
                            } catch (Exception unused) {
                            }
                        }
                        SharedPreferences sharedPreferences = this.f3696aa.getSharedPreferences(this.f3696aa.getPackageName() + m4640a(f3676g), 0);
                        if (sharedPreferences != null) {
                            String string = sharedPreferences.getString(str2, "a");
                            if (string != null && string.equals(str)) {
                                return;
                            }
                            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                            editorEdit.putString(str2, str);
                            editorEdit.apply();
                        }
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4643a(String str, String str2, String str3, String str4) {
        IBinder iBinder;
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, String.class);
            if (declaredMethod != null && (iBinder = (IBinder) declaredMethod.invoke(null, str3)) != null) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    iBinder.transact(4, parcelObtain, parcelObtain2, 0);
                    String string = parcelObtain2.readString();
                    if (string != null && !string.isEmpty()) {
                        m4642a(string, str4);
                    }
                    parcelObtain.recycle();
                } catch (Exception unused) {
                    parcelObtain.recycle();
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                    throw th;
                }
                parcelObtain2.recycle();
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m4647a(String str, int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized String m4640a(int[] iArr) {
        String string = null;
        if (iArr == null) {
            return null;
        }
        try {
            int length = iArr.length;
            StringBuilder sb = new StringBuilder();
            int i = length + 126;
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 != 0) {
                    sb.append(Character.toString((char) (iArr[(length - i2) - 1] ^ i)));
                }
            }
            string = sb.toString();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
        return string;
    }
}
