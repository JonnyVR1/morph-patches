package org.spongycastle.crypto.engines;

import com.alibaba.fastjson.asm.Opcodes;
import java.lang.reflect.Array;
import okio.Utf8;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.signers.PSSSigner;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;
import org.spongycastle.util.Pack;
import p149l.C16968g;
import p149l.ig3;
import p149l.npk0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class AESEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* JADX INFO: renamed from: m1 */
    private static final int f206493m1 = -2139062144;

    /* JADX INFO: renamed from: m2 */
    private static final int f206494m2 = 2139062143;

    /* JADX INFO: renamed from: m3 */
    private static final int f206495m3 = 27;

    /* JADX INFO: renamed from: m4 */
    private static final int f206496m4 = -1061109568;

    /* JADX INFO: renamed from: m5 */
    private static final int f206497m5 = 1061109567;

    /* JADX INFO: renamed from: C0 */
    private int f206498C0;

    /* JADX INFO: renamed from: C1 */
    private int f206499C1;

    /* JADX INFO: renamed from: C2 */
    private int f206500C2;

    /* JADX INFO: renamed from: C3 */
    private int f206501C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;

    /* JADX INFO: renamed from: S */
    private static final byte[] f206490S = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, -52, 52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 90, -96, 82, HttpTokens.SEMI_COLON, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, HttpTokens.SPACE, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, 127, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, 33, Tnaf.POW_2_WIDTH, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 100, 93, 25, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, -32, 50, HttpTokens.COLON, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, -116, -95, -119, HttpTokens.CARRIAGE_RETURN, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, 22};

    /* JADX INFO: renamed from: Si */
    private static final byte[] f206491Si = {82, 9, 106, -43, 48, 54, -91, 56, -65, 64, -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 109, -117, -47, 37, 114, -8, -10, 100, -122, 104, -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 70, 87, -89, -115, -99, -124, -112, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, 88, 5, -72, -77, 69, 6, -48, 44, 30, -113, -54, Utf8.REPLACEMENT_BYTE, 15, 2, -63, -81, -67, 3, 1, 19, -118, 107, HttpTokens.COLON, -111, 17, 65, 79, 103, -36, -22, -105, -14, -49, -50, -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 98, 14, -86, 24, -66, 27, -4, 86, 62, 75, -58, -46, 121, HttpTokens.SPACE, -102, -37, -64, -2, 120, -51, 90, -12, 31, -35, -88, 51, -120, 7, -57, 49, -79, 18, Tnaf.POW_2_WIDTH, 89, 39, -128, -20, 95, 96, 81, 127, -87, 25, -75, 74, HttpTokens.CARRIAGE_RETURN, 45, -27, 122, -97, -109, -55, -100, -17, -96, -32, HttpTokens.SEMI_COLON, 77, -82, 42, -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 20, 99, 85, 33, 12, 125};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, 154, 47, 94, 188, 99, Opcodes.IFNULL, 151, 53, 106, 212, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 125, 250, 239, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA};

    /* JADX INFO: renamed from: T0 */
    private static final int[] f206492T0 = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    private static final int[] Tinv0 = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    private static int FFmulX(int i) {
        return (((i & f206493m1) >>> 7) * 27) ^ ((f206494m2 & i) << 1);
    }

    private static int FFmulX2(int i) {
        int i2 = (f206497m5 & i) << 2;
        int i3 = i & f206496m4;
        int i4 = i3 ^ (i3 >>> 1);
        return (i4 >>> 5) ^ (i2 ^ (i4 >>> 2));
    }

    private void decryptBlock(int[][] iArr) {
        int i = this.f206498C0;
        int i2 = this.ROUNDS;
        int[] iArr2 = iArr[i2];
        char c = 0;
        int i3 = i ^ iArr2[0];
        int i4 = 1;
        int i5 = this.f206499C1 ^ iArr2[1];
        char c2 = 2;
        int i6 = this.f206500C2 ^ iArr2[2];
        int i7 = i2 - 1;
        int iShift = iArr2[3] ^ this.f206501C3;
        while (i7 > i4) {
            int[] iArr3 = Tinv0;
            int iShift2 = (((iArr3[i3 & 255] ^ shift(iArr3[(iShift >> 8) & 255], 24)) ^ shift(iArr3[(i6 >> 16) & 255], 16)) ^ shift(iArr3[(i5 >> 24) & 255], 8)) ^ iArr[i7][c];
            char c3 = c;
            int iShift3 = (((shift(iArr3[(i3 >> 8) & 255], 24) ^ iArr3[i5 & 255]) ^ shift(iArr3[(iShift >> 16) & 255], 16)) ^ shift(iArr3[(i6 >> 24) & 255], 8)) ^ iArr[i7][i4];
            int i8 = i4;
            int iShift4 = (((shift(iArr3[(i5 >> 8) & 255], 24) ^ iArr3[i6 & 255]) ^ shift(iArr3[(i3 >> 16) & 255], 16)) ^ shift(iArr3[(iShift >> 24) & 255], 8)) ^ iArr[i7][c2];
            int iShift5 = shift(iArr3[(i3 >> 24) & 255], 8) ^ ((iArr3[iShift & 255] ^ shift(iArr3[(i6 >> 8) & 255], 24)) ^ shift(iArr3[(i5 >> 16) & 255], 16));
            int i9 = i7 - 1;
            int i10 = iShift5 ^ iArr[i7][3];
            int iShift6 = (((iArr3[iShift2 & 255] ^ shift(iArr3[(i10 >> 8) & 255], 24)) ^ shift(iArr3[(iShift4 >> 16) & 255], 16)) ^ shift(iArr3[(iShift3 >> 24) & 255], 8)) ^ iArr[i9][c3];
            int iShift7 = (((iArr3[iShift3 & 255] ^ shift(iArr3[(iShift2 >> 8) & 255], 24)) ^ shift(iArr3[(i10 >> 16) & 255], 16)) ^ shift(iArr3[(iShift4 >> 24) & 255], 8)) ^ iArr[i9][i8];
            char c4 = c2;
            int iShift8 = (((shift(iArr3[(iShift3 >> 8) & 255], 24) ^ iArr3[iShift4 & 255]) ^ shift(iArr3[(iShift2 >> 16) & 255], 16)) ^ shift(iArr3[(i10 >> 24) & 255], 8)) ^ iArr[i9][c4];
            i7 -= 2;
            iShift = iArr[i9][3] ^ (((iArr3[i10 & 255] ^ shift(iArr3[(iShift4 >> 8) & 255], 24)) ^ shift(iArr3[(iShift3 >> 16) & 255], 16)) ^ shift(iArr3[(iShift2 >> 24) & 255], 8));
            i3 = iShift6;
            i5 = iShift7;
            i6 = iShift8;
            c = c3;
            i4 = i8;
            c2 = c4;
        }
        char c5 = c;
        int i11 = i4;
        char c6 = c2;
        int[] iArr4 = Tinv0;
        int iShift9 = (((iArr4[i3 & 255] ^ shift(iArr4[(iShift >> 8) & 255], 24)) ^ shift(iArr4[(i6 >> 16) & 255], 16)) ^ shift(iArr4[(i5 >> 24) & 255], 8)) ^ iArr[i7][c5];
        int iShift10 = (((iArr4[i5 & 255] ^ shift(iArr4[(i3 >> 8) & 255], 24)) ^ shift(iArr4[(iShift >> 16) & 255], 16)) ^ shift(iArr4[(i6 >> 24) & 255], 8)) ^ iArr[i7][i11];
        int iShift11 = (((iArr4[i6 & 255] ^ shift(iArr4[(i5 >> 8) & 255], 24)) ^ shift(iArr4[(i3 >> 16) & 255], 16)) ^ shift(iArr4[(iShift >> 24) & 255], 8)) ^ iArr[i7][c6];
        int iShift12 = (shift(iArr4[(i3 >> 24) & 255], 8) ^ ((iArr4[iShift & 255] ^ shift(iArr4[(i6 >> 8) & 255], 24)) ^ shift(iArr4[(i5 >> 16) & 255], 16))) ^ iArr[i7][3];
        byte[] bArr = f206491Si;
        int i12 = (((bArr[iShift9 & 255] & 255) ^ ((bArr[(iShift12 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iShift11 >> 16) & 255] & 255) << 16)) ^ (bArr[(iShift10 >> 24) & 255] << 24);
        int[] iArr5 = iArr[c5];
        this.f206498C0 = i12 ^ iArr5[c5];
        this.f206499C1 = ((((bArr[iShift10 & 255] & 255) ^ ((bArr[(iShift9 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iShift12 >> 16) & 255] & 255) << 16)) ^ (bArr[(iShift11 >> 24) & 255] << 24)) ^ iArr5[i11];
        this.f206500C2 = ((((bArr[iShift11 & 255] & 255) ^ ((bArr[(iShift10 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iShift9 >> 16) & 255] & 255) << 16)) ^ (bArr[(iShift12 >> 24) & 255] << 24)) ^ iArr5[c6];
        this.f206501C3 = ((((bArr[iShift12 & 255] & 255) ^ ((bArr[(iShift11 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iShift10 >> 16) & 255] & 255) << 16)) ^ (bArr[(iShift9 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    private void encryptBlock(int[][] iArr) {
        int i = this.f206498C0;
        char c = 0;
        int[] iArr2 = iArr[0];
        int i2 = i ^ iArr2[0];
        int i3 = 1;
        int i4 = this.f206499C1 ^ iArr2[1];
        char c2 = 2;
        int i5 = this.f206500C2 ^ iArr2[2];
        int iShift = iArr2[3] ^ this.f206501C3;
        int i6 = 1;
        while (i6 < this.ROUNDS - i3) {
            int[] iArr3 = f206492T0;
            int iShift2 = (((iArr3[i2 & 255] ^ shift(iArr3[(i4 >> 8) & 255], 24)) ^ shift(iArr3[(i5 >> 16) & 255], 16)) ^ shift(iArr3[(iShift >> 24) & 255], 8)) ^ iArr[i6][c];
            char c3 = c;
            int iShift3 = (((shift(iArr3[(i5 >> 8) & 255], 24) ^ iArr3[i4 & 255]) ^ shift(iArr3[(iShift >> 16) & 255], 16)) ^ shift(iArr3[(i2 >> 24) & 255], 8)) ^ iArr[i6][i3];
            int i7 = i3;
            int iShift4 = (((shift(iArr3[(iShift >> 8) & 255], 24) ^ iArr3[i5 & 255]) ^ shift(iArr3[(i2 >> 16) & 255], 16)) ^ shift(iArr3[(i4 >> 24) & 255], 8)) ^ iArr[i6][c2];
            int iShift5 = ((shift(iArr3[(i2 >> 8) & 255], 24) ^ iArr3[iShift & 255]) ^ shift(iArr3[(i4 >> 16) & 255], 16)) ^ shift(iArr3[(i5 >> 24) & 255], 8);
            int i8 = i6 + 1;
            int i9 = iShift5 ^ iArr[i6][3];
            int iShift6 = (((iArr3[iShift2 & 255] ^ shift(iArr3[(iShift3 >> 8) & 255], 24)) ^ shift(iArr3[(iShift4 >> 16) & 255], 16)) ^ shift(iArr3[(i9 >> 24) & 255], 8)) ^ iArr[i8][c3];
            int iShift7 = (((iArr3[iShift3 & 255] ^ shift(iArr3[(iShift4 >> 8) & 255], 24)) ^ shift(iArr3[(i9 >> 16) & 255], 16)) ^ shift(iArr3[(iShift2 >> 24) & 255], 8)) ^ iArr[i8][i7];
            char c4 = c2;
            int iShift8 = (((shift(iArr3[(i9 >> 8) & 255], 24) ^ iArr3[iShift4 & 255]) ^ shift(iArr3[(iShift2 >> 16) & 255], 16)) ^ shift(iArr3[(iShift3 >> 24) & 255], 8)) ^ iArr[i8][c4];
            i6 += 2;
            iShift = (((iArr3[i9 & 255] ^ shift(iArr3[(iShift2 >> 8) & 255], 24)) ^ shift(iArr3[(iShift3 >> 16) & 255], 16)) ^ shift(iArr3[(iShift4 >> 24) & 255], 8)) ^ iArr[i8][3];
            i2 = iShift6;
            i4 = iShift7;
            i5 = iShift8;
            c = c3;
            i3 = i7;
            c2 = c4;
        }
        char c5 = c;
        int i10 = i3;
        char c6 = c2;
        int[] iArr4 = f206492T0;
        int iShift9 = (((iArr4[i2 & 255] ^ shift(iArr4[(i4 >> 8) & 255], 24)) ^ shift(iArr4[(i5 >> 16) & 255], 16)) ^ shift(iArr4[(iShift >> 24) & 255], 8)) ^ iArr[i6][c5];
        int iShift10 = (((iArr4[i4 & 255] ^ shift(iArr4[(i5 >> 8) & 255], 24)) ^ shift(iArr4[(iShift >> 16) & 255], 16)) ^ shift(iArr4[(i2 >> 24) & 255], 8)) ^ iArr[i6][i10];
        int iShift11 = (((iArr4[i5 & 255] ^ shift(iArr4[(iShift >> 8) & 255], 24)) ^ shift(iArr4[(i2 >> 16) & 255], 16)) ^ shift(iArr4[(i4 >> 24) & 255], 8)) ^ iArr[i6][c6];
        int iShift12 = (((shift(iArr4[(i2 >> 8) & 255], 24) ^ iArr4[iShift & 255]) ^ shift(iArr4[(i4 >> 16) & 255], 16)) ^ shift(iArr4[(i5 >> 24) & 255], 8)) ^ iArr[i6][3];
        byte[] bArr = f206490S;
        int i11 = (((bArr[iShift9 & 255] & 255) ^ ((bArr[(iShift10 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iShift11 >> 16) & 255] & 255) << 16)) ^ (bArr[(iShift12 >> 24) & 255] << 24);
        int[] iArr5 = iArr[i6 + 1];
        this.f206498C0 = i11 ^ iArr5[c5];
        this.f206499C1 = ((((bArr[iShift10 & 255] & 255) ^ ((bArr[(iShift11 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iShift12 >> 16) & 255] & 255) << 16)) ^ (bArr[(iShift9 >> 24) & 255] << 24)) ^ iArr5[i10];
        this.f206500C2 = ((((bArr[iShift11 & 255] & 255) ^ ((bArr[(iShift12 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iShift9 >> 16) & 255] & 255) << 16)) ^ (bArr[(iShift10 >> 24) & 255] << 24)) ^ iArr5[c6];
        this.f206501C3 = ((((bArr[iShift12 & 255] & 255) ^ ((bArr[(iShift9 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iShift10 >> 16) & 255] & 255) << 16)) ^ (bArr[(iShift11 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int i;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            ig3.m135964a("Key length not 128/192/256 bits.");
            return null;
        }
        int i2 = length >>> 2;
        this.ROUNDS = i2 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2 + 7, 4);
        if (i2 == 4) {
            i = 1;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt2;
            int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt3;
            int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt4;
            for (int i3 = 1; i3 <= 10; i3++) {
                iLittleEndianToInt ^= subWord(shift(iLittleEndianToInt4, 8)) ^ rcon[i3 - 1];
                int[] iArr2 = iArr[i3];
                iArr2[0] = iLittleEndianToInt;
                iLittleEndianToInt2 ^= iLittleEndianToInt;
                iArr2[1] = iLittleEndianToInt2;
                iLittleEndianToInt3 ^= iLittleEndianToInt2;
                iArr2[2] = iLittleEndianToInt3;
                iLittleEndianToInt4 ^= iLittleEndianToInt3;
                iArr2[3] = iLittleEndianToInt4;
            }
        } else if (i2 == 6) {
            i = 1;
            int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt5;
            int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt6;
            int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt7;
            int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt8;
            int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt9;
            int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt10;
            int iSubWord = iLittleEndianToInt5 ^ (subWord(shift(iLittleEndianToInt10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = iSubWord;
            int i4 = iLittleEndianToInt6 ^ iSubWord;
            iArr3[3] = i4;
            int i5 = iLittleEndianToInt7 ^ i4;
            int[] iArr4 = iArr[2];
            iArr4[0] = i5;
            int i6 = iLittleEndianToInt8 ^ i5;
            iArr4[1] = i6;
            int i7 = iLittleEndianToInt9 ^ i6;
            iArr4[2] = i7;
            int i8 = iLittleEndianToInt10 ^ i7;
            iArr4[3] = i8;
            int i9 = 2;
            for (int i10 = 3; i10 < 12; i10 += 3) {
                int iSubWord2 = iSubWord ^ (subWord(shift(i8, 8)) ^ i9);
                int[] iArr5 = iArr[i10];
                iArr5[0] = iSubWord2;
                int i11 = i4 ^ iSubWord2;
                iArr5[1] = i11;
                int i12 = i5 ^ i11;
                iArr5[2] = i12;
                int i13 = i6 ^ i12;
                iArr5[3] = i13;
                int i14 = i7 ^ i13;
                int i15 = i10 + 1;
                int[] iArr6 = iArr[i15];
                iArr6[0] = i14;
                int i16 = i8 ^ i14;
                iArr6[1] = i16;
                int iSubWord3 = subWord(shift(i16, 8)) ^ (i9 << 1);
                i9 <<= 2;
                iSubWord = iSubWord2 ^ iSubWord3;
                int[] iArr7 = iArr[i15];
                iArr7[2] = iSubWord;
                i4 = i11 ^ iSubWord;
                iArr7[3] = i4;
                i5 = i12 ^ i4;
                int[] iArr8 = iArr[i10 + 2];
                iArr8[0] = i5;
                i6 = i13 ^ i5;
                iArr8[1] = i6;
                i7 = i14 ^ i6;
                iArr8[2] = i7;
                i8 = i16 ^ i7;
                iArr8[3] = i8;
            }
            int iSubWord4 = (subWord(shift(i8, 8)) ^ i9) ^ iSubWord;
            int[] iArr9 = iArr[12];
            iArr9[0] = iSubWord4;
            int i17 = iSubWord4 ^ i4;
            iArr9[1] = i17;
            int i18 = i17 ^ i5;
            iArr9[2] = i18;
            iArr9[3] = i18 ^ i6;
        } else {
            if (i2 != 8) {
                qkq0.m175383a("Should never get here");
                return null;
            }
            int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = iLittleEndianToInt11;
            int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = iLittleEndianToInt12;
            int iLittleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = iLittleEndianToInt13;
            int iLittleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = iLittleEndianToInt14;
            int iLittleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = iLittleEndianToInt15;
            int iLittleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = iLittleEndianToInt16;
            int iLittleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = iLittleEndianToInt17;
            int iLittleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = iLittleEndianToInt18;
            int i19 = 1;
            i = 1;
            for (int i20 = 2; i20 < 14; i20 += 2) {
                int iSubWord5 = subWord(shift(iLittleEndianToInt18, 8)) ^ i19;
                i19 <<= 1;
                iLittleEndianToInt11 ^= iSubWord5;
                int[] iArr10 = iArr[i20];
                iArr10[0] = iLittleEndianToInt11;
                iLittleEndianToInt12 ^= iLittleEndianToInt11;
                iArr10[1] = iLittleEndianToInt12;
                iLittleEndianToInt13 ^= iLittleEndianToInt12;
                iArr10[2] = iLittleEndianToInt13;
                iLittleEndianToInt14 ^= iLittleEndianToInt13;
                iArr10[3] = iLittleEndianToInt14;
                iLittleEndianToInt15 ^= subWord(iLittleEndianToInt14);
                int[] iArr11 = iArr[i20 + 1];
                iArr11[0] = iLittleEndianToInt15;
                iLittleEndianToInt16 ^= iLittleEndianToInt15;
                iArr11[1] = iLittleEndianToInt16;
                iLittleEndianToInt17 ^= iLittleEndianToInt16;
                iArr11[2] = iLittleEndianToInt17;
                iLittleEndianToInt18 ^= iLittleEndianToInt17;
                iArr11[3] = iLittleEndianToInt18;
            }
            int iSubWord6 = (subWord(shift(iLittleEndianToInt18, 8)) ^ i19) ^ iLittleEndianToInt11;
            int[] iArr12 = iArr[14];
            iArr12[0] = iSubWord6;
            int i21 = iSubWord6 ^ iLittleEndianToInt12;
            iArr12[1] = i21;
            int i22 = i21 ^ iLittleEndianToInt13;
            iArr12[2] = i22;
            iArr12[3] = i22 ^ iLittleEndianToInt14;
        }
        if (!z) {
            for (int i23 = i; i23 < this.ROUNDS; i23++) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int[] iArr13 = iArr[i23];
                    iArr13[i24] = inv_mcol(iArr13[i24]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i) {
        int iShift = shift(i, 8) ^ i;
        int iFFmulX = i ^ FFmulX(iShift);
        int iFFmulX2 = iShift ^ FFmulX2(iFFmulX);
        return iFFmulX ^ (iFFmulX2 ^ shift(iFFmulX2, 16));
    }

    private void packBlock(byte[] bArr, int i) {
        int i2 = this.f206498C0;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
        int i3 = this.f206499C1;
        bArr[i + 4] = (byte) i3;
        bArr[i + 5] = (byte) (i3 >> 8);
        bArr[i + 6] = (byte) (i3 >> 16);
        bArr[i + 7] = (byte) (i3 >> 24);
        int i4 = this.f206500C2;
        bArr[i + 8] = (byte) i4;
        bArr[i + 9] = (byte) (i4 >> 8);
        bArr[i + 10] = (byte) (i4 >> 16);
        bArr[i + 11] = (byte) (i4 >> 24);
        int i5 = this.f206501C3;
        bArr[i + 12] = (byte) i5;
        bArr[i + 13] = (byte) (i5 >> 8);
        bArr[i + 14] = (byte) (i5 >> 16);
        bArr[i + 15] = (byte) (i5 >> 24);
    }

    private static int shift(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private static int subWord(int i) {
        byte[] bArr = f206490S;
        return (bArr[(i >> 24) & 255] << 24) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    private void unpackBlock(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        this.f206498C0 = i2;
        int i3 = ((bArr[i + 1] & 255) << 8) | i2;
        this.f206498C0 = i3;
        int i4 = i3 | ((bArr[i + 2] & 255) << 16);
        this.f206498C0 = i4;
        this.f206498C0 = i4 | (bArr[i + 3] << 24);
        int i5 = bArr[i + 4] & 255;
        this.f206499C1 = i5;
        int i6 = ((bArr[i + 5] & 255) << 8) | i5;
        this.f206499C1 = i6;
        int i7 = i6 | ((bArr[i + 6] & 255) << 16);
        this.f206499C1 = i7;
        this.f206499C1 = i7 | (bArr[i + 7] << 24);
        int i8 = bArr[i + 8] & 255;
        this.f206500C2 = i8;
        int i9 = ((bArr[i + 9] & 255) << 8) | i8;
        this.f206500C2 = i9;
        int i10 = i9 | ((bArr[i + 10] & 255) << 16);
        this.f206500C2 = i10;
        this.f206500C2 = i10 | (bArr[i + 11] << 24);
        int i11 = bArr[i + 12] & 255;
        this.f206501C3 = i11;
        int i12 = ((bArr[i + 13] & 255) << 8) | i11;
        this.f206501C3 = i12;
        int i13 = i12 | ((bArr[i + 14] & 255) << 16);
        this.f206501C3 = i13;
        this.f206501C3 = (bArr[i + 15] << 24) | i13;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            ig3.m135964a("invalid parameter passed to AES init - ".concat(cipherParameters.getClass().getName()));
        } else {
            this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
            this.forEncryption = z;
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.WorkingKey == null) {
            qkq0.m175383a("AES engine not initialised");
            return 0;
        }
        if (i + 16 > bArr.length) {
            npk0.m160508a("input buffer too short");
            return 0;
        }
        if (i2 + 16 > bArr2.length) {
            C16968g.m123940a("output buffer too short");
            return 0;
        }
        if (this.forEncryption) {
            unpackBlock(bArr, i);
            encryptBlock(this.WorkingKey);
            packBlock(bArr2, i2);
            return 16;
        }
        unpackBlock(bArr, i);
        decryptBlock(this.WorkingKey);
        packBlock(bArr2, i2);
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
