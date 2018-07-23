package com.christopherdro.RNPrint;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.UiThreadUtil;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import android.print.PrinterInfo;
import android.printservice.PrinterDiscoverySession;
import java.util.ArrayList;
import java.util.List;
import android.util.Log;
import android.print.PrinterId;


public class MyPrinterDiscoverySession extends PrinterDiscoverySession {

    @Override
    public void onStartPrinterDiscovery(List<PrinterId> priorityList) {
        Log.d("myprinter", "PrinterDiscoverySession#onStartPrinterDiscovery(priorityList: " + priorityList + ") called");
    }

    @Override
    public void onStopPrinterDiscovery() {
        Log.d("myprinter", "MyPrintService#onStopPrinterDiscovery() called");
    }

    @Override
    public void onValidatePrinters(List<PrinterId> printerIds) {
        Log.d("myprinter", "MyPrintService#onValidatePrinters(printerIds: " + printerIds + ") called");
    }

    @Override
    public void onStartPrinterStateTracking(PrinterId printerId) {
        Log.d("myprinter", "MyPrintService#onStartPrinterStateTracking(printerId: " + printerId + ") called");
    }

    @Override
    public void onStopPrinterStateTracking(PrinterId printerId) {
        Log.d("myprinter", "MyPrintService#onStopPrinterStateTracking(printerId: " + printerId + ") called");
    }

    @Override
    public void onDestroy() {
        Log.d("myprinter", "MyPrintService#onDestroy() called");
    }

}
