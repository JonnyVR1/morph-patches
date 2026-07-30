package p153l;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class dqe0 extends p33 {

    /* JADX INFO: renamed from: A */
    public boolean f90196A;

    /* JADX INFO: renamed from: B */
    public int f90197B;

    /* JADX INFO: renamed from: C */
    public int f90198C;

    /* JADX INFO: renamed from: D */
    public int f90199D;

    /* JADX INFO: renamed from: E */
    public boolean f90200E;

    /* JADX INFO: renamed from: F */
    public boolean f90201F;

    /* JADX INFO: renamed from: G */
    public boolean f90202G;

    /* JADX INFO: renamed from: H */
    public int f90203H;

    /* JADX INFO: renamed from: I */
    public int f90204I;

    /* JADX INFO: renamed from: J */
    public int f90205J;

    /* JADX INFO: renamed from: K */
    public int f90206K;

    /* JADX INFO: renamed from: L */
    public int[] f90207L;

    /* JADX INFO: renamed from: M */
    public e0l0 f90208M;

    /* JADX INFO: renamed from: N */
    public f1e0 f90209N;

    /* JADX INFO: renamed from: O */
    public int f90210O;

    /* JADX INFO: renamed from: a */
    public int f90211a;

    /* JADX INFO: renamed from: b */
    public boolean f90212b;

    /* JADX INFO: renamed from: c */
    public boolean f90213c;

    /* JADX INFO: renamed from: d */
    public boolean f90214d;

    /* JADX INFO: renamed from: e */
    public int f90215e;

    /* JADX INFO: renamed from: f */
    public boolean f90216f;

    /* JADX INFO: renamed from: g */
    public boolean f90217g;

    /* JADX INFO: renamed from: h */
    public boolean f90218h;

    /* JADX INFO: renamed from: i */
    public n45 f90219i;

    /* JADX INFO: renamed from: j */
    public int f90220j;

    /* JADX INFO: renamed from: k */
    public int f90221k;

    /* JADX INFO: renamed from: l */
    public int f90222l;

    /* JADX INFO: renamed from: m */
    public int f90223m;

    /* JADX INFO: renamed from: n */
    public int f90224n;

    /* JADX INFO: renamed from: o */
    public int f90225o;

    /* JADX INFO: renamed from: p */
    public boolean f90226p;

    /* JADX INFO: renamed from: q */
    public int f90227q;

    /* JADX INFO: renamed from: r */
    public long f90228r;

    /* JADX INFO: renamed from: s */
    public boolean f90229s;

    /* JADX INFO: renamed from: t */
    public boolean f90230t;

    /* JADX INFO: renamed from: u */
    public boolean f90231u;

    /* JADX INFO: renamed from: v */
    public boolean f90232v;

    /* JADX INFO: renamed from: w */
    public boolean f90233w;

    /* JADX INFO: renamed from: x */
    public boolean f90234x;

    /* JADX INFO: renamed from: y */
    public int f90235y;

    /* JADX INFO: renamed from: z */
    public int f90236z;

    /* JADX INFO: renamed from: a */
    private static e0l0 m117516a(as3 as3Var) throws IOException {
        e0l0 e0l0Var = new e0l0();
        boolean zM99857f = as3Var.m99857f("VUI: aspect_ratio_info_present_flag");
        e0l0Var.f91476a = zM99857f;
        if (zM99857f) {
            r11 r11VarM179321a = r11.m179321a((int) as3Var.m99858g(8, "VUI: aspect_ratio"));
            e0l0Var.f91500y = r11VarM179321a;
            if (r11VarM179321a == r11.f160748b) {
                e0l0Var.f91477b = (int) as3Var.m99858g(16, "VUI: sar_width");
                e0l0Var.f91478c = (int) as3Var.m99858g(16, "VUI: sar_height");
            }
        }
        boolean zM99857f2 = as3Var.m99857f("VUI: overscan_info_present_flag");
        e0l0Var.f91479d = zM99857f2;
        if (zM99857f2) {
            e0l0Var.f91480e = as3Var.m99857f("VUI: overscan_appropriate_flag");
        }
        boolean zM99857f3 = as3Var.m99857f("VUI: video_signal_type_present_flag");
        e0l0Var.f91481f = zM99857f3;
        if (zM99857f3) {
            e0l0Var.f91482g = (int) as3Var.m99858g(3, "VUI: video_format");
            e0l0Var.f91483h = as3Var.m99857f("VUI: video_full_range_flag");
            boolean zM99857f4 = as3Var.m99857f("VUI: colour_description_present_flag");
            e0l0Var.f91484i = zM99857f4;
            if (zM99857f4) {
                e0l0Var.f91485j = (int) as3Var.m99858g(8, "VUI: colour_primaries");
                e0l0Var.f91486k = (int) as3Var.m99858g(8, "VUI: transfer_characteristics");
                e0l0Var.f91487l = (int) as3Var.m99858g(8, "VUI: matrix_coefficients");
            }
        }
        boolean zM99857f5 = as3Var.m99857f("VUI: chroma_loc_info_present_flag");
        e0l0Var.f91488m = zM99857f5;
        if (zM99857f5) {
            e0l0Var.f91489n = as3Var.m99862l("VUI chroma_sample_loc_type_top_field");
            e0l0Var.f91490o = as3Var.m99862l("VUI chroma_sample_loc_type_bottom_field");
        }
        boolean zM99857f6 = as3Var.m99857f("VUI: timing_info_present_flag");
        e0l0Var.f91491p = zM99857f6;
        if (zM99857f6) {
            e0l0Var.f91492q = (int) as3Var.m99858g(32, "VUI: num_units_in_tick");
            e0l0Var.f91493r = (int) as3Var.m99858g(32, "VUI: time_scale");
            e0l0Var.f91494s = as3Var.m99857f("VUI: fixed_frame_rate_flag");
        }
        boolean zM99857f7 = as3Var.m99857f("VUI: nal_hrd_parameters_present_flag");
        if (zM99857f7) {
            e0l0Var.f91497v = m117518c(as3Var);
        }
        boolean zM99857f8 = as3Var.m99857f("VUI: vcl_hrd_parameters_present_flag");
        if (zM99857f8) {
            e0l0Var.f91498w = m117518c(as3Var);
        }
        if (zM99857f7 || zM99857f8) {
            e0l0Var.f91495t = as3Var.m99857f("VUI: low_delay_hrd_flag");
        }
        e0l0Var.f91496u = as3Var.m99857f("VUI: pic_struct_present_flag");
        if (as3Var.m99857f("VUI: bitstream_restriction_flag")) {
            e0l0.C16675a c16675a = new e0l0.C16675a();
            e0l0Var.f91499x = c16675a;
            c16675a.f91501a = as3Var.m99857f("VUI: motion_vectors_over_pic_boundaries_flag");
            e0l0Var.f91499x.f91502b = as3Var.m99862l("VUI max_bytes_per_pic_denom");
            e0l0Var.f91499x.f91503c = as3Var.m99862l("VUI max_bits_per_mb_denom");
            e0l0Var.f91499x.f91504d = as3Var.m99862l("VUI log2_max_mv_length_horizontal");
            e0l0Var.f91499x.f91505e = as3Var.m99862l("VUI log2_max_mv_length_vertical");
            e0l0Var.f91499x.f91506f = as3Var.m99862l("VUI num_reorder_frames");
            e0l0Var.f91499x.f91507g = as3Var.m99862l("VUI max_dec_frame_buffering");
        }
        return e0l0Var;
    }

    /* JADX INFO: renamed from: b */
    public static dqe0 m117517b(InputStream inputStream) throws IOException {
        as3 as3Var = new as3(inputStream);
        dqe0 dqe0Var = new dqe0();
        dqe0Var.f90227q = (int) as3Var.m99858g(8, "SPS: profile_idc");
        dqe0Var.f90229s = as3Var.m99857f("SPS: constraint_set_0_flag");
        dqe0Var.f90230t = as3Var.m99857f("SPS: constraint_set_1_flag");
        dqe0Var.f90231u = as3Var.m99857f("SPS: constraint_set_2_flag");
        dqe0Var.f90232v = as3Var.m99857f("SPS: constraint_set_3_flag");
        dqe0Var.f90233w = as3Var.m99857f("SPS: constraint_set_4_flag");
        dqe0Var.f90234x = as3Var.m99857f("SPS: constraint_set_5_flag");
        dqe0Var.f90228r = as3Var.m99858g(2, "SPS: reserved_zero_2bits");
        dqe0Var.f90235y = (int) as3Var.m99858g(8, "SPS: level_idc");
        dqe0Var.f90236z = as3Var.m99862l("SPS: seq_parameter_set_id");
        int i = dqe0Var.f90227q;
        if (i == 100 || i == 110 || i == 122 || i == 144) {
            n45 n45VarM161537a = n45.m161537a(as3Var.m99862l("SPS: chroma_format_idc"));
            dqe0Var.f90219i = n45VarM161537a;
            if (n45VarM161537a == n45.f140185g) {
                dqe0Var.f90196A = as3Var.m99857f("SPS: residual_color_transform_flag");
            }
            dqe0Var.f90224n = as3Var.m99862l("SPS: bit_depth_luma_minus8");
            dqe0Var.f90225o = as3Var.m99862l("SPS: bit_depth_chroma_minus8");
            dqe0Var.f90226p = as3Var.m99857f("SPS: qpprime_y_zero_transform_bypass_flag");
            if (as3Var.m99857f("SPS: seq_scaling_matrix_present_lag")) {
                m117519d(as3Var, dqe0Var);
            }
        } else {
            dqe0Var.f90219i = n45.f140183e;
        }
        dqe0Var.f90220j = as3Var.m99862l("SPS: log2_max_frame_num_minus4");
        int iM99862l = as3Var.m99862l("SPS: pic_order_cnt_type");
        dqe0Var.f90211a = iM99862l;
        if (iM99862l == 0) {
            dqe0Var.f90221k = as3Var.m99862l("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (iM99862l == 1) {
            dqe0Var.f90213c = as3Var.m99857f("SPS: delta_pic_order_always_zero_flag");
            dqe0Var.f90197B = as3Var.m99859h("SPS: offset_for_non_ref_pic");
            dqe0Var.f90198C = as3Var.m99859h("SPS: offset_for_top_to_bottom_field");
            int iM99862l2 = as3Var.m99862l("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            dqe0Var.f90210O = iM99862l2;
            dqe0Var.f90207L = new int[iM99862l2];
            for (int i2 = 0; i2 < dqe0Var.f90210O; i2++) {
                dqe0Var.f90207L[i2] = as3Var.m99859h("SPS: offsetForRefFrame [" + i2 + Constants.AES_SUFFIX);
            }
        }
        dqe0Var.f90199D = as3Var.m99862l("SPS: num_ref_frames");
        dqe0Var.f90200E = as3Var.m99857f("SPS: gaps_in_frame_num_value_allowed_flag");
        dqe0Var.f90223m = as3Var.m99862l("SPS: pic_width_in_mbs_minus1");
        dqe0Var.f90222l = as3Var.m99862l("SPS: pic_height_in_map_units_minus1");
        boolean zM99857f = as3Var.m99857f("SPS: frame_mbs_only_flag");
        dqe0Var.f90201F = zM99857f;
        if (!zM99857f) {
            dqe0Var.f90217g = as3Var.m99857f("SPS: mb_adaptive_frame_field_flag");
        }
        dqe0Var.f90218h = as3Var.m99857f("SPS: direct_8x8_inference_flag");
        boolean zM99857f2 = as3Var.m99857f("SPS: frame_cropping_flag");
        dqe0Var.f90202G = zM99857f2;
        if (zM99857f2) {
            dqe0Var.f90203H = as3Var.m99862l("SPS: frame_crop_left_offset");
            dqe0Var.f90204I = as3Var.m99862l("SPS: frame_crop_right_offset");
            dqe0Var.f90205J = as3Var.m99862l("SPS: frame_crop_top_offset");
            dqe0Var.f90206K = as3Var.m99862l("SPS: frame_crop_bottom_offset");
        }
        if (as3Var.m99857f("SPS: vui_parameters_present_flag")) {
            dqe0Var.f90208M = m117516a(as3Var);
        }
        as3Var.m99860i();
        return dqe0Var;
    }

    /* JADX INFO: renamed from: c */
    private static fxk m117518c(as3 as3Var) throws IOException {
        fxk fxkVar = new fxk();
        fxkVar.f101262a = as3Var.m99862l("SPS: cpb_cnt_minus1");
        fxkVar.f101263b = (int) as3Var.m99858g(4, "HRD: bit_rate_scale");
        fxkVar.f101264c = (int) as3Var.m99858g(4, "HRD: cpb_size_scale");
        int i = fxkVar.f101262a;
        fxkVar.f101265d = new int[i + 1];
        fxkVar.f101266e = new int[i + 1];
        fxkVar.f101267f = new boolean[i + 1];
        for (int i2 = 0; i2 <= fxkVar.f101262a; i2++) {
            fxkVar.f101265d[i2] = as3Var.m99862l("HRD: bit_rate_value_minus1");
            fxkVar.f101266e[i2] = as3Var.m99862l("HRD: cpb_size_value_minus1");
            fxkVar.f101267f[i2] = as3Var.m99857f("HRD: cbr_flag");
        }
        fxkVar.f101268g = (int) as3Var.m99858g(5, "HRD: initial_cpb_removal_delay_length_minus1");
        fxkVar.f101269h = (int) as3Var.m99858g(5, "HRD: cpb_removal_delay_length_minus1");
        fxkVar.f101270i = (int) as3Var.m99858g(5, "HRD: dpb_output_delay_length_minus1");
        fxkVar.f101271j = (int) as3Var.m99858g(5, "HRD: time_offset_length");
        return fxkVar;
    }

    /* JADX INFO: renamed from: d */
    private static void m117519d(as3 as3Var, dqe0 dqe0Var) throws IOException {
        dqe0Var.f90209N = new f1e0();
        for (int i = 0; i < 8; i++) {
            if (as3Var.m99857f("SPS: seqScalingListPresentFlag")) {
                f1e0 f1e0Var = dqe0Var.f90209N;
                e1e0[] e1e0VarArr = new e1e0[8];
                f1e0Var.f96784a = e1e0VarArr;
                e1e0[] e1e0VarArr2 = new e1e0[8];
                f1e0Var.f96785b = e1e0VarArr2;
                if (i < 6) {
                    e1e0VarArr[i] = e1e0.m118970a(as3Var, 16);
                } else {
                    e1e0VarArr2[i - 6] = e1e0.m118970a(as3Var, 64);
                }
            }
        }
    }

    public String toString() {
        return "SeqParameterSet{ \n        pic_order_cnt_type=" + this.f90211a + ", \n        field_pic_flag=" + this.f90212b + ", \n        delta_pic_order_always_zero_flag=" + this.f90213c + ", \n        weighted_pred_flag=" + this.f90214d + ", \n        weighted_bipred_idc=" + this.f90215e + ", \n        entropy_coding_mode_flag=" + this.f90216f + ", \n        mb_adaptive_frame_field_flag=" + this.f90217g + ", \n        direct_8x8_inference_flag=" + this.f90218h + ", \n        chroma_format_idc=" + this.f90219i + ", \n        log2_max_frame_num_minus4=" + this.f90220j + ", \n        log2_max_pic_order_cnt_lsb_minus4=" + this.f90221k + ", \n        pic_height_in_map_units_minus1=" + this.f90222l + ", \n        pic_width_in_mbs_minus1=" + this.f90223m + ", \n        bit_depth_luma_minus8=" + this.f90224n + ", \n        bit_depth_chroma_minus8=" + this.f90225o + ", \n        qpprime_y_zero_transform_bypass_flag=" + this.f90226p + ", \n        profile_idc=" + this.f90227q + ", \n        constraint_set_0_flag=" + this.f90229s + ", \n        constraint_set_1_flag=" + this.f90230t + ", \n        constraint_set_2_flag=" + this.f90231u + ", \n        constraint_set_3_flag=" + this.f90232v + ", \n        constraint_set_4_flag=" + this.f90233w + ", \n        constraint_set_5_flag=" + this.f90234x + ", \n        level_idc=" + this.f90235y + ", \n        seq_parameter_set_id=" + this.f90236z + ", \n        residual_color_transform_flag=" + this.f90196A + ", \n        offset_for_non_ref_pic=" + this.f90197B + ", \n        offset_for_top_to_bottom_field=" + this.f90198C + ", \n        num_ref_frames=" + this.f90199D + ", \n        gaps_in_frame_num_value_allowed_flag=" + this.f90200E + ", \n        frame_mbs_only_flag=" + this.f90201F + ", \n        frame_cropping_flag=" + this.f90202G + ", \n        frame_crop_left_offset=" + this.f90203H + ", \n        frame_crop_right_offset=" + this.f90204I + ", \n        frame_crop_top_offset=" + this.f90205J + ", \n        frame_crop_bottom_offset=" + this.f90206K + ", \n        offsetForRefFrame=" + this.f90207L + ", \n        vuiParams=" + this.f90208M + ", \n        scalingMatrix=" + this.f90209N + ", \n        num_ref_frames_in_pic_order_cnt_cycle=" + this.f90210O + '}';
    }
}
