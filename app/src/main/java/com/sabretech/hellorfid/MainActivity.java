package com.sabretech.hellorfid;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.zebra.rfid.api3.*;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static Readers readers;
    private static ArrayList availableRFIDReaderList;
    private static ReaderDevice readerDevice;
    private static RFIDReader reader;
    private static String TAG = "DEMO";
    TextView textView;
    //private EventHandler eventHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        if (readers == null) {
            readers = new Readers(this, ENUM_TRANSPORT.ALL);
        }
    }

//    private void GetAndConnectedReader() {
//        try {
//            if (readers != null) {
//                if (readers.GetAvailableRFIDReaderList() != null) {
//                    availableRFIDReaderList = readers.GetAvailableRFIDReaderList();
//                    if (availableRFIDReaderList.size() != 0) {
//                        // get first reader from list
//                        ReaderDevice readerDevice = (ReaderDevice) availableRFIDReaderList.get(0);
//                        reader = readerDevice.getRFIDReader();
//                        if (!reader.isConnected()) {
//                            // Establish connection to the RFID Reader
//                            reader.connect();
//                            //ConfigureReader();
//                        }
//                    }
//                }
//            }
//        } catch (InvalidUsageException e) {
//            e.printStackTrace();
//        } catch (OperationFailureException e) {
//            e.printStackTrace();
//            Log.d(TAG, "OperationFailureException " + e.getVendorMessage());
//        }
//    }
}