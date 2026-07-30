package com.clevertap.android.pushsdk;

import com.alibaba.fastjson.asm.Opcodes;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes.dex */
public class values {
    private final Object[] Class;
    public double Movie;
    private final int[] decodeByteArray;
    private final float[] duration;
    private final long[] height;
    private int isOpaque;
    public Object onContextItemSelected;
    public float onOptionsItemSelected;
    public int openContextMenu;
    public long registerForContextMenu;
    public int setContentView;
    private int setTime;
    private final double[] sync;
    public long unregisterForContextMenu;
    public float valueOf;
    public double values;
    public Object width;

    public values(Object obj, Object obj2, Object obj3) {
        this.decodeByteArray = new int[16];
        this.height = new long[16];
        this.duration = new float[16];
        this.sync = new double[16];
        Object[] objArr = new Object[16];
        this.Class = objArr;
        objArr[7] = obj;
        objArr[8] = obj2;
        objArr[9] = obj3;
        this.isOpaque = 0;
        this.setTime = -1;
    }

    public int openContextMenu(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.Class;
                int i2 = this.isOpaque;
                this.isOpaque = i2 + 1;
                objArr[i2] = objArr[7];
                return 0;
            case 2:
                Object[] objArr2 = this.Class;
                int i3 = this.isOpaque;
                this.isOpaque = i3 + 1;
                objArr2[i3] = this.onContextItemSelected;
                return 0;
            case 3:
                int[] iArr = this.decodeByteArray;
                int i4 = this.isOpaque;
                this.isOpaque = i4 + 1;
                iArr[i4] = 22;
                return 0;
            case 4:
                int[] iArr2 = this.decodeByteArray;
                int i5 = this.isOpaque;
                this.isOpaque = i5 + 1;
                iArr2[i5] = this.openContextMenu;
                return 0;
            case 5:
                int[] iArr3 = this.decodeByteArray;
                int i6 = this.isOpaque;
                this.isOpaque = i6 + 1;
                iArr3[i6] = 16;
                return 0;
            case 6:
                int i7 = this.isOpaque;
                int i8 = i7 - 1;
                this.isOpaque = i8;
                int[] iArr4 = this.decodeByteArray;
                iArr4[i7 - 2] = iArr4[i7 - 2] >> iArr4[i8];
                return 0;
            case 7:
                int i9 = this.isOpaque - this.openContextMenu;
                this.isOpaque = i9;
                this.setTime = i9;
                return 0;
            case 8:
                Object[] objArr3 = this.Class;
                int i10 = this.setTime;
                this.setTime = i10 + 1;
                Object obj = objArr3[i10];
                objArr3[i10] = null;
                this.width = obj;
                return 0;
            case 9:
                int[] iArr5 = this.decodeByteArray;
                int i11 = this.setTime;
                this.setTime = i11 + 1;
                this.setContentView = iArr5[i11];
                return 0;
            case 10:
                int i12 = this.isOpaque;
                int i13 = i12 - 1;
                this.isOpaque = i13;
                int[] iArr6 = this.decodeByteArray;
                iArr6[i12 - 2] = iArr6[i12 - 2] - iArr6[i13];
                return 0;
            case 11:
                int[] iArr7 = this.decodeByteArray;
                int i14 = this.isOpaque;
                this.isOpaque = i14 + 1;
                iArr7[i14] = 2;
                return 0;
            case 12:
                int[] iArr8 = this.decodeByteArray;
                int i15 = this.isOpaque;
                this.isOpaque = i15 + 1;
                iArr8[i15] = 2;
                this.isOpaque = i15;
                iArr8[i15 - 1] = iArr8[i15 - 1] % iArr8[i15];
                int i16 = i15 - 1;
                this.isOpaque = i16;
                this.Class[i16] = null;
                return 0;
            case 14:
                int[] iArr9 = this.decodeByteArray;
                int i17 = this.isOpaque;
                this.isOpaque = i17 + 1;
                iArr9[i17] = 49;
                this.isOpaque = i17;
                iArr9[i17 - 1] = iArr9[i17 - 1] + iArr9[i17];
            case 13:
                return 0;
            case 15:
                int[] iArr10 = this.decodeByteArray;
                int i18 = this.isOpaque;
                this.isOpaque = i18 + 1;
                iArr10[i18] = iArr10[i18 - 1];
                return 0;
            case 16:
                int[] iArr11 = this.decodeByteArray;
                int i19 = this.isOpaque;
                this.isOpaque = i19 + 1;
                iArr11[i19] = 128;
                return 0;
            case 17:
                int i20 = this.isOpaque;
                int i21 = i20 - 1;
                this.isOpaque = i21;
                int[] iArr12 = this.decodeByteArray;
                iArr12[i20 - 2] = iArr12[i20 - 2] % iArr12[i21];
                return 0;
            case 18:
                int i22 = this.isOpaque - 1;
                this.isOpaque = i22;
                this.setContentView = this.decodeByteArray[i22] == 0 ? 0 : 1;
                return 0;
            case 19:
                int[] iArr13 = this.decodeByteArray;
                int i23 = this.isOpaque;
                this.isOpaque = i23 + 1;
                iArr13[i23] = 2;
                this.isOpaque = i23;
                iArr13[i23 - 1] = iArr13[i23 - 1] % iArr13[i23];
                return 0;
            case 20:
                int[] iArr14 = this.decodeByteArray;
                int i24 = this.isOpaque;
                this.isOpaque = i24 + 1;
                iArr14[i24] = 47;
                return 0;
            case 21:
                int[] iArr15 = this.decodeByteArray;
                int i25 = this.isOpaque;
                this.isOpaque = i25 + 1;
                iArr15[i25] = 122;
                this.isOpaque = i25;
                iArr15[i25 - 1] = iArr15[i25 - 1] - iArr15[i25];
                int i26 = i25 - 1;
                this.isOpaque = i26;
                iArr15[i25 - 2] = iArr15[i25 - 2] << iArr15[i26];
                return 0;
            case 22:
                int[] iArr16 = this.decodeByteArray;
                int i27 = this.isOpaque - 1;
                this.isOpaque = i27;
                this.setContentView = iArr16[i27];
                return 0;
            case 23:
                int[] iArr17 = this.decodeByteArray;
                int i28 = this.isOpaque;
                this.isOpaque = i28 + 1;
                iArr17[i28] = 44;
                return 0;
            case 24:
                int[] iArr18 = this.decodeByteArray;
                int i29 = this.isOpaque;
                this.isOpaque = i29 + 1;
                iArr18[i29] = 5;
                return 0;
            case 25:
                int[] iArr19 = this.decodeByteArray;
                int i30 = this.isOpaque;
                this.isOpaque = i30 + 1;
                iArr19[i30] = 3;
                return 0;
            case 26:
                int[] iArr20 = this.decodeByteArray;
                int i31 = this.isOpaque;
                int i32 = i31 + 1;
                this.isOpaque = i32;
                iArr20[i31] = 37;
                this.isOpaque = i31 + 2;
                iArr20[i32] = 0;
                return 0;
            case 27:
                int[] iArr21 = this.decodeByteArray;
                int i33 = this.isOpaque;
                this.isOpaque = i33 + 1;
                iArr21[i33] = 0;
                return 0;
            case 28:
                int i34 = this.isOpaque;
                int i35 = i34 - 1;
                this.isOpaque = i35;
                int[] iArr22 = this.decodeByteArray;
                iArr22[i34 - 2] = iArr22[i34 - 2] + iArr22[i35];
                return 0;
            case 29:
                long[] jArr = this.height;
                int i36 = this.isOpaque;
                this.isOpaque = i36 + 1;
                jArr[i36] = this.registerForContextMenu;
                return 0;
            case 30:
                int i37 = this.isOpaque - 1;
                this.isOpaque = i37;
                long[] jArr2 = this.height;
                jArr2[9] = jArr2[i37];
                return 0;
            case 31:
                int[] iArr23 = this.decodeByteArray;
                int i38 = this.isOpaque;
                int i39 = i38 + 1;
                this.isOpaque = i39;
                iArr23[i38] = 0;
                this.isOpaque = i38 + 2;
                iArr23[i39] = 0;
                return 0;
            case 32:
                int[] iArr24 = this.decodeByteArray;
                int i40 = this.isOpaque;
                int i41 = i40 + 1;
                this.isOpaque = i41;
                iArr24[i40] = -26;
                this.isOpaque = i40 + 2;
                iArr24[i41] = 48;
                return 0;
            case 33:
                long[] jArr3 = this.height;
                int i42 = this.isOpaque;
                int i43 = i42 + 1;
                this.isOpaque = i43;
                jArr3[i42] = jArr3[9];
                Object[] objArr4 = this.Class;
                this.isOpaque = i42 + 2;
                objArr4[i43] = objArr4[7];
                return 0;
            case 34:
                int i44 = this.isOpaque;
                int i45 = i44 - 1;
                this.isOpaque = i45;
                long[] jArr4 = this.height;
                jArr4[i44 - 2] = jArr4[i44 - 2] - jArr4[i45];
                return 0;
            case 35:
                long[] jArr5 = this.height;
                int i46 = this.setTime;
                this.setTime = i46 + 1;
                this.unregisterForContextMenu = jArr5[i46];
                return 0;
            case 36:
                int[] iArr25 = this.decodeByteArray;
                int i47 = this.isOpaque;
                this.isOpaque = i47 + 1;
                iArr25[i47] = 48;
                return 0;
            case 37:
                float[] fArr = this.duration;
                int i48 = this.isOpaque;
                this.isOpaque = i48 + 1;
                fArr[i48] = this.onOptionsItemSelected;
                return 0;
            case 38:
                float[] fArr2 = this.duration;
                int i49 = this.isOpaque;
                this.isOpaque = i49 + 1;
                fArr2[i49] = 0.0f;
                this.isOpaque = i49;
                this.decodeByteArray[i49 - 1] = (fArr2[i49 - 1] > fArr2[i49] ? 1 : (fArr2[i49 - 1] == fArr2[i49] ? 0 : -1));
                return 0;
            case 39:
                Object[] objArr5 = this.Class;
                int i50 = this.isOpaque;
                this.isOpaque = i50 + 1;
                objArr5[i50] = objArr5[8];
                return 0;
            case 40:
                int i51 = this.isOpaque - 1;
                this.isOpaque = i51;
                Object[] objArr6 = this.Class;
                Object obj2 = objArr6[i51];
                objArr6[i51] = null;
                this.setContentView = obj2 == null ? 0 : 1;
                return 0;
            case 41:
                int i52 = this.isOpaque - 1;
                this.isOpaque = i52;
                this.setContentView = this.decodeByteArray[i52] != 0 ? 0 : 1;
                return 0;
            case 42:
                int[] iArr26 = this.decodeByteArray;
                int i53 = this.isOpaque;
                this.isOpaque = i53 + 1;
                iArr26[i53] = 1;
                return 0;
            case 43:
                int[] iArr27 = this.decodeByteArray;
                int i54 = this.isOpaque;
                int i55 = i54 + 1;
                this.isOpaque = i55;
                iArr27[i54] = 2;
                this.isOpaque = i54 + 2;
                iArr27[i55] = 2;
                return 0;
            case 44:
                int i56 = this.isOpaque - 1;
                this.isOpaque = i56;
                this.Class[i56] = null;
                return 0;
            case 45:
                int[] iArr28 = this.decodeByteArray;
                int i57 = this.isOpaque;
                this.isOpaque = i57 + 1;
                iArr28[i57] = 5;
                this.isOpaque = i57;
                iArr28[i57 - 1] = iArr28[i57 - 1] + iArr28[i57];
                return 0;
            case 46:
                int[] iArr29 = this.decodeByteArray;
                int i58 = this.isOpaque;
                int i59 = i58 + 1;
                this.isOpaque = i59;
                iArr29[i58] = iArr29[i58 - 1];
                this.isOpaque = i58 + 2;
                iArr29[i59] = 128;
                int i60 = i58 + 1;
                this.isOpaque = i60;
                iArr29[i58] = iArr29[i58] % iArr29[i60];
                return 0;
            case 47:
                int[] iArr30 = this.decodeByteArray;
                int i61 = this.isOpaque;
                this.isOpaque = i61 + 1;
                iArr30[i61] = 105;
                return 0;
            case 48:
                int i62 = this.isOpaque;
                int i63 = i62 - 1;
                this.isOpaque = i63;
                int[] iArr31 = this.decodeByteArray;
                iArr31[i62 - 2] = iArr31[i62 - 2] + iArr31[i63];
                this.isOpaque = i62;
                iArr31[i63] = iArr31[i62 - 2];
                return 0;
            case 49:
                int[] iArr32 = this.decodeByteArray;
                int i64 = this.isOpaque;
                int i65 = i64 + 1;
                this.isOpaque = i65;
                iArr32[i64] = 4;
                this.isOpaque = i64 + 2;
                iArr32[i65] = 5;
                return 0;
            case 50:
                int i66 = this.isOpaque;
                int i67 = i66 - 1;
                this.isOpaque = i67;
                int[] iArr33 = this.decodeByteArray;
                iArr33[i66 - 2] = iArr33[i66 - 2] % iArr33[i67];
                int i68 = i66 - 2;
                this.isOpaque = i68;
                this.Class[i68] = null;
                return 0;
            case 51:
                int[] iArr34 = this.decodeByteArray;
                int i69 = this.isOpaque;
                this.isOpaque = i69 + 1;
                iArr34[i69] = 9;
                return 0;
            case 52:
                int[] iArr35 = this.decodeByteArray;
                int i70 = this.isOpaque;
                this.isOpaque = i70 + 1;
                iArr35[i70] = 25;
                return 0;
            case 53:
                int[] iArr36 = this.decodeByteArray;
                int i71 = this.isOpaque;
                this.isOpaque = i71 + 1;
                iArr36[i71] = 62;
                return 0;
            case 54:
                int[] iArr37 = this.decodeByteArray;
                int i72 = this.isOpaque;
                this.isOpaque = i72 + 1;
                iArr37[i72] = 7;
                return 0;
            case 55:
                int i73 = this.isOpaque - 1;
                while (true) {
                    Object[] objArr7 = this.Class;
                    if (i73 < 0) {
                        this.isOpaque = 1;
                        objArr7[0] = this.onContextItemSelected;
                        return 0;
                    }
                    objArr7[i73] = null;
                    i73--;
                }
                break;
            case 56:
                int i74 = this.isOpaque - 1;
                this.isOpaque = i74;
                Object[] objArr8 = this.Class;
                Object obj3 = objArr8[i74];
                objArr8[i74] = null;
                this.setContentView = obj3 != null ? 0 : 1;
                return 0;
            case 57:
                Object[] objArr9 = this.Class;
                int i75 = this.isOpaque;
                this.isOpaque = i75 + 1;
                objArr9[i75] = objArr9[9];
                return 0;
            case 58:
                Object[] objArr10 = this.Class;
                int i76 = this.isOpaque;
                this.isOpaque = i76 + 1;
                objArr10[i76] = objArr10[i76 - 1];
                return 0;
            case 59:
                int i77 = this.isOpaque - 1;
                this.isOpaque = i77;
                Object[] objArr11 = this.Class;
                Object obj4 = objArr11[i77];
                objArr11[i77] = null;
                objArr11[10] = obj4;
                return 0;
            case 60:
                Object[] objArr12 = this.Class;
                int i78 = this.isOpaque;
                this.isOpaque = i78 + 1;
                objArr12[i78] = objArr12[i78 - 1];
                this.isOpaque = i78;
                Object obj5 = objArr12[i78];
                objArr12[i78] = null;
                objArr12[11] = obj5;
                return 0;
            case 61:
                int[] iArr38 = this.decodeByteArray;
                int i79 = this.isOpaque;
                this.isOpaque = i79 + 1;
                iArr38[i79] = 6;
                return 0;
            case 62:
                int[] iArr39 = this.decodeByteArray;
                int i80 = this.isOpaque;
                int i81 = i80 + 1;
                this.isOpaque = i81;
                iArr39[i80] = 48;
                this.isOpaque = i80 + 2;
                iArr39[i81] = 0;
                return 0;
            case 63:
                int[] iArr40 = this.decodeByteArray;
                int i82 = this.isOpaque;
                this.isOpaque = i82 + 1;
                iArr40[i82] = 4;
                return 0;
            case 64:
                int i83 = this.isOpaque - 1;
                this.isOpaque = i83;
                long[] jArr6 = this.height;
                jArr6[12] = jArr6[i83];
                return 0;
            case 65:
                long[] jArr7 = this.height;
                int i84 = this.isOpaque;
                this.isOpaque = i84 + 1;
                jArr7[i84] = jArr7[12];
                return 0;
            case 66:
                int i85 = this.isOpaque - 1;
                this.isOpaque = i85;
                long[] jArr8 = this.height;
                jArr8[14] = jArr8[i85];
                return 0;
            case 67:
                Object[] objArr13 = this.Class;
                int i86 = this.isOpaque;
                int i87 = i86 + 1;
                this.isOpaque = i87;
                objArr13[i86] = objArr13[7];
                this.isOpaque = i86 + 2;
                objArr13[i87] = objArr13[9];
                return 0;
            case 68:
                Object[] objArr14 = this.Class;
                int i88 = this.isOpaque;
                this.isOpaque = i88 + 1;
                objArr14[i88] = objArr14[11];
                return 0;
            case 69:
                Object[] objArr15 = this.Class;
                int i89 = this.isOpaque;
                this.isOpaque = i89 + 1;
                objArr15[i89] = objArr15[10];
                return 0;
            case 70:
                int i90 = this.isOpaque - 1;
                this.isOpaque = i90;
                Object[] objArr16 = this.Class;
                Object obj6 = objArr16[i90];
                objArr16[i90] = null;
                objArr16[12] = obj6;
                return 0;
            case 71:
                Object[] objArr17 = this.Class;
                int i91 = this.isOpaque;
                int i92 = i91 + 1;
                this.isOpaque = i92;
                objArr17[i91] = objArr17[12];
                long[] jArr9 = this.height;
                int i93 = i91 + 2;
                this.isOpaque = i93;
                jArr9[i92] = jArr9[14];
                this.isOpaque = i91 + 3;
                objArr17[i93] = objArr17[11];
                return 0;
            case 72:
                int i94 = this.isOpaque;
                int i95 = i94 - 1;
                this.isOpaque = i95;
                Object[] objArr18 = this.Class;
                Object obj7 = objArr18[i95];
                objArr18[i95] = null;
                objArr18[8] = obj7;
                this.isOpaque = i94;
                objArr18[i95] = obj7;
                return 0;
            case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                int[] iArr41 = this.decodeByteArray;
                int i96 = this.isOpaque;
                this.isOpaque = i96 + 1;
                iArr41[i96] = 79;
                this.isOpaque = i96;
                iArr41[i96 - 1] = iArr41[i96 - 1] + iArr41[i96];
                this.isOpaque = i96 + 1;
                iArr41[i96] = iArr41[i96 - 1];
                return 0;
            case 74:
                int[] iArr42 = this.decodeByteArray;
                int i97 = this.isOpaque;
                this.isOpaque = i97 + 1;
                iArr42[i97] = 128;
                this.isOpaque = i97;
                iArr42[i97 - 1] = iArr42[i97 - 1] % iArr42[i97];
                return 0;
            case 75:
                int[] iArr43 = this.decodeByteArray;
                int i98 = this.isOpaque;
                this.isOpaque = i98 + 1;
                iArr43[i98] = 3;
                this.isOpaque = i98;
                iArr43[i98 - 1] = iArr43[i98 - 1] << iArr43[i98];
                return 0;
            case 76:
                int[] iArr44 = this.decodeByteArray;
                int i99 = this.isOpaque;
                this.isOpaque = i99 + 1;
                iArr44[i99] = 47;
                this.isOpaque = i99;
                iArr44[i99 - 1] = iArr44[i99 - 1] + iArr44[i99];
                this.isOpaque = i99 + 1;
                iArr44[i99] = iArr44[i99 - 1];
                return 0;
            case 77:
                int[] iArr45 = this.decodeByteArray;
                int i100 = this.isOpaque;
                this.isOpaque = i100 + 1;
                iArr45[i100] = 101;
                return 0;
            case 78:
                int[] iArr46 = this.decodeByteArray;
                int i101 = this.isOpaque;
                this.isOpaque = i101 + 1;
                iArr46[i101] = 89;
                this.isOpaque = i101;
                iArr46[i101 - 1] = iArr46[i101 - 1] + iArr46[i101];
                return 0;
            case 79:
                Object[] objArr19 = this.Class;
                int i102 = this.isOpaque;
                Object obj8 = objArr19[i102 - 1];
                objArr19[i102 - 1] = null;
                this.width = obj8;
                return 0;
            case 80:
                int[] iArr47 = this.decodeByteArray;
                int i103 = this.isOpaque;
                this.isOpaque = i103 + 1;
                iArr47[i103] = 71;
                return 0;
            case EACTags.FILE_REFERENCE /* 81 */:
                int[] iArr48 = this.decodeByteArray;
                int i104 = this.isOpaque;
                this.isOpaque = i104 + 1;
                iArr48[i104] = 0;
                return 0;
            case EACTags.COMMAND_TO_PERFORM /* 82 */:
                int i105 = this.isOpaque;
                int i106 = i105 - 1;
                this.isOpaque = i106;
                int[] iArr49 = this.decodeByteArray;
                iArr49[i105 - 2] = iArr49[i105 - 2] / iArr49[i106];
                int i107 = i105 - 2;
                this.isOpaque = i107;
                this.Class[i107] = null;
                return 0;
            case EACTags.DISCRETIONARY_DATA /* 83 */:
                int[] iArr50 = this.decodeByteArray;
                int i108 = this.isOpaque;
                this.isOpaque = i108 + 1;
                iArr50[i108] = 80;
                return 0;
            case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                int[] iArr51 = this.decodeByteArray;
                int i109 = this.isOpaque;
                this.isOpaque = i109 + 1;
                iArr51[i109] = 99;
                return 0;
            case 85:
                int[] iArr52 = this.decodeByteArray;
                int i110 = this.isOpaque;
                this.isOpaque = i110 + 1;
                iArr52[i110] = 99;
                this.isOpaque = i110;
                iArr52[i110 - 1] = iArr52[i110 - 1] + iArr52[i110];
                this.isOpaque = i110 + 1;
                iArr52[i110] = iArr52[i110 - 1];
                return 0;
            case EACTags.TRACK1_APPLICATION /* 86 */:
                int[] iArr53 = this.decodeByteArray;
                int i111 = this.isOpaque;
                this.isOpaque = i111 + 1;
                iArr53[i111] = 67;
                this.isOpaque = i111;
                iArr53[i111 - 1] = iArr53[i111 - 1] + iArr53[i111];
                return 0;
            case 87:
                int[] iArr54 = this.decodeByteArray;
                int i112 = this.isOpaque;
                int i113 = i112 + 1;
                this.isOpaque = i113;
                iArr54[i112] = iArr54[i112 - 1];
                this.isOpaque = i112 + 2;
                iArr54[i113] = 128;
                return 0;
            case 88:
                int[] iArr55 = this.decodeByteArray;
                int i114 = this.isOpaque;
                int i115 = i114 + 1;
                this.isOpaque = i115;
                iArr55[i114] = 2;
                this.isOpaque = i114 + 2;
                iArr55[i115] = 2;
                int i116 = i114 + 1;
                this.isOpaque = i116;
                iArr55[i114] = iArr55[i114] % iArr55[i116];
                return 0;
            case 89:
                int[] iArr56 = this.decodeByteArray;
                int i117 = this.isOpaque;
                this.isOpaque = i117 + 1;
                iArr56[i117] = 19;
                return 0;
            case 90:
                Object[] objArr20 = this.Class;
                int i118 = this.isOpaque;
                this.isOpaque = i118 + 1;
                objArr20[i118] = null;
                return 0;
            case EACTags.NAME /* 91 */:
                int[] iArr57 = this.decodeByteArray;
                int i119 = this.isOpaque;
                this.isOpaque = i119 + 1;
                iArr57[i119] = 31;
                return 0;
            case EACTags.TAG_LIST /* 92 */:
                int i120 = this.isOpaque;
                int i121 = i120 - 1;
                this.isOpaque = i121;
                int[] iArr58 = this.decodeByteArray;
                iArr58[i120 - 2] = iArr58[i120 - 2] + iArr58[i121];
                this.isOpaque = i120;
                iArr58[i121] = iArr58[i120 - 2];
                this.isOpaque = i120 + 1;
                iArr58[i120] = 128;
                return 0;
            case EACTags.HEADER_LIST /* 93 */:
                int[] iArr59 = this.decodeByteArray;
                int i122 = this.isOpaque;
                this.isOpaque = i122 + 1;
                iArr59[i122] = 75;
                return 0;
            case EACTags.LOGIN_DATA /* 94 */:
                int[] iArr60 = this.decodeByteArray;
                int i123 = this.isOpaque;
                this.isOpaque = i123 + 1;
                iArr60[i123] = 50;
                return 0;
            case 95:
                int[] iArr61 = this.decodeByteArray;
                int i124 = this.isOpaque;
                this.isOpaque = i124 + 1;
                iArr61[i124] = 11;
                return 0;
            case Opcodes.IADD /* 96 */:
                Object[] objArr21 = this.Class;
                int i125 = this.isOpaque;
                int i126 = i125 + 1;
                this.isOpaque = i126;
                objArr21[i125] = objArr21[8];
                this.isOpaque = i125 + 2;
                Object obj9 = objArr21[i125];
                objArr21[i125] = null;
                objArr21[i126] = obj9;
                Object obj10 = objArr21[i125 - 1];
                objArr21[i125 - 1] = null;
                objArr21[i125] = obj10;
                objArr21[i125 - 1] = obj9;
                return 0;
            case EACTags.APPLICATION_TEMPLATE /* 97 */:
                int[] iArr62 = this.decodeByteArray;
                int i127 = this.isOpaque;
                this.isOpaque = i127 + 1;
                iArr62[i127] = 41;
                return 0;
            case EACTags.FCP_TEMPLATE /* 98 */:
                Object[] objArr22 = this.Class;
                int i128 = this.isOpaque;
                this.isOpaque = i128 + 1;
                objArr22[i128] = null;
                int[] iArr63 = this.decodeByteArray;
                Object obj11 = objArr22[i128];
                objArr22[i128] = null;
                iArr63[i128] = ((int[]) obj11).length;
                return 0;
            case 99:
                Object[] objArr23 = this.Class;
                int i129 = this.isOpaque;
                int i130 = i129 + 1;
                this.isOpaque = i130;
                objArr23[i129] = objArr23[7];
                long[] jArr10 = this.height;
                this.isOpaque = i129 + 2;
                jArr10[i130] = jArr10[8];
                return 0;
            case 100:
                long[] jArr11 = this.height;
                int i131 = this.isOpaque;
                this.isOpaque = i131 + 1;
                long j = jArr11[i131 - 1];
                jArr11[i131] = j;
                Object[] objArr24 = this.Class;
                Object obj12 = objArr24[i131 - 2];
                objArr24[i131 - 2] = null;
                objArr24[i131 - 1] = obj12;
                jArr11[i131 - 2] = j;
                return 0;
            case 101:
                this.unregisterForContextMenu = this.height[this.isOpaque - 1];
                return 0;
            case 102:
                int[] iArr64 = this.decodeByteArray;
                int i132 = this.isOpaque;
                this.isOpaque = i132 + 1;
                iArr64[i132] = 33;
                return 0;
            case 103:
                int[] iArr65 = this.decodeByteArray;
                int i133 = this.isOpaque;
                this.isOpaque = i133 + 1;
                iArr65[i133] = 72;
                return 0;
            case 104:
                int[] iArr66 = this.decodeByteArray;
                int i134 = this.isOpaque;
                this.isOpaque = i134 + 1;
                iArr66[i134] = 1;
                this.isOpaque = i134;
                iArr66[i134 - 1] = iArr66[i134 - 1] + iArr66[i134];
                return 0;
            case 105:
                long[] jArr12 = this.height;
                int i135 = this.isOpaque;
                int i136 = i135 + 1;
                this.isOpaque = i136;
                jArr12[i135] = jArr12[8];
                this.isOpaque = i135 + 2;
                long j2 = jArr12[i135];
                jArr12[i136] = j2;
                Object[] objArr25 = this.Class;
                Object obj13 = objArr25[i135 - 1];
                objArr25[i135 - 1] = null;
                objArr25[i135] = obj13;
                jArr12[i135 - 1] = j2;
                return 0;
            case 106:
                int[] iArr67 = this.decodeByteArray;
                int i137 = this.isOpaque;
                this.isOpaque = i137 + 1;
                iArr67[i137] = 117;
                this.isOpaque = i137;
                iArr67[i137 - 1] = iArr67[i137 - 1] + iArr67[i137];
                this.isOpaque = i137 + 1;
                iArr67[i137] = iArr67[i137 - 1];
                return 0;
            case 107:
                Object[] objArr26 = this.Class;
                int i138 = this.isOpaque;
                this.isOpaque = i138 + 1;
                objArr26[i138] = null;
                int[] iArr68 = this.decodeByteArray;
                Object obj14 = objArr26[i138];
                objArr26[i138] = null;
                iArr68[i138] = ((int[]) obj14).length;
                this.isOpaque = i138;
                objArr26[i138] = null;
                return 0;
            case 108:
                int[] iArr69 = this.decodeByteArray;
                int i139 = this.isOpaque;
                this.isOpaque = i139 + 1;
                iArr69[i139] = 121;
                this.isOpaque = i139;
                iArr69[i139 - 1] = iArr69[i139 - 1] + iArr69[i139];
                return 0;
            case 109:
                int[] iArr70 = this.decodeByteArray;
                int i140 = this.isOpaque;
                this.isOpaque = i140 + 1;
                iArr70[i140] = 58;
                return 0;
            case 110:
                int[] iArr71 = this.decodeByteArray;
                int i141 = this.isOpaque;
                this.isOpaque = i141 + 1;
                iArr71[i141] = 79;
                return 0;
            case 111:
                int[] iArr72 = this.decodeByteArray;
                int i142 = this.isOpaque;
                this.isOpaque = i142 + 1;
                iArr72[i142] = 43;
                this.isOpaque = i142;
                iArr72[i142 - 1] = iArr72[i142 - 1] + iArr72[i142];
                this.isOpaque = i142 + 1;
                iArr72[i142] = iArr72[i142 - 1];
                return 0;
            case 112:
                int[] iArr73 = this.decodeByteArray;
                int i143 = this.isOpaque;
                this.isOpaque = i143 + 1;
                iArr73[i143] = 125;
                return 0;
            case 113:
                int[] iArr74 = this.decodeByteArray;
                int i144 = this.isOpaque;
                this.isOpaque = i144 + 1;
                iArr74[i144] = 109;
                this.isOpaque = i144;
                iArr74[i144 - 1] = iArr74[i144 - 1] + iArr74[i144];
                return 0;
            case 114:
                int[] iArr75 = this.decodeByteArray;
                int i145 = this.isOpaque;
                this.isOpaque = i145 + 1;
                iArr75[i145] = 111;
                return 0;
            case 115:
                int[] iArr76 = this.decodeByteArray;
                int i146 = this.isOpaque;
                this.isOpaque = i146 + 1;
                iArr76[i146] = 7;
                this.isOpaque = i146;
                iArr76[i146 - 1] = iArr76[i146 - 1] + iArr76[i146];
                return 0;
            case 116:
                int[] iArr77 = this.decodeByteArray;
                int i147 = this.isOpaque;
                Object[] objArr27 = this.Class;
                Object obj15 = objArr27[i147 - 1];
                objArr27[i147 - 1] = null;
                iArr77[i147 - 1] = ((int[]) obj15).length;
                int i148 = i147 - 1;
                this.isOpaque = i148;
                objArr27[i148] = null;
                return 0;
            case 117:
                int[] iArr78 = this.decodeByteArray;
                int i149 = this.isOpaque;
                this.isOpaque = i149 + 1;
                iArr78[i149] = 69;
                return 0;
            case 118:
                int[] iArr79 = this.decodeByteArray;
                int i150 = this.isOpaque;
                this.isOpaque = i150 + 1;
                iArr79[i150] = 77;
                return 0;
            case 119:
                int[] iArr80 = this.decodeByteArray;
                int i151 = this.isOpaque;
                this.isOpaque = i151 + 1;
                iArr80[i151] = 93;
                return 0;
            default:
                return i;
        }
    }

    public values(Object obj, int i) {
        int[] iArr = new int[16];
        this.decodeByteArray = iArr;
        this.height = new long[16];
        this.duration = new float[16];
        this.sync = new double[16];
        Object[] objArr = new Object[16];
        this.Class = objArr;
        objArr[7] = obj;
        iArr[8] = i;
        this.isOpaque = 0;
        this.setTime = -1;
    }

    public values(Object obj, long j) {
        this.decodeByteArray = new int[16];
        long[] jArr = new long[16];
        this.height = jArr;
        this.duration = new float[16];
        this.sync = new double[16];
        Object[] objArr = new Object[16];
        this.Class = objArr;
        objArr[7] = obj;
        jArr[8] = j;
        this.isOpaque = 0;
        this.setTime = -1;
    }

    public values(Object obj, Object obj2) {
        this.decodeByteArray = new int[16];
        this.height = new long[16];
        this.duration = new float[16];
        this.sync = new double[16];
        Object[] objArr = new Object[16];
        this.Class = objArr;
        objArr[7] = obj;
        objArr[8] = obj2;
        this.isOpaque = 0;
        this.setTime = -1;
    }

    public values(Object obj) {
        this.decodeByteArray = new int[16];
        this.height = new long[16];
        this.duration = new float[16];
        this.sync = new double[16];
        Object[] objArr = new Object[16];
        this.Class = objArr;
        objArr[7] = obj;
        this.isOpaque = 0;
        this.setTime = -1;
    }
}
