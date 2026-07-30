package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.nio.charset.Charset;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private final ReportQueue reportQueue;
    private final Transformer<CrashlyticsReport, byte[]> transportTransform;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final Transformer<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = new Transformer() { // from class: l.u6c
        @Override // com.google.android.datatransport.Transformer
        public final Object apply(Object obj) {
            return DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, Transformer<CrashlyticsReport, byte[]> transformer) {
        this.reportQueue = reportQueue;
        this.transportTransform = transformer;
    }

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        TransportRuntime.initialize(context);
        TransportFactory transportFactoryNewFactory = TransportRuntime.getInstance().newFactory(new CCTDestination(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
        Encoding encodingM9346of = Encoding.m9346of("json");
        Transformer<CrashlyticsReport, byte[]> transformer = DEFAULT_TRANSFORM;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(transportFactoryNewFactory.getTransport(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, encodingM9346of, transformer), settingsProvider.getSettingsSync(), onDemandCounter), transformer);
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            wg3.m206174a("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @NonNull
    public Task<CrashlyticsReportWithSessionId> enqueueReport(@NonNull CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, z).m186939a();
    }
}
